package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnector {
	public static Connection connect() {
        Connection conn = null;
        try {
            
            String url = "jdbc:sqlite:C:/users/shuvrok/Exam.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return conn;
    }
	
	public static Boolean doAuthenticate(String UserName, String password) {
		
		String sql = "SELECT id, UserName,  password FROM Login where UserName = ? and password=?";
		Connection conn = null;
		try {
			
			conn = connect();
			PreparedStatement pstmt  = conn.prepareStatement(sql);
					
			pstmt.setString(1, UserName);
			
			pstmt.setString(2, password);
			
			ResultSet rs  = pstmt.executeQuery();
			
			while (rs.next()) {
                System.out.println(rs.getInt("id") +  "\t" + 
                                   rs.getString("UserName") + "\t" +
                                   rs.getString("password"));
                return true;
            }        
	          
	    } 
		catch (SQLException e) {
	            System.out.println(e.getMessage());
	    }
		finally
		{
			if(conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		return false;
	}
	
public static Boolean AddRecord(String username, String password) {
		
	 String sql = "INSERT INTO Login(UserName,password) VALUES(?,?)";
		Connection conn = null;
		try {
			
			conn = connect();
			PreparedStatement pstmt  = conn.prepareStatement(sql);
					
			pstmt.setString(1, username);
			
			pstmt.setString(2, password);
			
			ResultSet rs  = pstmt.executeQuery();
			
			while (rs.next()) {
                System.out.println(rs.getInt("id") +  "\t" + 
                                   rs.getString("username") + "\t" +
                                   rs.getString("password"));
                return true;
            }        
	          
	    } 
		catch (SQLException e) {
	            System.out.println(e.getMessage());
	    }
		finally
		{
			if(conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		return false;
	}

}
