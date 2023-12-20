/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ServerApp;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author win10
 */

public class Db {
    public static Connection c;
    public static Statement s;
    static{
        try{
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/wechatserver","root","unnati");
            s=c.createStatement();

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        
        }
    }
    
}
