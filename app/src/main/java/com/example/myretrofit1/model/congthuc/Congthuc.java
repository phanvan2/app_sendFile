package com.example.myretrofit1.model.congthuc;

public class Congthuc {
    private int id  ;
    private int  idDanhmuc  ;
    private int idUser ;
    private String ten_monAn ;
    private String ngayDang ;
    private String moTa ;
    private String img ;
    private String step  ;
    private String nguyenLieu ;
    private String trangThai ;

    public Congthuc(int id, int idDanhmuc, int idUser, String ten_monAn, String ngayDang, String moTa, String img, String step, String nguyenLieu, String trangThai) {
        this.id = id;
        this.idDanhmuc = idDanhmuc;
        this.idUser = idUser;
        this.ten_monAn = ten_monAn;
        this.ngayDang = ngayDang;
        this.moTa = moTa;
        this.img = img;
        this.step = step;
        this.nguyenLieu = nguyenLieu;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdDanhmuc() {
        return idDanhmuc;
    }

    public void setIdDanhmuc(int idDanhmuc) {
        this.idDanhmuc = idDanhmuc;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getTen_monAn() {
        return ten_monAn;
    }

    public void setTen_monAn(String ten_monAn) {
        this.ten_monAn = ten_monAn;
    }

    public String getNgayDang() {
        return ngayDang;
    }

    public void setNgayDang(String ngayDang) {
        this.ngayDang = ngayDang;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getNguyenLieu() {
        return nguyenLieu;
    }

    public void setNguyenLieu(String nguyenLieu) {
        this.nguyenLieu = nguyenLieu;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
