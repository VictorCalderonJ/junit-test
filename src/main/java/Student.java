public class Student {
    private long id;
    private String name;
    private int[] grades;

    public Student() {}

    public Student(long id, String name, int[] grades){
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
    public int[] getGrades() {
        return this.grades;
    }
    //setters
    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGrades(int[] grades) {
        this.grades = grades;
    }
}
