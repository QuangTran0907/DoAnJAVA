/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Tran Huu Quang
 */
public class SanPham {
    public int idSanPham;
    private String tenSanPham;
    private String mauSac;
    public String hinhAnh;
    private String moTa;
    private int idLoai;
    private int idHang;
    private double gia;
    private String namPhatHanh;
    
    public SanPham()
    {
    }

    public SanPham(int idSanPham, String tenSanPham, String mauSac, String hinhAnh, String moTa, int idLoai, int idHang, double gia, String namPhatHanh) {
        this.idSanPham = idSanPham;
        this.tenSanPham = tenSanPham;
        this.mauSac = mauSac;
        this.hinhAnh = hinhAnh;
        this.moTa = moTa;
        this.idLoai = idLoai;
        this.idHang = idHang;
        this.gia = gia;
        this.namPhatHanh = namPhatHanh;
    }

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(int idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }


    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getIdLoai() {
        return idLoai;
    }

    public void setIdLoai(int idLoai) {
        this.idLoai = idLoai;
    }

    public int getIdHang() {
        return idHang;
    }

    public void setIdHang(int idHang) {
        this.idHang = idHang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getNamPhatHanh() {
        return namPhatHanh;
    }

    public void setNamPhatHanh(String namPhatHanh) {
        this.namPhatHanh = namPhatHanh;
    }

    @Override
    public String toString() {
        return "SanPham{" + "idSanPham=" + idSanPham + ", tenSanPham=" + tenSanPham + ", mauSac=" + mauSac + ", hinhAnh=" + hinhAnh + ", moTa=" + moTa + ", idLoai=" + idLoai + ", idHnag=" + idHang + ", Gia=" + gia + ", namPhatHanh=" + namPhatHanh + '}';
    }
    
    
}
