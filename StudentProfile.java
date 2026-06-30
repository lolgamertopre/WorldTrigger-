
 
  public class StudentProfile {
     String firstName;
     String lastName;
      int age;
 
     public StudentProfile(String firstName, String lastName, int age) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.age = age;
     }
 
     public static void main(String[] args) {
         StudentProfile student = new StudentProfile("John", "Doe", 20);
        System.out.println("My name is " + student.firstName + " " + student.lastName + ". I am " + student.age + " years old");
     }
 }
  