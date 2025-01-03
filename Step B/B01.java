
import java.util.Scanner;

class B01{
    public static void main(String[] args) {
        B01 stepB = new B01();
        stepB.b01();
    }

    void b01(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a birth year > ");
        int birth_year = s.nextInt();

        int age = 2024 - birth_year + 1;
        
        if(age < 20) System.out.printf("You are Minors");
        else System.out.printf("You are adult");
    }
}
    

