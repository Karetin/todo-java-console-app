public enum CategoryTask {
    PENDING("Pending"), COMPLETED("Completed"), OVERDUE("Overdue");


    private String display;

    CategoryTask(String display){
        this.display = display;
    }
    public String getDisplay(){
        return display;
    }


}
