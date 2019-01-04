package fr.insa.soa.model.bean;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


//@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Student {

   private @Id String name;
   private Date birthday;

   @ManyToOne
   private Country nationality;

   @OneToOne
   private ReportCard reportCard;

   @ManyToOne
   private Speciality speciality;

   @ManyToMany(mappedBy = "students")
   private List<YearEnrolment> yearEnrolments;

   public void setName(String value) {
      this.name = value;
   }
   public String getName() {
      return this.name;
   }

   public void setBirthday(Date birthday){ this.birthday = birthday; }
   public Date getBirthday(){return this.birthday; }

   public void setNationality(Country value) {
      this.nationality = value;
   }
   public Country getNationality() {
      return this.nationality;
   }

   public void setReportCard(ReportCard value) {
      this.reportCard = value;
   }
   public ReportCard getReportCard() {
      return this.reportCard;
   }
   
   public void setSpeciality(Speciality value) {
      this.speciality = value;
   }
   public Speciality getSpeciality() {
      return this.speciality;
   }

   public List<YearEnrolment> getYearEnrolments(){
      if (this.yearEnrolments == null) {
         this.yearEnrolments = new ArrayList<YearEnrolment>();
      }
      return this.yearEnrolments;
   }

   public void addYearEnrolment(YearEnrolment yearEnrolment){
      if (this.yearEnrolments == null) {
         this.yearEnrolments = new ArrayList<YearEnrolment>();
      }
      this.addYearEnrolment(yearEnrolment);
   }

}
