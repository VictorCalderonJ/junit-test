import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Double> grades = new ArrayList<>();

    public Student() {}

    public Student(long id, String name, ArrayList<Double> grades){
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    //getters
    public long getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public ArrayList<Double> getGrades() {
        return this.grades;
    }
    //setters
    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }
}
