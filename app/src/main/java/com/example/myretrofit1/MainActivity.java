package com.example.myretrofit1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myretrofit1.api.ApiService;
import com.example.myretrofit1.model.user.result_user;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private ImageView imgView  ;
    private Button btnImg ;

    private TextView tvTerm ;
    private TextView tvsource ;
    private TextView tvPrice ;
    private Button   btnCallApi ;
    String realpath = "" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTerm = findViewById(R.id.tv_terms) ;
        tvsource = findViewById(R.id.tv_source) ;
        tvPrice = findViewById(R.id.tv_price) ;

        btnCallApi = findViewById(R.id.btn_callApi) ;
        btnCallApi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickCallApi() ;
            }
        });
        anhxa();
        imgView.setOnClickListener((v -> {
            Intent intent = new Intent(Intent.ACTION_PICK) ;
            intent.setType("image/*") ;
            startActivityForResult(intent, 123);
        }));

        btnImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                File file = new File(realpath) ;
                String file_path = file.getAbsolutePath() ;
                String[] mangtenfile = file_path.split("\\.") ;

                file_path = mangtenfile[0] + System.currentTimeMillis() +"." + mangtenfile[1] ;
                RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"), file) ;
                MultipartBody.Part body = MultipartBody.Part.createFormData("uploaded_file", file_path, requestBody) ;
                Toast.makeText(getApplicationContext(), "hhi" + file_path, Toast.LENGTH_LONG).show();

                ApiService.apiService.UploadPhot(body).enqueue(new Callback<String>() {
                    @Override
                    public void onResponse(Call<String> call, Response<String> response) {
                        if(response != null){
                            String mess = response.body() ;
                            Log.d("BBB", mess)  ;
                            Toast.makeText(getApplicationContext(), mess, Toast.LENGTH_LONG).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<String> call, Throwable t) {
                        Log.d("BBB", t.getMessage()) ;
                        Toast.makeText(getApplicationContext(), "loic ket noi " + t.getMessage() + t.getStackTrace(), Toast.LENGTH_SHORT).show();
                    }
                });
                Log.d("BBB", file_path) ;

            }
        });
    }

    private void ClickCallApi() {


        // // api : http://apilayer.net/api/live?access_key=843d4d34ae72b3882e3db642c51e28e6&currencies=VND&source=USD&format=1
        ApiService.apiService.getUserNameApi("cvduc.19it1@vku.udn.vn", "007")
            .enqueue(new Callback<result_user>() {
                @Override
                public void onResponse(Call<result_user> call, Response<result_user> response) {
                    Toast.makeText(MainActivity.this, "Call api Success" , Toast.LENGTH_LONG).show();

                    result_user currency = response.body() ;
                    if(currency != null ){
                        tvsource.setText(currency.getStatus() + " : ");
                        tvTerm.setText(currency.getData().getTen() + ": ");
                    }
                }

                @Override
                public void onFailure(Call<result_user> call, Throwable t) {
                    Toast.makeText(MainActivity.this , "Call api error" , Toast.LENGTH_LONG).show();
                    tvsource.setText("đéo ");

                }
            });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if ( requestCode == 123  && resultCode == RESULT_OK  && data != null){
            Uri uri = data.getData() ;
            realpath = getRealPathFromUri(uri) ;
            try{
                InputStream inputStream = getContentResolver().openInputStream(uri) ;
                Bitmap bitmap = BitmapFactory.decodeStream(inputStream) ;
                imgView.setImageBitmap(bitmap);
            } catch (FileNotFoundException e ){
                e.printStackTrace();
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
    private void anhxa(){
        btnImg = findViewById(R.id.button) ;
        imgView = findViewById(R.id.imageView) ;
    }
    public String getRealPathFromUri ( Uri contentUri){
        String path = null  ;
        String[] proj = {MediaStore.MediaColumns.DATA}  ;
        Cursor cursor = getContentResolver().query(contentUri, proj , null , null, null) ;
        if( cursor.moveToFirst()){
            int column_index = cursor.getColumnIndexOrThrow(MediaStore.MediaColumns.DATA);
            path = cursor.getString(column_index) ;
        }
        cursor.close();
        return path ;
    }
}