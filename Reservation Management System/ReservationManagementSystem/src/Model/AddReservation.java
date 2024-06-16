/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;

public class AddReservation {
    Statement stmt;
    
    public void Reservations(String reservationID, String name, String contactNumber, 
        String email, String DoR, String NoG)
    {
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate
            ("INSERT INTO reservations (reservationID, name, contactNumber,"
                    + "Email, DoR, NoG) VALUES('"+ reservationID +"', '"+ 
                    name +"', '"+ contactNumber +"', '"+ email +"', '"+ 
                    DoR +"', '"+ NoG +"')");
            System.out.println("Reservation Record added Successfull");

        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
