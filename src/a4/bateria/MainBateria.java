package a4.bateria;


import java.util.Scanner;

public class MainBateria {


    public static void main(String[] args) throws InterruptedException {
        Scanner sc  = new Scanner(System.in);
        int op;

        Bateria bateria= new Bateria(0);
        Carregar thCarrega;
        Descarregar thDescarrega;
        do {
            System.out.print("1-Carregar, 2-Jugar, 3-Info Bateria, 0-Sortir: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("iniciem la càrrega");
                    thCarrega = new Carregar(bateria);
                    thCarrega.start();
                    break;
                case 2:
                    if(!bateria.carregada()) System.out.printf("no hi ha prou bateria %d\n",bateria.getNivell());
                    else {
                        System.out.println("Comença el joc...");
                        thDescarrega = new Descarregar(bateria);
                        thDescarrega.start();
                    }
                    break;
                case 3:
                    System.out.printf("El nivell de la bateria és %d\n", bateria.getNivell());
            }
        } while(op !=0);
    }
}
