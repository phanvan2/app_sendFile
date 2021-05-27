package com.example.myretrofit1.model.danhmuc;



import androidx.core.app.NotificationCompat;

import com.example.myretrofit1.model.danhmuc.Danhmuc;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class result_danhmuc {
    @SerializedName("ok")
    private Boolean ok ;
    @SerializedName("error")
    private String error  ;
    @SerializedName("data")
    private List<Danhmuc> data ;

    public result_danhmuc(Boolean ok, String error,  List<Danhmuc> data) {
        this.ok = ok;
        this.error = error;
        this.data = data;
    }

    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<Danhmuc> getData() {
        return data;
    }

    public void setData(List<Danhmuc> data) {
        this.data = data;
    }
    public String toData(){
        return " "+ data ;
    }
}
