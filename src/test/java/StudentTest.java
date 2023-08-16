import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    private Student emptyStudent;
    private Student actualStudent;

    @Before
    public void setUp(){
        ArrayList<Double> vicGrades = new ArrayList<>(Arrays.asList(2.0, 4.0, 5.0));
//        ArrayList<Double> vicGrades = new ArrayList<>(2, 4, 5);
        actualStudent = new Student(1551, "Vic", vicGrades);
    }
    @Test
    //Create a normal method
    public void testStudentNoArg(){
        //Making sure it has Value
//        actualStudent = new Student();
        //Asset nulling
        assertNull(emptyStudent);
        assertNotNull(actualStudent);
    }

    //Checks if getters work.
    @Test
    public void testStudentsGetters(){
        ArrayList<Double> expectedGrades = new ArrayList<>(Arrays.asList(2.0, 4.0, 5.0));
        assertEquals(actualStudent.getName(), "Vic");
        assertEquals(actualStudent.getId(), 1551);
        assertEquals(actualStudent.getGrades(), expectedGrades);
    }

    //Checks if Setters work
    @Test
    public void testStudentsSetters(){
        ArrayList<Double> SettingGrades = new ArrayList<>(Arrays.asList(2.0, 4.0, 5.0));
        actualStudent.setName("Samantha");
        actualStudent.setId(6553);
        actualStudent.setGrades(SettingGrades);

        assertEquals(actualStudent.getName(), "Samantha");
        assertEquals(actualStudent.getId(), 6553);
        assertEquals(actualStudent.getGrades(), SettingGrades);



    }


}
