import java.util.Scanner;

public class p16 {
    public static void main(String[] args) {
        final Scanner myInput = new Scanner(System.in);
        final int nr = myInput.nextInt();
        valoare(nr);
    }

    static void valoare(int nr){
        int mod,min=999,c=0;
        while(nr!=0){
            mod=nr%10;
            if(mod<min) {
                min = mod;
                c = 0;
            }
            if(mod==min)
                c++;
            nr=nr/10;
        }
        System.out.println(c);
    }
}
