package Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student student = new Student();

        Student student1 = new Student(101,"Ankit",22);

        student.setId(102);

        System.out.println(student.getId());
        }
    }
