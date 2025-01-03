import java.util.Scanner;

class A03{
    public static void main(String[] args) {
        A03 stepA = new A03();
        stepA.a03();
    }

    void a03(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter width of Rectangle > ");   
    int width = s.nextInt();

    System.err.print("Enter height of Rectangle > ");
    int height = s.nextInt();
    
    int area = width * height;
    System.out.println("Area of Rectangle is "+area+" ");

    }
}