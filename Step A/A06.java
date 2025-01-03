import java.util.Scanner;

class A06{
    public static void main(String[] args) {
        A06 stepA = new A06();
        stepA.a06();
    }

    void a06(){
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
        System.out.printf("The average is %.1f",average);

    }
}