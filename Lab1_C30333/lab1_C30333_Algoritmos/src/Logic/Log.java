/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.Date;

/**
 *
 * @author wtfan
 */
public class Log {


private int eventId;    
private String event;    
private Date date;
private Account account;
private double movement;

private static int consecutive=0;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Log() {
this.eventId=++ consecutive;

    }

    public Log(int eventId, String event,  Account account, double movement) {
         this();
        this.eventId = eventId;
        this.event = event;
        this.date = date;
        this.account = account;
        this.movement = movement;
    }

  
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getMovement() {
        return movement;
    }

    public void setMovement(double movement) {
        this.movement = movement;
    }

    public static int getConsecutive() {
        return consecutive;
    }

    public static void setConsecutive(int consecutive) {
        Log.consecutive = consecutive;
    }

    @Override
    public String toString() {
 String result ="LOG INFORMATION"
        +"\n---------------------------"
        +"\nEevent ID: "+this.getEventId()
        +"\nEevent TYPE: "+this.getEvent()
//        +"\nTransaction Date: "+this.getDate()
        +"\nMovement Amount: "+this.getMovement()
        +"\nAfeccted Account: "+this.getAccount().toString();
 return result;
  
         }
}
   
    
    
    


