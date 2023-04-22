/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.simulator.system;
import java.sql.*;

/**
 *
 * @author channappa
 */
public class Conn {
    
    Connection c = null;
    
    Statement s;
    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3307/bankManagementSystem", "root", "");
            s = c.createStatement();
            
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
