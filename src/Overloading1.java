public class Overloading1 {
    public static void main(String[] args) {
        int a=1,b=2,c=3,d=4,e=5,f=6;
        concatenare(a,b);
        concatenare(a,b,c,d);
        concatenare(a,b,c,d,e,f);
    }

    static void concatenare(int a,int b){
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);
        String s = s1 + s2;
        System.out.println(s);
    }

    static void concatenare(int a,int b,int c,int d){
        //int result = a * 1000 + b * 100 + c * 10 + d;
        String s1=Integer.toString(a);
        String s2=Integer.toString(b);
        String s3=Integer.toString(c);
        String s4=Integer.toString(d);
        String s = s1 + s2+ s3+ s4;
        System.out.println(s);
        //(a + "" + b + "" + c )
    }

    static void concatenare(int a,int b,int c,int d,int e,int f){
        String s1=Integer.toString(a);
        String s2=Integer.toString(b);
        String s3=Integer.toString(c);
        String s4=Integer.toString(d);
        String s5=Integer.toString(e);
        String s6=Integer.toString(f);
        String s = s1 + s2+ s3+ s4 +s5 +s6;
        System.out.println(s);
    }
}
