import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to Game");
        System.out.println("Guss The Number Between number 1 to 100");
         int a= sc.nextInt();
         String b= sc.next();
         System.out.println(b);
         while (a>0){
             if (a==10){
                 System.out.println("Correct Guss");
                 a=-1;
             }
             else {
                 System.out.println("Try again or enter nagitive number to end");
                 a= sc.nextInt();
             }
         }
        System.out.println("At the end number is 10");

    }
}