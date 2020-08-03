import java.util.Scanner;

public class p15 {
    public static void main(String[] args) {
        final Scanner myInput = new Scanner(System.in);
        final int nr = myInput.nextInt();
        System.out.println(valoare(nr));
    }

    static int valoare(int nr){
        int mod,max=0,c=0;
        while(nr!=0){
            mod=nr%10;
            if(mod>max){
                max=mod;
                c=0;}
            if(mod==max)
                c++;
            nr=nr/10;
        }
        return c;
    }
}
