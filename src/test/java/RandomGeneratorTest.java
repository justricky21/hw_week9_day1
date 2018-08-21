import models.RandomGenerator;
import models.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RandomGeneratorTest {

    RandomGenerator generator;
    Student student;
    ArrayList<Student> cohort;

    @Before
    public void before(){
        generator = new RandomGenerator();
        student = new Student("Lady Duckington", "E23");
        cohort = new ArrayList<Student>();
    }

    @Test
    public void canAddPeopleToGenerator(){
        generator.addStudent(student);
        assertEquals(1, generator.getTotalStudents());
    }

    @Test
    public void canTransferPairToAnotherArray(){
        generator.addStudent(student);
        generator.addStudent(student);
        generator.transferPair(cohort);
        assertEquals(2, cohort.size());
    }

    @Test
    public void canTransferAnyGroup(){
        generator.addStudent(student);
        generator.addStudent(student);
        generator.addStudent(student);
        generator.addStudent(student);
        generator.transferStudentsToGroup(cohort, 4);
        assertEquals(4, cohort.size());

    }

}
