/*
 * To change this
license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UpdateDeleteReservation {
         
    // Method to update a Reservation from the database
    public static boolean updateReservation(String reservationID, String name, 
            String contactNumber, String email, String DoR, String NoG)
            throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        boolean success = false;

        try {
            conn = DBConnection.getConnection();
            
            String query = "UPDATE reservations SET name=?, contactNumber=?, Email=?, DoR=?, NoG=? WHERE reservationID=?";
            
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, name);
            pstmt.setString(2, contactNumber);
            pstmt.setString(3, email);
            pstmt.setString(4, DoR);
            pstmt.setString(5, NoG);
            pstmt.setString(6, reservationID);
            
            int rowsAffected = pstmt.executeUpdate();
            
            if (rowsAffected > 0) {
                success = true;
            }
        } finally {
            if (pstmt != null) {
                pstmt.close();
            }
        }
        
        return success;
    }
    
        // Method to delete a Reservation from the database
    public static boolean deletedeleteReservation(String reservationID) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        boolean success = false;

        try {
            conn = DBConnection.getConnection();
            String query = "DELETE FROM reservations WHERE reservationID=?";

            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, reservationID);
            
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                success = true;
            }
        } finally {
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        
        return success;
    }
    
}
