import java.util.Date;

public class Student {

    //Attributes
    String firstname;
    String lastname;
    long studentId;
    double weight;
    Date birthday;

    public enum SortKey {FIRSTNAME, LASTNAME, STUDENT_ID, WEIGHT, BIRTHDAY}

    Student(){
        new Student(null, null, 0, 0, new Date(0));
    }
    Student(String cFristname, String cLastname, long cstudentID, double cWeight, Date cBirthday){

    }

}
