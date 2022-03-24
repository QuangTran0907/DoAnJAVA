/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DBContext;
import entity.CTSize;
import entity.Hang;
import entity.Media;
import entity.SanPham;
import entity.Size;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.print.attribute.standard.Sides;

/**
 *
 * @author Tran Huu Quang
 */
public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<SanPham> getAllProduct() {
        List<SanPham> list = new ArrayList<>();
        String query = "select * from SanPham";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) 
                {
                    list.add(new SanPham(rs.getInt(1),
                            rs.getString(2), 
                            rs.getString(3), 
                            rs.getString(4), 
                            rs.getString(5), 
                            rs.getInt(6), 
                            rs.getInt(7), 
                            rs.getDouble(8), 
                            rs.getString(9)));
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
        
    }
    public List<Hang> getHangs()
            {
                List<Hang> list = new ArrayList<>();
                String query = "select * from Hang";
                try {
                    conn = new DBContext().getConnection();//mo ket noi voi sql
                    ps = conn.prepareStatement(query);
                    rs = ps.executeQuery();
                    while (rs.next()) {                        
                        list.add(new Hang(rs.getInt(1),
                                rs.getString(2),
                                rs.getString(3),
                                rs.getString(4)));
                    }
                    
                } catch (Exception e) {
                }
                return list;
            }
    public List<Media> getMedias()
            {
                List<Media> list = new ArrayList<>();
                String query = "select * from Media";
                try {
                    conn = new DBContext().getConnection();//mo ket noi voi sql
                    ps = conn.prepareStatement(query);
                    rs = ps.executeQuery();
                    while (rs.next()) {                        
                        list.add(new Media(rs.getInt(1), rs.getString(2), rs.getInt(3)));
                    }
                    
                } catch (Exception e) {
                }
                return list;
            }
    public List<Size> getSize()
            {
                List<Size> list = new ArrayList<>();
                String query = "select * from SizeGiay";
                try {
                    conn = new DBContext().getConnection();//mo ket noi voi sql
                    ps = conn.prepareStatement(query);
                    rs = ps.executeQuery();
                    while (rs.next()) {                        
                        list.add(new Size(rs.getInt(1), rs.getString(2)));
                    }
                    
                } catch (Exception e) {
                }
                return list;
            }
     public List<CTSize> getCTSizes()
            {
                List<CTSize> list = new ArrayList<>();
                String query = "select * from CTSizeGiay";
                try {
                    conn = new DBContext().getConnection();//mo ket noi voi sql
                    ps = conn.prepareStatement(query);
                    rs = ps.executeQuery();
                    while (rs.next()) {                        
                        list.add(new CTSize(rs.getInt(1), rs.getInt(2),rs.getInt(3)));
                    }
                    
                } catch (Exception e) {
                }
                return list;
            }
    public static void main(String[] args) {
        DAO x = new DAO();
        List<CTSize> list = x.getCTSizes();
        for (CTSize o : list) {
            System.out.println(o);
        }
           }
   
}
