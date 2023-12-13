/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */
public class Main {
   public static void main(String[] args) { 
      Student s1 = new Student("Salman"); 
      Student s2 = new Student("Aldova"); 
      Student s3 = new Student("Bintang"); 
      Student s4 = new Student("Aiman");

      Assignment a1 = new Assignment(80); 
      Assignment a2 = new Assignment(55); 
      Assignment a3 = new Assignment(60); 
      Assignment a4 = new Assignment(45);

      CourseRecord r1 = new CourseRecord(s1); 
      r1.addAssignment(a1); 
      r1.addAssignment(a2); 
      r1.setTakingFinalExam(true);

      CourseRecord r2 = new CourseRecord(s2); 
      r2.addAssignment(a2); 
      r2.addAssignment(a3);

      CourseRecord r3 = new CourseRecord(s3);
      r3.addAssignment(a3); 
      r3.addAssignment(a4);

      CourseRecord r4 = new CourseRecord(s4); 
      r4.addAssignment(a4); 
      r4.addAssignment(a1); 
      r4.setTakingFinalExam(true);

      Course pancaedu = new Course("Implementasi Perangkat Lunak"); 
      pancaedu.addCourseRecord(r1); 
      pancaedu.addCourseRecord(r2); 
      pancaedu.addCourseRecord(r3); 
      pancaedu.addCourseRecord(r4);

      pancaedu.printCourseStudents(); 
      pancaedu.printFinalExamStudents();
   } 
}