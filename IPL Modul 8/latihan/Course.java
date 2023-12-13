/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */
import java.util.Enumeration; 
import java.util.Vector;

public class Course { 
   private String title;
   private Vector<CourseRecord> courseRecords;

   public Course(String title) { 
      this.title = title;
      this.courseRecords = new Vector<CourseRecord>();
   }

   public String getTitle() { 
      return this.title;
   }

   public void setTitle(String title) { 
      this.title = title;
   }

   public void addCourseRecord(CourseRecord courseRecord) { 
      this.courseRecords.add(courseRecord);
   }

   public Enumeration<CourseRecord> getCourseRecord() { 
      return this.courseRecords.elements();
   }

   public void printCourseStudents() { 
      System.out.println("Mahasiswa yang terdaftar di " + this.title + ":");
      for (Enumeration<CourseRecord> e = getCourseRecord(); 
      e.hasMoreElements();) {
           CourseRecord courseRecord = e.nextElement(); 
           System.out.println(" " + courseRecord.getStudent().getName());
      }
   }

   public void printFinalExamStudents() { 
      System.out.println("Mahasiswa yang terdaftar di " + this.title + " dan mengikuti UAS:");
      for (Enumeration<CourseRecord> e = getCourseRecord(); 
      e.hasMoreElements();) {
      CourseRecord courseRecord = e.nextElement(); 
          if (courseRecord.isTakingFinalExam()) {
              System.out.println(" " + courseRecord.getStudent().getName());
          }
      }
   }
}