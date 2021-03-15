package a4.tipus;

public class B extends Thread {
    Recurs recurs;

    public B(Recurs recurs, String nom) {
        super(nom);
        this.recurs = recurs;
    }

    @Override
    public void run() {

        for (;;) {
            recurs.agafar(this);
            System.out.println(getName() + " agafa el recurs");
            try {
                Thread.sleep((long) Math.random() * 1000 + 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            recurs.deixar(this);
            try {
                Thread.sleep((long) Math.random() * 5000 + 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
