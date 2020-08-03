import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
        final Scanner myInput = new Scanner(System.in);
        final int nr = myInput.nextInt();
        afisare(nr);
    }

    static void afisare(int a){
        int mod,max=0;
        while(a!=0){
            mod=a%10;
            if(mod>max)
                max=mod;
            a=a/10;
        }
        System.out.println(max);
    }
}
