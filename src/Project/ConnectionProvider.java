/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Arpana Maharjan
 */
public class ConnectionProvider {
    static Connection con ;
    static Statement stmt ;
    static ResultSet rs ;
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
           
            String url = "jdbc:mysql://localhost:3306/Login";
            con = DriverManager.getConnection(url,"root","");
            
        }catch(Exception e){
            return null;
        }
        return null;
    }
}

