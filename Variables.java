
public class Variables {
    int myNum = 1000;
    float myFloatNum = 3.14f;
    double myDoubleNum = 3.141592653589793;
    char myLetter = 'A';
    boolean myBool = true;
    String myText = "Hello, Java!";

    public static void main(String[] args) {
        Variables v = new Variables();
        System.out.println(v.myText);
    }
}