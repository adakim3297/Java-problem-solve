import java.util.Scanner;

class B09{
    public static void main(String[] args) {
        B09 stepB = new B09();
        stepB.b09();
    }

    void b09(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter height(cm) ");
        int height = s.nextInt();

        System.out.print("Enter weight(kg) ");
        int weight = s.nextInt();

        int bmi = weight / (int)Math.pow((height * 0.01),2);

        if(bmi >= 25) System.out.println("You are obesity");
        else System.out.println("You are not obesity");
       

    }
}