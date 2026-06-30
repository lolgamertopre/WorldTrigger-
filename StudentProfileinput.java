public class StudentProfileinput {
       
    static void main(String[] args) {
        String firstname;
        String lastname;
        int age;

        StudentProfileinput student = new StudentProfileinput();
        student.firstname = "Alice";
        student.lastname = "Smith";
        student.age = 22;
        
        System.out.println("My name is " + student.firstname + " " + student.lastname + ". I am " + student.age + " years old");
    }
}