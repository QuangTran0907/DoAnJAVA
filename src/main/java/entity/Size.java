/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Tran Huu Quang
 */
public class Size {
    private int idSize;
    private String maSize;
    public Size(){
        
    }
   
    public Size(int idSize, String maSize) {
        this.idSize = idSize;
        this.maSize = maSize;
    }

    public int getIdSize() {
        return idSize;
    }

    public void setIdSize(int idSize) {
        this.idSize = idSize;
    }

    public String getMaSize() {
        return maSize;
    }

    public void setMaSize(String maSize) {
        this.maSize = maSize;
    }

    @Override
    public String toString() {
        return "Size{" + "idSize=" + idSize + ", maSize=" + maSize + '}';
    }
    

   


    
    
   
}
    