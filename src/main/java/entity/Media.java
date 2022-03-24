/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Tran Huu Quang
 */
public class Media {
    private int idMedia;
    private String link_Media;
    private int idSanPham;
    public Media(){
        
    }

    public Media(int idMedia, String link_Media, int idSanPham) {
        this.idMedia = idMedia;
        this.link_Media = link_Media;
        this.idSanPham = idSanPham;
    }

    public int getIdMedia() {
        return idMedia;
    }

    public void setIdMedia(int idMedia) {
        this.idMedia = idMedia;
    }

    public String getLink_Media() {
        return link_Media;
    }

    public void setLink_Media(String link_Media) {
        this.link_Media = link_Media;
    }

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(int idSanPham) {
        this.idSanPham = idSanPham;
    }

    @Override
    public String toString() {
        return "Media{" + "idMedia=" + idMedia + ", link_Media=" + link_Media + ", idSanPham=" + idSanPham + '}';
    }
    
    
   
}
    