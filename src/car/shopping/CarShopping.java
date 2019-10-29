/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.shopping;

import java.util.Scanner;

public class CarShopping {

    private static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        int totalCost = 0;
        totalCost += base();
        totalCost += automaticWindows();
        totalCost += onStarSystem();
        totalCost += remoteKeylessEntry();
        totalCost += AntiLockBrakes();
        totalCost += adjustablePedals();
        totalCost += sunroof();
        totalCost += heatedSeatAndWindshieldHeater();
        totalCost += GPS();
        totalCost += subwoofer();
        totalCost += performanceWheels();
        totalCost += bulletProof();
        System.out.println("The total cost is: $"+totalCost);
        //TODO: call methods that you write for each feature
        //TODO: print the total cost of the vehicle
    }

    public static int base() {
        System.out.println("Our inventory:");
        System.out.println("Model 1 - $15,000");
        System.out.println("Model 2 - $24,000");
        System.out.println("Model 3 - $40,000");
        System.out.println("Which base model did the customer choose?"
                + "(enter full model name ex. Model 1): ");
        String model = kb.nextLine();

        if (model.equalsIgnoreCase("Model 2")) {
            return 24000;
        } else if (model.equalsIgnoreCase("Model 3")) {
            return 40000;
        } else {
            return 15000;
        }

    }

    public static int automaticWindows() {
        System.out.print("Automatic Windows for $500? ");
       String response = kb.next();
       
       if (response.equalsIgnoreCase("yes"))
       {
           return 500;
       }
       else 
       {
           return 0;
       }
    }
    
    
    public static int onStarSystem() {
        System.out.print("On star System for $1000? ");
      String response = kb.next();
      
      if (response.equalsIgnoreCase("yes"))
      {
          return 1000;
      }
      else
      {
          return 0;
      }
    }
    
    public static int AntiLockBrakes() {
        System.out.println("Anti-lock brakes for $500?");
        String response = kb.next();
        
     if (response.equalsIgnoreCase("yes"))
     {
         return 500;
     }
     else
     {
         return 0;
     }
    }
    
     public static int remoteKeylessEntry(){
         System.out.println("Remote keyless entry for $1000?");
         String response = kb.next();
         if (response.equalsIgnoreCase("yes"))
         {
             return 1000;
         }
         else
         {
             return 0;
         }
     }
                
     public static int adjustablePedals(){
         System.out.println("Adjustable pedals for $1000?");
         String response = kb.next();
         if (response.equalsIgnoreCase("yes"))
         {
             return 1000;
         }
         else
         {
             return 0;
         }
     }
     
     public static int sunroof(){
         System.out.println("Sunroof for $800?");
         String response = kb.next();
         if (response.equalsIgnoreCase("yes"))
         {
             return 800;
         }
         else
         {
             return 0;
         }
     }
     
     public static int heatedSeatAndWindshieldHeater(){
         System.out.println("Heated seats and windshield heaters for $1500?");
         String response = kb.next();
         if (response.equalsIgnoreCase("yes"))
         {
             return 1500;
         }
         else
         {
             return 0;
         }
     }
     
     public static int GPS(){
         System.out.println("GPS for $750");
         String response = kb.next();
         if (response.equalsIgnoreCase("yes"))
         {
             return 750;
         }
         else
         {
             return 0;
         }
     }
     
     public static int subwoofer(){
         System.out.println("Subwoofer for $200?");
         String response = kb.next();
         if (response.equalsIgnoreCase("yes"))
         {
             return 250;
         }
         else
         {
             return 0;
         }
     }
     
     public static int performanceWheels(){
         System.out.println("Performance wheels for $1200?");
         String response = kb.next();
         if (response.equalsIgnoreCase("yes"))
         {
             return 1200;
         }
         else
         {
             return 0;
         }
     }
     
     public static int bulletProof (){
         System.out.println("Bullet proof the car for $20000?");
         String response = kb.next();
         if (response.equalsIgnoreCase("yes"))
         {
             return 20000;
         }
         else 
         {
             return 0;
         }
       }
     }
