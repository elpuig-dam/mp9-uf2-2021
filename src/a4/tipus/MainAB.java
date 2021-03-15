package a4.tipus;

public class MainAB {

    public static void main(String[] args) {
        Recurs recurs = new Recurs();
        A[] a = new A[10];
        B[] b = new B[20];

        for(int i=0; i < 10; i++) {
            a[i] = new A(recurs,"A" + i);
            b[i] = new B(recurs,"B" + i);
            a[i].start();
            b[i].start();
        }

        for(int i=11; i < 20; i++) {
            b[i] = new B(recurs,"B" + i);
            b[i].start();
        }

    }
}
