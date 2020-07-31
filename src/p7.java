import java.util.Scanner;
public class p7 {
    public static void main(String[] args) {
        final Scanner myInput = new Scanner(System.in);
        final int nr = myInput.nextInt();
        System.out.println(prim(nr));
    }
    static boolean prim(int nr){
        int i;
        if(nr==1 || nr==2 || nr==3)
            return true;
        for(i=2;i<nr;i++) {
            if(nr%i==0)
                return false;
            }
            return true;
        }
    }

