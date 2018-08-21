import models.RandomGenerator;
import models.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RandomGeneratorTest {

    RandomGenerator generator;
    Student student1;
    Student student2;
    ArrayList<Student> cohort;

    @Before
    public void before(){
        generator = new RandomGenerator();
        student2 = new Student("Lady Duckington", "E23");
        student1 = new Student("Sir Duckington", "E23");
        cohort = new ArrayList<Student>();
    }

    @Test
    public void canAddPeopleToGenerator(){
        generator.addStudent(student1);
        assertEquals(1, generator.getTotalStudents());
    }

    @Test
    public void canTransferPairToAnotherArray(){
        generator.addStudent(student1);
        generator.addStudent(student2);
        generator.transferPair(cohort);
        assertEquals(2, cohort.size());
    }

}
