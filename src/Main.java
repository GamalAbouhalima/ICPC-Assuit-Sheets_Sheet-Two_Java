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
    public static void main(String[] args) {
        oneTwoN();
    }
}