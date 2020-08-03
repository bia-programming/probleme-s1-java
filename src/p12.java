public class p12 {
    public static void main(String[] args) {
        int nr=365;
        afisare(nr);
    }

    static void afisare(int nr){
        int mod,var=0,rez=0,t=1;
        while(nr!=0){
            mod=nr%10;
            var=10-mod;
            rez=var*t+rez;
            t=t*10;
            nr=nr/10;
        }
        System.out.print(rez);
    }
}
