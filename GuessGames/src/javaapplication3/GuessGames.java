/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author user
 */
public class GuessGames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int secretNum;
        int guess;
        boolean correct=false;
        int count=0;
        int limit=5;
        
        Scanner  keyboard=new Scanner(System.in);
       // System.out.println("Give me secret Number: ");
        Random rand=new Random();
        secretNum=rand.nextInt(100);
        while(!correct){
        if(count<limit){
            System.out.println("Guess Beetween 1 to 100: ");
            guess=keyboard.nextInt();
            if(secretNum<guess){
                System.out.println("Guess Smaller ");
            }
            else if(secretNum>guess){
                System.out.println("Guess Higher ");
            }
            else if(guess==secretNum){
                System.out.println("Congratulations You are Winner ");
            }
            count++;
        }else{
            System.out.println("Games over");
            break;
        }
            
        }
    }
    
}
