/*
An online retailer sells five products whose retail prices are as follows:  
Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49; and product
5, $6.87.  Write an application that reads a series of pairs of numbers as follows:

Product number
Quantity sold
Your program should use a switch statement to determine the retail price for each
product.  It should calculate and display the total retail value of all products sold.
Use a sentinel-controlled loop to determine when the program should stop looping and 
display the final results.

 

Ahmad Alkurdy
9/26/2017
 */
package retailer;
import java.util.Scanner;
/**
 *
 * @author ahmad
 */
public class Retailer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //declaring variables to hold the values that the user will type
       int quantity = 0;
       int choice = 0;
        double total = 0;
        Scanner input = new Scanner(System.in);
        
        //display the products with the price for the user to make a choice
        System.out.print("1-Product 1, $2.98 \n");
        System.out.print("2-Product 2, $4.50 \n");
        System.out.print("3-Product 3, $9.98 \n");
        System.out.print("4-Product 4, $4.49 \n");
        System.out.print("5-Product 5, $6.85 \n");
        
        //while loop to prompt the user and store his choices in the variables above
        while(choice != 6)
        {
            //prompting the user and storing the choice
            System.out.print("make your choice and When you are done choosing, press 6 to finish!\n");
            choice = input.nextInt();
            
            //using switch to calculate the choice of the user
            switch(choice)
            {
                //if the choice was 1 then will be prompt for quantity and display the calculations
                case 1:
                    System.out.print("Product 1, $2.98 \n");
                    System.out.print("Enter The Quantity: \n");
                    quantity = input.nextInt();
                    total = total + (quantity * 2.98);
                    System.out.printf("The Total is: %f \n", total);
                    break;
                    
                //if the choice was 2 then will be prompt for quantity and display the calculations    
                case 2:
                    System.out.print("Product 2, $4.50 \n");
                    System.out.print("Enter The Quantity: \n");
                    quantity = input.nextInt();
                    total = total + (quantity * 4.50);
                   
                    System.out.printf("The Total is: %f\n", total);
                    break;
                    //if the choice was 3 then will be prompt for quantity and display the calculations
                case 3:
                    System.out.print("Product 3, $9.98 \n");
                    System.out.print("Enter The Quantity: \n");
                    quantity = input.nextInt();
                    total = total + (quantity * 9.98);
                   
                    System.out.printf("The Total is:%f \n", total);
                    break;
                    //if the choice was 4 then will be prompt for quantity and display the calculations
                case 4:
                    System.out.print("Product 4, $4.49 \n");
                    System.out.print("Enter The Quantity: \n");
                    quantity = input.nextInt();
                    total = total + (quantity * 4.49);
                    System.out.printf("The Total is: %f\n", total);
                    break;
                    //if the choice was 5 then will be prompt for quantity and display the calculations
                case 5:
                    System.out.print("Product 5, $6.85 \n");
                   System.out.print("Enter The Quantity: \n");
                    quantity = input.nextInt();
                    total = total + (quantity * 6.85);
                    System.out.printf("The Total is: %f \n", total);
                    break;
                
            }
        }
        
    }
    
}
