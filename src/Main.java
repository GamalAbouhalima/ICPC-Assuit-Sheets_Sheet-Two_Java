import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void oneTwoN(){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
    static void EvenNumbers(){
        int i;
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for (i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        if(n==1){
            System.out.println(-1);

        }
    }
    static void Even_Odd_Positive_and_Negative(){
        int evenNumber=0;
        int oddNumber=0;
        int positiveNumber=0;
        int negativeNumber=0;
        int num;
        Scanner scan=new Scanner(System.in);
        int counter=scan.nextInt();
        for (int i=1;i<=counter;i++){
            num=scan.nextInt();
           if(num % 2 == 0){
               evenNumber++;

           }else{
               oddNumber++;

           }
            if(num>0){
                positiveNumber++;
            }else if(num<0) {
                negativeNumber++;
            }
        }

        System.out.println("Even: "+evenNumber);
        System.out.println("Odd: "+oddNumber);
        System.out.println("Positive: "+positiveNumber);
        System.out.println("Negative: "+negativeNumber);


    }
    static void  Fixed_Password(){
        int password;
        Scanner scan=new Scanner(System.in);
        while (true){
            password=scan.nextInt();
            if (password==1999){
                System.out.println("Correct");
                break;
            }else {
                System.out.println("Wrong");
            }

        }
    }
    public static void main(String[] args) {
//        oneTwoN();
//        EvenNumbers();
//        Even_Odd_Positive_and_Negative();
        Fixed_Password();
    }
}