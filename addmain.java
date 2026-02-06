import java.util.Scanner;

public class addmain {

    int a,b;
    Scanner sc = new Scanner(System.in);

    void enter() {
        System.out.println("Enter first number:");
        this.a = sc.nextInt();
        System.out.println("Enter second number:");
        this.b = sc.nextInt();
    }
    void add() {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
    
    public static void main(String[] args) {
        addmain obj = new addmain();
        obj.enter();
        obj.add();
    }
}