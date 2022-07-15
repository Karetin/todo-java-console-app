import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {

    DateFormat format = new SimpleDateFormat("dd.MM.yyyy hh/mm");
    Date dateEndOfTask = new Date();

    private String name;
    private String description;
    private String date = format.format(dateEndOfTask);
    private CategoryTask statusSystem = CategoryTask.PENDING;


    public Task(String name, String description, String date) {
        this.name = name;
        this.description = description;
        this.date = date;

    }

    {
        name = "No Name";
        description = "No Description";
        statusSystem = CategoryTask.PENDING;
        //date = new SimpleDateFormat("dd.MM.yyyy hh/mm").format(new Date()); need date +1
    }






    public void setName(String taskName){
        name = taskName;
    }
    public String getName(){
        return name;
    }


    public void setDescription(String taskDescription){
        description = taskDescription;
    }
    public String getDescription(){
        return description;
    }


    public void setDate(String taskDate){
        date = taskDate;
    }
    public String getDate(){
        return date;
    }




    public void setStatusSystem(CategoryTask taskStatusSystem) {
        statusSystem = taskStatusSystem;
    }
    public CategoryTask getStatusSystem(){
        return statusSystem;
    }


    public String toString(){
        return "Task [" + name + " " + description + " " + statusSystem.getDisplay() + " " + date + "]";
    }
}


