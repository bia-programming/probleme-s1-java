import java.util.Scanner;

public class p14 {
    public static void main(String[] args) {
        final Scanner myInput = new Scanner(System.in);
        final int nr = myInput.nextInt();
        afisare(nr);
    }

    static void afisare(int x){
        int mod,min=999;
        while (x!=0){
            mod=x%10;
            if(mod<min)
                min=mod;
            x=x/10;
        }
        System.out.println(min);
    }
}
