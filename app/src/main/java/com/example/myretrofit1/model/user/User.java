package com.example.myretrofit1.model.user;

public class User {
    private String id ;
    private String ten;
    private String email  ;
    private String  quyen ;
    private String trangthai ;
    private String img_user;
    private String sdt ;
    private String ho_va_ten ;
    private String about ;
    private String gioi_tinh ;
    private String dia_chi ;

    public User(String id, String ten, String email, String quyen, String trangthai, String img_user, String sdt , String ho_va_ten, String about, String gioi_tinh, String dia_chi) {
        this.id = id;
        this.ten = ten;
        this.email = email;
        this.quyen = quyen;
        this.trangthai = trangthai ;
        this.img_user = img_user;
        this.sdt = sdt ;
        this.ho_va_ten = ho_va_ten;
        this.about = about;
        this.gioi_tinh = gioi_tinh;
        this.dia_chi = dia_chi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQuyen() {
        return quyen;
    }

    public void setQuyen(String quyen) {
        this.quyen = quyen;
    }

    public String getImg_user() {
        return img_user;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setImg_user(String img_user) {
        this.img_user = img_user;
    }

    public String getHo_va_ten() {
        return ho_va_ten;
    }

    public void setHo_va_ten(String ho_va_ten) {
        this.ho_va_ten = ho_va_ten;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(String gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }
}
