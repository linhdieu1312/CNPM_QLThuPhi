/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ThuPhi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author 84357
 */
public class DAO {
    private Connection con;
    public DAO(){
        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/cnpm","root","");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public boolean addThuPhi(ThuPhi s){
        String sql="INSERT INTO thuphi(LoaiPhi,MaHo,NhanKhau,ThoiGian,SoTien) "+"VALUES(?,?,?,?,?)";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, s.getLoaiPhi());
            ps.setString(2, s.getMaHo());
            ps.setInt(3, s.getNhanKhau());
            ps.setString(4,s.getThoiGianNop());
            ps.setDouble(5,s.getSoTien());
            
            return ps.executeUpdate()>0;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public ArrayList<ThuPhi> getListThuPhi(){
        ArrayList<ThuPhi> list=new ArrayList<>();
        String sql= "SELECT * FROM thuphi";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                ThuPhi s=new ThuPhi();
                s.setLoaiPhi(rs.getString("LoaiPhi"));
                s.setMaHo(rs.getString("MaHo"));
                s.setNhanKhau(rs.getInt("NhanKhau"));
                s.setThoiGianNop(rs.getString("ThoiGian"));
                s.setSoTien(rs.getDouble("SoTien"));
                
                list.add(s);
            }
        }catch(Exception e){
            
        }
        return list;
    }
    public static void main(String[] args){
        new DAO();
    }
}
