package main;
//Author: Jon Klenzman, Jorge FM.
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Start{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String look="Look",nextTurn="NextTurn";//commands
        String attack="attack",run="Run";
        
        String weaponT0="Fist",weaponT1="Knife";//weapons
        
        String m01="Goblin",m02="Ogre";//creatures
        int gobhp=5,ogehp=10;
        
        DecimalFormat scoreForm = new DecimalFormat("0000");//player info
        int health=100 ,scoreNum=0,weapon=0;
        
        boolean hasGameEnded = false;//gamestate
        int turnNumber = 1;
        
        Random NumGen = new Random();
        
        System.out.println("Comands:");
        System.out.println("Look = Looks arund. Next Turn = Continues to next turn.");
        System.out.println("Attack = Attack target. Run = Retreat from battle.");
        
        while(!hasGameEnded || health > 0){
            int landRandom = NumGen.nextInt(4);
            String landName = "NULL";
            int landChosen=0;
            switch(landRandom){
                case 0:
                    landName="Forest";
                    landChosen=0;
                    break;
                case 1:
                    landName="Field";
                    landChosen=1;
                    break;
                case 2:
                    landName="Valley";
                    landChosen=2;
                    break;
                case 3:
                    landName="Mountain";
                    landChosen=3;
                    break;
                case 4:
                    landName="Desert";
                    landChosen=4;
                    break;
            }
            System.out.println("Health: "+ health +"/100\t\t\t\tScore "+ scoreForm.format(scoreNum));
            System.out.println("Turn " + turnNumber + ".");
            if(turnNumber == 1){
                System.out.println("You find yourself in a forest.");
                
            }else{
                System.out.println("You find yourself in a " + landName + ".");
                switch(landChosen){
                    case 0:
                        System.out.println("");
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("YOU BROKE IT IM SORRY");
                        break;
                }
            }
            System.out.print("-");
            String imp=in.nextLine();
            switch(imp){
                case "LOOK":
            }
            turnNumber++;
        }
    }
}
