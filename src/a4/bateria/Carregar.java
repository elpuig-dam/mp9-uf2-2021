package a4.bateria;

public class Carregar extends Thread {
    private Bateria bateria;

    public Carregar(Bateria bateria) {
        this.bateria = bateria;
    }

    @Override
    public void run() {
        while(bateria.getNivell() < 100) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.println(carrega);
            bateria.carregar();
        }
        System.out.println("fi de la carrega");
        bateria.plena = true;
    }
}
