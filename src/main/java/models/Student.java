package models;

public class Student {
    private String name;
    private String cohort;

    public Student(String name, String cohort) {
        this.name = name;
        this.cohort = cohort;
    }

    public String getName() {
        return name;
    }

    public String getCohort() {
        return cohort;
    }
}
