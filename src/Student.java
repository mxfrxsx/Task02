import java.util.Date;

public class Student {


    //Attributes
    String firstname;
    String lastname;
    long studentId;
    double weight;
    Date birthday;

    public enum SortKey {FIRSTNAME, LASTNAME, STUDENT_ID, WEIGHT, BIRTHDAY}

    Student() {
        new Student(null, null, studentId, 0, new Date(0));
    }

    Student(String cFristname, String cLastname, long cStudentID, double cWeight, Date cBirthday) {
        firstname = cFristname;
        lastname = cLastname;
        cStudentID = studentId;
        weight = cWeight;
        birthday = cBirthday;


    }

    public String getFirstname() {return firstname;}

    public void setFirstname(String firstname) {this.firstname = firstname;}

    public String getLastname() {return lastname;}

    public void setLastname(String lastname) {this.lastname = lastname;}

    public String getName(){return firstname + " " + lastname;}
    public long getStudentId() {return studentId;}

    public double getWeight() {return weight;}

    public void setWeight(double weight) {this.weight = weight;}

    public Date getBirthday() {return birthday;}

    public void setBirthday(Date birthday) {this.birthday = birthday;}

}