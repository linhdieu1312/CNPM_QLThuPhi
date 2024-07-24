/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 84357
 */
public class Connector {
     public static void main(String args[]){
        Connection con=null;
        try{
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cnpm","root","");
            if(con!=null){
                System.err.println("Kết nối thành công");
            }
            
        }catch(SQLException e){
            
        }
    }
}
