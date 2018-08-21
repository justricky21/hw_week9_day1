import models.Student;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    Student student;

    @Before
    public void before(){
        student = new Student("Sir Duckington", "E23");
    }

    @Test
    public void studentHasName(){
        assertEquals("Sir Duckington", student.getName());
    }

    @Test
    public void studentHasCohort(){
        assertEquals("E23", student.getCohort());
    }
}
