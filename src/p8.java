import java.util.Scanner;
public class p8 {
    public static void main(String[] args) {
        final Scanner myInput = new Scanner(System.in);
        final int nr = myInput.nextInt();
        cifre(nr);
    }

    static void cifre(int nr){
        int mod,c=0,d=0;
        while(nr!=0){
            mod=nr%10;
            if(mod%2==0)
                c++;
            else
                d++;
            nr=nr/10;
        }
        System.out.println("Nr de cifre pare: "+c +"\n Nr de cifre impare: "+d);

    }
}
