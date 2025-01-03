import java.util.Scanner;

class A01{
    public static void main(String[] args) {
        A01 stepA = new A01();
        stepA.a01();
    }

    void a01(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a birth year > ");
    int birth_year = s.nextInt();
    int age = 2024 - birth_year + 1;

    System.out.println("You are "+age+" years old.");

    }
}