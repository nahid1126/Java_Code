/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your name Here: ");
        String name=input.next();
        System.out.println("Hello"+name+"Welcome to the guess games: ");
        System.out.println("Do you want to star the games ? ");
        String answre=input.next();
        Random rand=new Random();
        int x=rand.nextInt(20)+1;
        System.out.println("Please guess a number: ");
        int userinput=input.nextInt();
        int timestried=1;
        boolean shouldFinish=false,shouldWon=false;
        System.out.println("You will only have 5 chance: ");
        while(!shouldFinish){
        if(timestried==5){
        shouldFinish=true;
        shouldWon=false;
        continue;}
        if(x==userinput){
            shouldWon=true;
            shouldFinish=true;}
        else if(userinput<x){
            System.out.println("Guess higher: ");
            userinput=input.nextInt();}
        else{
            System.out.println("Guess lower:");
            userinput=input.nextInt();
            timestried++;}
    }
        if(shouldWon){
        System.out.println("Congaratulations");}else {
        System.out.println("Games over: ");
        System.out.println("The number is:"+x);}
        
    }
    
}
