/*Programmer : Mercy_Dziner
This is an Amazing Code in Java because, 
I'd explained everything that i can explain Clearly */
/** Loving Comments*/

import java.util.Scanner; /* Used to import Scanner Class from Library*/

public class Program /*Program is my Class Name It is only the changeable thing in this Line*/
{
    public static void main(String[] args)/* This line must be written as it is unless it won't work*/
    
     {
        System.out.println("I think this Program wants to know your Age! :)");   /* System.out.println is used to print a whole line of text*/
        
        int age; // Variable is age
        
        Scanner var = new Scanner(System.in); /*The whole line will be written as it is, only you can change is var(variable)*/
        
        age = var.nextInt(); /*now we have assigned var.nextInt to age do that it shortend*/
        
        System.out.println(age + "!  \nReally!");  /* here age is also variable but the Really! is a text Message */
        
      if(age > 0) { 
         if(age > 16)     /*Now an If else ledder is in use*/
          {
             System.out.println("Welcome!");
          } else {
             System.out.println("You Are Too Young");
            }
        } else {
            System.out.println("Error");
        }
    }
}

/* If you are confused with anything in this code then please tell me in Comment*/
