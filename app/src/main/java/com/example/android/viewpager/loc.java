package com.example.android.viewpager;

public class loc {
    private String address;
    private String name;
    private int imgid;
    private String phone;
    private String disctription;

    public loc(String address, String name, String phone, int imgid, String disctription) {
        this.address = address;
        this.name = name;
        this.imgid = imgid;
        this.phone = phone;
        this.disctription = disctription;
    }

    public loc(String address, String name, String phone) {
        this.address = address;
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getImgid() {
        return imgid;
    }

    public String getDisctription() {
        return disctription;
    }
}
