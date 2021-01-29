package a1;

public class Caixa implements Runnable {
    private int id;
    private Client client;
    private int suma;

    public Caixa(int n) {
        id = n;
        suma = 0;
    }

    public void setClient(Client c) {
        client = c;
    }

    public int getSuma() {
        return suma;
    }

    @Override
    public void run() {
        System.out.println("Caixa " + id + " : " + client.getNom());

        client.getCarret().forEach(p -> suma += p);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
