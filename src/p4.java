public class p4 {
    public static void main(String[] args) {
        int x=123456;
        par(x);
        impar(x);
    }

    static void par(int nr){
        int mod,sum=0;
        while(nr!=0){
            mod=nr%10;
            if(mod%2==0)
                sum=sum+mod;
            nr=nr/10;
        }
        System.out.println(sum);
    }

    static void impar(int nr){
        int mod,sum=0;
        while(nr!=0){
            mod=nr%10;
            if(mod%2==1)
                sum=sum+mod;
            nr=nr/10;
        }
        System.out.println(sum);
    }
}
