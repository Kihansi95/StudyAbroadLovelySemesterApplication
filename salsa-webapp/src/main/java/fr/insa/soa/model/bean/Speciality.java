package fr.insa.soa.model.bean;

import java.util.Set;
import java.util.HashSet;

public class Speciality {
   /**
    * <pre>
    *           1..1     0..*
    * Speciality ------------------------- Student
    *           speciality        &lt;       student
    * </pre>
    */
   private Set<Student> student;
   
   public Set<Student> getStudent() {
      if (this.student == null) {
         this.student = new HashSet<Student>();
      }
      return this.student;
   }
   
   /**
    * <pre>
    *           0..*     0..*
    * Speciality ------------------------- Course
    *           speciality        &gt;       class
    * </pre>
    */
   private Set<Course> class;
   
   public Set<Course> getClass_() {
      if (this.class == null) {
         this.class = new HashSet<Course>();
      }
      return this.class;
   }
   
   private String department;
   
   public void setDepartment(String value) {
      this.department = value;
   }
   
   public String getDepartment() {
      return this.department;
   }
   
   /**
    * <pre>
    *           1..1     1..1
    * Speciality ------------------------- StudentYear
    *           speciality        &gt;       year
    * </pre>
    */
   private StudentYear year;
   
   public void setYear(StudentYear value) {
      this.year = value;
   }
   
   public StudentYear getYear() {
      return this.year;
   }
   
   }