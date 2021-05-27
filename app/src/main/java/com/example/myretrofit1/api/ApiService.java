package com.example.myretrofit1.api;

import android.support.v4.os.IResultReceiver;

import com.example.myretrofit1.model.Currency;
import com.example.myretrofit1.model.Danhmuc;
import com.example.myretrofit1.model.danhmuc.result_danhmuc;
import com.example.myretrofit1.model.result;
import com.example.myretrofit1.model.user.result_user;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    // api : http://apilayer.net/api/live?access_key=843d4d34ae72b3882e3db642c51e28e6&currencies=VND&source=USD&format=1
    Gson gson = new GsonBuilder()
            .setLenient()
            .create();
    ApiService  apiService = new Retrofit.Builder()
            .baseUrl("http://192.168.1.148/api/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(ApiService.class) ;
    @GET("foodRecipes/getDanhMuc.php")
    Call<result_danhmuc> getDanhmucApi();

    @GET("foodRecipes/getUsername.php")
    Call<result_user> getUserNameApi(@Query("email") String email , @Query("password") String password ) ;

    @Multipart
    @POST("foodRecipes/uploadFile.php")
    Call<String> UploadPhot(@Part MultipartBody.Part photo) ;



}

