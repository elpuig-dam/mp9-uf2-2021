package a4.bateria;

public class Descarregar extends Thread {
    private Bateria bateria;

    public Descarregar(Bateria bateria) {
        this.bateria = bateria;
    }

    @Override
    public void run() {
        while(bateria.getNivell() > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.println(carrega);
            bateria.descarregar();
        }
        System.out.println("bateria al 0%");
        bateria.buida = true;
    }
}
