package com.example.myretrofit1.model.user;

import java.util.List;

public class result_user {
    private int status ;
    private String error ;
    private User data;

    public result_user(int status, String error, User data) {
        this.status = status;
        this.error = error;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public User getData() {
        return data;
    }

    public void setData(User data) {
        this.data = data;
    }
}
