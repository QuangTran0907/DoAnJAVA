/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Tran Huu Quang
 */
public class Hang {
    private int idHang;
    private String tenHang;
    private String loGo;
    private String moTa;
    public Hang(){
        
    }

    public int getIdHang() {
        return idHang;
    }

    public void setIdHang(int idHang) {
        this.idHang = idHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getLoGo() {
        return loGo;
    }

    public void setLoGo(String loGo) {
        this.loGo = loGo;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    public Hang(int idHang, String tenHang, String loGo, String moTa) {
        this.idHang = idHang;
        this.tenHang = tenHang;
        this.loGo = loGo;
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "Hang{" + "idHang=" + idHang + ", tenHang=" + tenHang + ", loGo=" + loGo + ", moTa=" + moTa + '}';
    }
}
