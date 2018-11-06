/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timewizard;

import businessobjects.UserInformation;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kevin
 */
public interface TimeWizardInterface {

    String cleanUpTime(String time);

    Boolean isCurrentAppointmentConflicted(String dateAndTime, String startTime, String endTime);

    Timestamp getLocalTimeStamp();

    String userTimeStringToTimeStamp(String stringTime);

    String getRidOfZero(String time);

    String extractDate(String dateAndTime);

    String extractTime(String dateAndTime);

    String getReminderTimeForAppointments(String time);

    List<UserInformation> getTodaysAppointmentList(String date);

    ArrayList<UserInformation> getThisMonthAppointmentList(String date);
    
    ArrayList<UserInformation> getMonthsAppointmentList(int month);

}//end method 
