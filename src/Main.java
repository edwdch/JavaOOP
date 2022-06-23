import model.Student;

/**
 * @author edward
 * @date 2022-06-23
 */
public class Main {
    public static void main(String[] args) {
        final Student student = new Student("Edward Chen", 22, "male", "20220623");
        System.out.println("Student name: " + student.getName());
        System.out.println("Student age: " + student.getAge());
        System.out.println("Student gender: " + student.getGender());
        System.out.println("Student ID: " + student.getIdNum());
    }

}
