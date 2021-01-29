package a1;

import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Supermercat {

    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);

        Client c1 = new Client("pep", Arrays.asList(1,2,3,4,20,30));
        Client c2 = new Client("anna", Arrays.asList(1,2,3,4));

        Caixa caixa1 = new Caixa(1);
        Caixa caixa2 = new Caixa(2);

        caixa1.setClient(c1);
        caixa2.setClient(c2);

        executor.execute(caixa1);
        executor.execute(caixa2);
        executor.shutdown();
        try {
            executor.awaitTermination(Integer.MAX_VALUE, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("suma caixa1: " + caixa1.getSuma());
        System.out.println("suma caixa2: " + caixa2.getSuma());


    }
}
