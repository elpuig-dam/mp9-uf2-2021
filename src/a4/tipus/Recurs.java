package a4.tipus;

public class Recurs {
    public static int MAXIM = 10;
    private boolean lliure;
    private int qtatA, qtatB;

    public Recurs() {
        lliure = true;
        qtatA = 0;
        qtatB = 0;
    }

    public synchronized void agafar(Thread thread) {
        if(thread instanceof A) {
           // System.out.println("Sóc A");
            try {
                while ((qtatA + 1) * 2 > qtatB || qtatA+qtatB >= MAXIM){
                    //System.out.println("esperant...");
                    wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            qtatA++;
            System.out.println("A->" + qtatA + " B->" + qtatB);
        }else {
            try {
                while (qtatB + qtatA >= MAXIM) wait();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            qtatB++;
        }

        notifyAll();

    }

    public synchronized void deixar(Thread thread) {
        if(thread instanceof A) qtatA--;
        if(thread instanceof B) qtatB--;
        notifyAll();
    }
}
