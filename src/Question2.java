import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int age;
        System.out.print("Enter your age (years): ");
        age = s.nextInt();
        
        System.out.print("Age in Years: "+age+" years.\n");
        System.out.print("Age in days: "+ age * 365 + " days.\n");
        System.out.print("Age in seconds: "+ age *365 *24 *60 *60 + " seconds.\n");
    }
}
