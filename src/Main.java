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

    public static void main(String[] args) {
//        oneTwoN();
        EvenNumbers();
    }
}