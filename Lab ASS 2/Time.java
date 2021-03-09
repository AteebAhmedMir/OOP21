
package com.mycompany.lab_3_assignment_2;

public class Time {
    
    private int seconds;
    private int minutes;
    private int hours;
    
    Time(){
        seconds = 00;
        minutes = 00;
        hours = 01;
    }
    
    Time(int hours, int minutes, int seconds){
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }
    
    public void print(){
        System.out.println("Time: " + hours + ":" + minutes + ":" + seconds + "\n");
    }
}
