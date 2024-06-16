/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.UpdateDeleteReservation;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ReservationController {
    
public static void Reservations(String reservationID, String name, String contactNumber, 
        String email, String DoR, String NoG) {
    new Model.AddReservation().Reservations(reservationID, name, contactNumber, 
                    email, DoR, NoG);
    JOptionPane.showMessageDialog(null, "New Record has been inserted", 
            "Successfull", JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean updateReservation(String reservationID, String name, String contactNumber, 
        String email, String DoR, String NoG) throws 
            SQLException {boolean success = false;
            success = UpdateDeleteReservation.updateReservation(reservationID, name, contactNumber, 
                    email, DoR, NoG);
            return success;
        }
    
    public static boolean deletedeleteReservation(String reservationID) throws SQLException {
        boolean success = false;
        success = UpdateDeleteReservation.deletedeleteReservation(reservationID);
        return success;
    }
    
}
