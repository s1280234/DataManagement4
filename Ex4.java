import java.util.Scanner;
        public class Ex4{
        public static void main(String[] args){        
        Scanner scanner = new Scanner(System.in);
         System.out.println("What is your name?");
         String input_text = scanner.nextLine();
         System.out.println("Hello," +input_text+ "!");

         int value1 = (int)(Math.random() * 6) + 1;
         System.out.println("Die1: " +value1);
         int value2 = (int)(Math.random() * 6) + 1; 
         System.out.println("Die2: " +value2);
         int total = value1 + value2;
          System.out.println("Total value: " +total);
        }
    }
