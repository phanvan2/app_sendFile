package com.example.myretrofit1.model.danhmuc;


public class Danhmuc {
    private int id ;
    private int idUser ;
    private String tenDanhmuc ;
    private String img ;

    public Danhmuc(int id, int idUser, String tenDanhmuc, String img) {
        this.id = id;
        this.idUser = idUser;
        this.tenDanhmuc = tenDanhmuc;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getTenDanhmuc() {
        return tenDanhmuc;
    }

    public void setTenDanhmuc(String tenDanhmuc) {
        this.tenDanhmuc = tenDanhmuc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
