package fr.insa.soa.model.bean;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Country {

   private @Id String code;
   private String name;

   @OneToMany(mappedBy = "nationality")
   private List<Student> students;

   @OneToMany(mappedBy = "country")
   private List<University> university;

   public void setName(String value) {
      this.name = value;
   }
   public String getName() {
      return this.name;
   }

   public void setCode(String value) {
      this.code = value;
   }
   public String getCode() {
      return this.code;
   }

   public List<Student> getStudents() {
      if (this.students == null) {
         this.students = new ArrayList<Student>();
      }
      return this.students;
   }

   public void addStudent(Student student) {
       if (this.students == null) {
           this.students = new ArrayList<Student>();
       }
       this.students.add(student);
   }

   public List<University> getUniversity() {
      if (this.university == null) {
         this.university = new ArrayList<University>();
      }
      return this.university;
   }

   public void addUniversity(University university) {
      if (this.university == null) {
         this.university = new ArrayList<University>();
      }
      this.university.add(university);
   }

}
