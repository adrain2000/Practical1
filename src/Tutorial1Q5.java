import java.util.Scanner;

public class Tutorial1Q5 {
    
    static void showOddNumber(){       
        //Declarations
        int minNum, maxNum;
        int sumNum = 0;
        Scanner s = new Scanner(System.in);
        
        //Input
        System.out.print("Enter Min Value: ");
        minNum = s.nextInt();
        
        System.out.print("Enter Max Value: ");
        maxNum = s.nextInt();
        
        //Process
        for(int x = minNum; x <= maxNum; x++){
            if(x == 0){
                System.out.print("Number Can't Start With 0!!\n");
                break;
            }
            else if(x == 1){
                System.out.print(x + " ");
                sumNum += x;
            }
            else if(x % 2 != 0){
                System.out.print(x + " ");
                sumNum += x;
                
            }
            
        }
        System.out.print("\n");
        
        
    }
    
    public static void main(String[] args){
       showOddNumber();
    }
    
}
