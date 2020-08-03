import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        final Scanner myInput = new Scanner(System.in);
        final int nr = myInput.nextInt();
        final Scanner Input = new Scanner(System.in);
        final int x = Input.nextInt();
        System.out.println(valoare(nr,x));
    }

    static int valoare(int nr,int x){
        int mod,c=0,rez;
        while(nr!=0){
            mod=nr%10;
            if(x==mod)
                c++;
            nr=nr/10;
        }
        return c;
    }

}
