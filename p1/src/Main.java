import java.util.Scanner;

class Test {
    public static void main(String[] arg) {
        System.out.print("Enter Your Birth Year: ");
        int BirthYear = new Scanner(System.in).nextInt();
        System.out.print("Enter the Current Year: ");
        int CurrentYear = new Scanner(System.in).nextInt();
        int age = CurrentYear - BirthYear;
        System.out.println("Your Age is: "+ age +" Years old");


    }
}