public class StudentProfileInput {
    String firstname;
    String lastname;
    int age;
    
}
static void main(String[] args) {
    StudentProfileInput student = new StudentProfileInput();
    student.firstname = "Alice";
    student.lastname = "Smith";
    student.age = 22;
    
    System.out.println("My name is " + student.firstname + " " + student.lastname + ". I am " + student.age + " years old");
}
