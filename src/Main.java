import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student test = new Student("Max", "Frese", 101, 80, new Date(10) );
        System.out.println(test.getName());
    }
}