public class Overloading2 {
    public static void main(String[] args) {
        int x=12,y=3;
        System.out.println(totalCif(x));
        System.out.println(totalCif(x,y));
    }

    static int totalCif(int x){
        //int cifre=getnrcif(x);
        return getnrcif(x);
    }

    static int totalCif(int x,int y){
        //int cifre_x=getnrcif(x);
        //int cifre_y=getnrcif(y);
        return getnrcif(x)+getnrcif(y);
    }


    static int getnrcif(int x){
        int mod,c=0,d=0;
        while(x!=0){
            mod=x%10;
            c++;
            x=x/10;
        }
        return c;
    }
}
