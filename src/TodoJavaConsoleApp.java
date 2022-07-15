import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class TodoJavaConsoleApp {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<Task>();
        Task myFirsTask = new Task("nameOfTheTask","Description","12.12.2022 22/22");
        Display.firstDisplay();
        System.out.println(myFirsTask);
        Boolean forWhile = true;
        while(forWhile){
            int number = scanner.nextInt(); //add try catch bool string etc
            switch (number){                // add i don't use needed menu button not work /if else
                case 1:
                    System.out.println("Test");
                    break;
                case 2:
                    System.out.println("Test"); //equals
                    break;
                case 3:
                    System.out.println("Test"); //equals
                    break;
                case 4:
                    System.out.println("Test"); //equals
                    break;
                case 5:
                    System.out.println("Test");
                    break;
                case 6:
                    System.out.println("Test");
                    break;
                case 7:
                    System.out.println("Test");
                    break;
                case 8:
                    System.out.println("Test");
                    break;
                case 9:
                    forWhile = false;
                    break;
                case 0:
                    System.out.println("Test");
                    break;
                default:
                    System.out.println("Press available button");
                    break;
            }
        }

    }
}
