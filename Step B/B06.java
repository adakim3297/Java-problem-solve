import java.util.Scanner;

class B06{
    public static void main(String[] args) {
        B06 stepB = new B06();
        stepB.b06();
    }

    void b06(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter points of Korean > ");
        int kor = s.nextInt();

        System.out.print("Enter points of English > ");
        int eng = s.nextInt();

        System.out.print("Enter points of Math > ");
        int math = s.nextInt();

        int total = kor + eng + math;
        System.out.printf("Total point is %d\n", total);

        double average = total / 3.0;
        System.out.printf("The average is %.1f\n",average);

        if(kor >= 90) System.out.println("Korean grade is outstanding!");
        if(eng >= 90) System.out.println("English grade is outstanding!");
        if(math >= 90) System.out.println("Math grade is outstanding!");

    }
}