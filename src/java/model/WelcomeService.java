/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Calendar;

/**
 *
 * @author rvikmyhr
 */
public class WelcomeService {

    private Calendar c = Calendar.getInstance();
    private Calendar morning = Calendar.getInstance();
    private Calendar afternoon = Calendar.getInstance();
    private Calendar night = Calendar.getInstance();
    
    public String findGreetingTime(){
       String greetTime;
       morning.set(Calendar.HOUR_OF_DAY, 11);
       morning.set(Calendar.MINUTE, 59);
       afternoon.set(Calendar.HOUR_OF_DAY, 17);
       afternoon.set(Calendar.MINUTE, 59);
       night.set(Calendar.HOUR_OF_DAY, 24);
       
        if (c.before(morning)){
            greetTime = "morning";
        } else if (c.before(afternoon) && c.after(morning)){
            greetTime = "afternoon";
        } else if (c.after(afternoon)){
            greetTime = "night";
        } else {
            greetTime = "error";
        }
        return greetTime;
    }
    
    public String getGreeting(String name){
        String greeting = "Good " + findGreetingTime() + ", " + name + ". Welcome!";       
        return greeting;
    }
    
    
//        public static void main(String[] args) {   
//            WelcomeService ws = new WelcomeService();
//            System.out.println(ws.findGreetingTime());
//           System.out.println(ws.getGreeting("John"));
//    }
   
                
    }
        
    
   
    

