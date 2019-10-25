/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.shopping;

import java.util.Scanner;

public class CarShopping
{
    
    private static Scanner kb = new Scanner(System.kb);

   public static void main(String[] args)
   {
      int totalCost = 0;
      totalCost += base();
      totalCost += automaticWindows();
      totalCost += onStarSystem();
      //TODO: call methods that you write for each feature
      //TODO: print the total cost of the vehicle
   }
   
   public static int base()
   {
      System.out.println("Our inventory:");
      System.out.println("Model 1 - $15,000");
      System.out.println("Model 2 - $24,000");
      System.out.println("Model 3 - $40,000");
       System.out.println("Which base model did the customer choose?"
               + "(enter full model name ex. Model 1): ");
      String model = kb.nextLine();
      if(model.equalsIgnoreCase("Model 1"))
         return 15000;
      //...
   }
   
   public static int automaticWindows()
   {
      System.out.print("Automatic Windows for $500? (y/n) > ");
      //...
   }
   
   public static int onStarSystem()
   {
       System
   }
}
