/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */


import java.util.ArrayList;
import java.util.List;

public class CourseRecord {
    private Student student;
    private List<Assignment> assignments;
    private boolean takingFinalExam;

    public CourseRecord(Student student) {
        this.student = student;
        this.assignments = new ArrayList<>();
        this.takingFinalExam = false;
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public void setTakingFinalExam(boolean takingFinalExam) {
        this.takingFinalExam = takingFinalExam;
    }

    public Student getStudent() {
        return student;
    }

    public boolean isTakingFinalExam() {
        return takingFinalExam;
    }
}