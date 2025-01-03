import java.util.Scanner;

class A02{
    public static void main(String[] args) {
        A02 stepA = new A02();
        stepA.a02();
    }

    void a02(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter Celsius temperature > ");   
    Double c_degree = s.nextDouble();

    Double f_degree = c_degree * 1.8 + 32;
    System.out.println("Fahrenheit temperature is "+f_degree+"");

    }
}