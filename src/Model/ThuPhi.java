/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author 84357
 */
public class ThuPhi implements Serializable{
    private String LoaiPhi;
    private String MaHo;
    private int NhanKhau;
    private double SoTien;
    private String ThoiGianNop;
    
    public ThuPhi(String LoaiPhi, String MaHo, int NhanKhau, double SoTien,String ThoiGianNop){
        this.LoaiPhi=LoaiPhi;
        this.MaHo=MaHo;
        this.NhanKhau=NhanKhau;
        this.SoTien=SoTien;
        this.ThoiGianNop=ThoiGianNop;
    }

    public ThuPhi() {
        
    }
    

    
    public String ToString(){
        return LoaiPhi+";"+MaHo+";"+NhanKhau+";"+SoTien+";"+ThoiGianNop;
    }

    public String getLoaiPhi() {
        return LoaiPhi;
    }

    public void setLoaiPhi(String LoaiPhi) {
        this.LoaiPhi = LoaiPhi;
    }

    public String getMaHo() {
        return MaHo;
    }

    public void setMaHo(String MaHo) {
        this.MaHo = MaHo;
    }

    public int getNhanKhau() {
        return NhanKhau;
    }

    public void setNhanKhau(int NhanKhau) {
        this.NhanKhau = NhanKhau;
    }

    public double getSoTien() {
        return SoTien;
    }

    public void setSoTien(double SoTien) {
        this.SoTien = SoTien;
    }

    public String getThoiGianNop() {
        return ThoiGianNop;
    }

    public void setThoiGianNop(String ThoiGianNop) {
        this.ThoiGianNop = ThoiGianNop;
    }

    
}
