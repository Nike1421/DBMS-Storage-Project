/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OM NAIK
 */
import java.sql.*;
import javax.swing.*;
public class SQLClass {
    Connection conn = null;
    public static Connection dbConnector()
    {
        try{
            //Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\Netbeans\\Projects\\dbmsproject\\src\\main\\java\\databaseTrial.db", "omnaik", "omnaik1234");
            //JOptionPane.showMessageDialog(null, "Connection Successful");
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null; 
        }
    }
}
