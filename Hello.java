import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.print("Name: ");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        System.out.println("Hi " + name + "!");
    }
}
