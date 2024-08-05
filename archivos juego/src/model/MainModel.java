package model;

public class MainModel {
    private String studentName;

    public MainModel(String studentName) {
        this.studentName = studentName;
    }

    public String getGreeting() {
        return "Mi primer programa en JavaFx: " + studentName;
    }
}
