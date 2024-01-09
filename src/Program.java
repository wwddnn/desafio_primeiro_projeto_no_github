import entities.Student;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Student student1 = new Student("Warley", "Java", 39);

        Student student2 = new Student("Anna", "Python", 35);

        Student student3 = new Student("Alinne", "UX-UI", 39);


        System.out.println();
        System.out.println("**********************************");
        System.out.println(student1);
        System.out.println("**********************************");
        System.out.println(student2);
        System.out.println("**********************************");
        System.out.println(student3);





    }
}
