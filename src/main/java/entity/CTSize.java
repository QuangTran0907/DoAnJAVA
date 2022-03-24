/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Tran Huu Quang
 */
public class CTSize {
    private int idSize;
    private int idSanPham;
        private int soLuong;

    public CTSize(){
        
    }

    public CTSize(int idSize, int idSanPham, int soLuong) {
        this.idSize = idSize;
        this.idSanPham = idSanPham;
        this.soLuong = soLuong;
    }

    public int getIdSize() {
        return idSize;
    }

    public void setIdSize(int idSize) {
        this.idSize = idSize;
    }

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(int idSanPham) {
        this.idSanPham = idSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "CTSize{" + "idSize=" + idSize + ", idSanPham=" + idSanPham + ", soLuong=" + soLuong + '}';
    }

   
   


    
    
   
}
    