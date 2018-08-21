package models;

import java.util.ArrayList;
import java.util.Collections;

public class RandomGenerator {
    ArrayList<Student> students;

    public RandomGenerator() {
        this.students = new ArrayList<Student>();
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void transferPair(ArrayList<Student> arrayToTransfer){
        if (this.students.size() < 2){

        } else {
            Collections.shuffle(this.students);
            arrayToTransfer.add(this.students.get(0));
            arrayToTransfer.add(this.students.get(1));
        }
    }

    public int getTotalStudents(){
        return this.students.size();
    }

    public void transferStudentsToGroup(ArrayList<Student> arrayToTransfer, int numberOfStudents){
        ArrayList<Student> tempArray = this.students;
        Collections.shuffle(tempArray);
        int i = 0;
        while (i < numberOfStudents){
            arrayToTransfer.add(tempArray.get(0));
            tempArray.remove(0);
            i++;
        }

    }
}
