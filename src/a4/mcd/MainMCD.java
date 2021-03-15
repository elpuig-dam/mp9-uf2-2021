package a4.mcd;

public class MainMCD {


    public static void main(String[] args) {
        System.out.println(mcd(6,20));

    }

    //f(a,b) = f(b, a % b)
    public static int mcd(int a, int b) {
        if(b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }

    }
}
