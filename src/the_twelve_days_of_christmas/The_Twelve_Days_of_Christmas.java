/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_twelve_days_of_christmas;

/**
 *
 * @author Konstantin
 */
public class The_Twelve_Days_of_Christmas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for(int days = 1; days <=12; days++){
                        //Two first lines of song
                    System.out.println("On the "+ days + " day of Christmas,\n" +"my true love sent to me ");
            switch(days){
                case 12:  
                    System.out.println("Twelve drummers drumming,");
                case 11:
                    System.out.println("Eleven pipers piping,");
                case 10:
                    System.out.println("Ten lords a-leaping,");
                case 9:
                    System.out.println("Nine ladies dancing,");
                case 8:
                    System.out.println("Eight maids a-milking,");
                case 7:
                    System.out.println("Seven swans a-swimming,");
                case 6:
                    System.out.println("Six geese a-laying,");
                case 5:
                    System.out.println("Five golden rings,");
                case 4:
                    System.out.println("Four calling birds,");
                case 3:
                    System.out.println("Three French hens,");
                case 2:                 // Two last lines of second block and of the rest blocks
                    System.out.println("Two turtle doves,\n" + "And a partridge in a pear tree.\n ");
                    break;
                case 1:                 //Last line in first block  
                    System.out.println("A partridge in a pear tree.\n");
                    break;
            } 

        }// end of for loop

    }
    
}
