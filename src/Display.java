import java.util.ArrayList;

public class Display {

    public static void displayAllMode(){

        ArrayList<String> displayAllMode = new ArrayList<String>();
        displayAllMode.add("1. Display all tasks");


        for(int listIndex = 0; listIndex < displayAllMode.size(); listIndex++){
            System.out.println(displayAllMode.get(listIndex));
        }
        System.out.println();
    }

    public static void displayMode(){
        ArrayList<String> displayMode = new ArrayList<String>();
        displayMode.add("2. Display pending tasks");
        displayMode.add("3. Display completed tasks");
        displayMode.add("4. Display overdue tasks");

        for(int listIndex = 0; listIndex < displayMode.size(); listIndex++){
            System.out.println(displayMode.get(listIndex));
        }
        System.out.println();
    }

    public static void doMode(){

        ArrayList<String> doMode = new ArrayList<String>();
        doMode.add("5. Add task");
        doMode.add("6. Select task");


        for(int listIndex = 0; listIndex < doMode.size(); listIndex++){
            System.out.println(doMode.get(listIndex));
        }
        System.out.println();

    }

    public static void changeMode(){

        ArrayList<String> doMode = new ArrayList<String>();
        doMode.add("7. Complete task");
        doMode.add("8. Remove task");


        for(int listIndex = 0; listIndex < doMode.size(); listIndex++){
            System.out.println(doMode.get(listIndex));
        }
        System.out.println();

    }

    public static void exitMode(){

        ArrayList<String> exitMode = new ArrayList<String>();
        exitMode.add("9. Exit");

        for(int listIndex = 0; listIndex < exitMode.size(); listIndex++){
            System.out.println(exitMode.get(listIndex));
        }
        System.out.println();

    }

    public static void cancelMode(){

        ArrayList<String> cancelMode = new ArrayList<String>();
        cancelMode.add("0. Cancel");


        for(int listIndex = 0; listIndex < cancelMode.size(); listIndex++){
            System.out.println(cancelMode.get(listIndex));
        }
        System.out.println();
    }

    public static void firstDisplay(){
        System.out.println("Hello");
        System.out.println("Chose the option");
        Display.displayAllMode();
        Display.displayMode();
        Display.doMode();
        Display.exitMode();
    }


}
