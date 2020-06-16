import java.util.Scanner;

public class Question1{
    public static void main (String[] args){
        String name;
        int year;
        float GPA;

        Scanner scan = new Scanner(System.in);


        System.out.print("Enter Name : ");
        name = scan.nextLine();

        System.out.print("\nEnter your year of study: ");
        year = scan.nextInt();

        System.out.print("\nWhat is your target GPA for this semester? ");
        GPA = scan.nextFloat();

        System.out.print("\nHello : " + name +"!\n");
        System.out.print("Work hard to achieve your target GPA of "+ GPA + " this semester of Year "+ year + ".");
    }
}
