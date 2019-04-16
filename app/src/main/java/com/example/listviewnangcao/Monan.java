package com.example.listviewnangcao;

public class Monan {
    private String ten;
    private Integer gia;
    private Integer id;
    private Integer hinhanh;

    //tao contructor
    public Monan(String ten, Integer gia, Integer id, Integer hinhanh) {
        this.ten = ten;
        this.gia = gia;
        this.id = id;
        this.hinhanh = hinhanh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(Integer hinhanh) {
        this.hinhanh = hinhanh;
    }
}
