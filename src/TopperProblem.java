import java.util.Scanner;

public class TopperProblem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        int odd=0;
        int even=0;
        int result=0;
        while(number > 0){
            result= number%10;
            if(result%2 ==0){
                even+=result;
            }
            else{
                odd+=result;
            }
            number=number/10;

        }
        if(odd==even){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


    }
}
