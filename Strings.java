/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.strings;

/**
 *
 * @author Hiyoshi
 */

import java.util.Scanner;
public class Strings {
    static Scanner scan = new Scanner(System.in);
    static String firstName;
    static String secondName;
    static String thirdName;
    static int choice;
    static String name1;
    static String name2;
    static String name3;
    static String name4;
    static String name5;
    static String name6;
    static String username;
   

    public static void main(String[] args) {
        inputName();
        
    }
    
    // ASK THE USER TO INPUT THREE NAMES
    public static void inputName(){
        System.out.println("Enter three first names: ");
        firstName = scan.nextLine();
        secondName = scan.nextLine();
        thirdName = scan.nextLine();
        displayPossibleNames();
    }
    
    // COMBINING THE POSSIBLE NAMES INTO ONE VARIABLE
    public static void displayPossibleNames(){
        System.out.println("Possible names are: ");   
        name1 = firstName.concat(" ").concat(secondName);
        name2 = firstName.concat(" ").concat(thirdName);
        name3 = secondName.concat(" ").concat(firstName);
        name4 = secondName.concat(" ").concat(thirdName);
        name5 = thirdName.concat(" ").concat(firstName);
        name6 = thirdName.concat(" ").concat(secondName);
        System.out.println("1. " + name1);
        System.out.println("2. " + name2);
        System.out.println("3. " + name3);
        System.out.println("4. " + name4);
        System.out.println("5. " + name5);
        System.out.println("6. " + name6);
        selectName();
        
    }
    
    // ASK THE USER TO SELECT A USERNAME
    public static void selectName(){
        System.out.println("Enter 1-6 to select a name: ");
        choice = scan.nextInt();
        initials();
    }
    
    // GET THE INITIALS BY COMBINING TWO CHARACTERS INTO STRING
    public static void initials(){
        if (choice == 1){    
            char initial = firstName.charAt(0);
            char initial_2 = secondName.charAt(0);
            String firstNameInitial = Character.toString(initial) + Character.toString(initial_2);
            System.out.println("The initials for " + name1 + " is"  + " " + firstNameInitial + ".");
        }
        else if (choice == 2){
            char initial = firstName.charAt(0);
            char initial_2 = thirdName.charAt(0);
            String secondNameInitial = Character.toString(initial) + Character.toString(initial_2);
            System.out.println("The initials for " + name2 + " is" + " " + secondNameInitial + ".");
        }
        else if (choice == 3){
            char initial = secondName.charAt(0);
            char initial_2 = firstName.charAt(0);
            String thirdNameInitial = Character.toString(initial) + Character.toString(initial_2);
            System.out.println("The initials for " + name2 + " is" + " " + thirdNameInitial + ".");
        }
        else if (choice == 4){
            char initial = secondName.charAt(0);
            char initial_2 = thirdName.charAt(0);
            String fourthNameInitial = Character.toString(initial) + Character.toString(initial_2);
            System.out.println("The initials for " + name2 + " is" + " " + fourthNameInitial + ".");
        }
        else if (choice == 5){
            char initial = thirdName.charAt(0);
            char initial_2 = firstName.charAt(0);
            String fifthNameInitial = Character.toString(initial) + Character.toString(initial_2);
            System.out.println("The initials for " + name2 + " is" + " " + fifthNameInitial + ".");
        }
        else if (choice == 6){
            char initial = thirdName.charAt(0);
            char initial_2 = secondName.charAt(0);
            String sixthNameInitial = Character.toString(initial) + Character.toString(initial_2);
            System.out.println("The initials for " + name2 + " is" + " " + sixthNameInitial + ".");
        }
        else {
            error();
        }
        suggestedUsername();
    }
    
    // SELECTED USERNAME BY THE USER 
    public static void suggestedUsername(){
        if (choice == 1){
            username = name1.replace(' ', '_').toLowerCase();
            System.out.println("Suggested username: " + username);
        }
        if (choice == 2){
            username = name2.replace(' ', '_').toLowerCase();
            System.out.println("Suggested username: " + username);
        }
        if (choice == 3){
            username = name3.replace(' ', '_').toLowerCase();
            System.out.println("Suggested username: " + username);
        }
        if (choice == 4){
            username = name4.replace(' ', '_').toLowerCase();
            System.out.println("Suggested username: " + username);
        }
        if (choice == 5){
            username = name5.replace(' ', '_').toLowerCase();
            System.out.println("Suggested username: " + username);
        }
        if (choice == 6){
            username = name6.replace(' ', '_').toLowerCase();
            System.out.println("Suggested username: " + username);
        }
        
        
    } 
    
    // DISPLAY ERROR IF INVALID INPUT
    public static void error(){
        char ask;
        System.out.println("Input Error!!");
        System.out.println("Retry? Type [Y] for YES [N] for NO");
        ask = scan.next().charAt(0);
        if (ask == 'Y'){
            inputName();
            
        }
        else if (ask == 'N'){
            System.out.println("Okay Have a Nice Day!");
        } 
        else {
            error();
        }
        
    }
}
