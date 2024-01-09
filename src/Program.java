import entities.Student;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Student student1 = new Student("Warley", "Java", 39);

        System.out.println();
        System.out.println("**********************************");
        System.out.println(student1);




    }
}
