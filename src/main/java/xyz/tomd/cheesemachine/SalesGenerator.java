package xyz.tomd.cheesemachine;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class SalesGenerator {

    public static String[] CHEESES = {
            "Camembert", "Stilton", "Danish Blue", "Cambozola",
            "Roquefort", "Stichelton", "Lanark Blue", "Red Leicester (Unflavoured)",
            "Lincolnshire Poacher", "Caerphilly", "Comte", "Emmental",
            "Gruyère", "Reblochon", "Port Salut", "Jarlsberg"
    };

    public static String[] CUSTOMERS = {
            "Marks & Spencer", "Farm Shop"
    };

    private int sales = 0;

    public SalesGenerator() {
//        sales = 0;
    }

    public void generate() throws InterruptedException {
        Random random = new Random();
        int cheese;
        int weight;
        int customer;
        int delay;

        while(true) {
            cheese = random.nextInt(CHEESES.length);
            weight = random.nextInt(100);
            customer = random.nextInt(CUSTOMERS.length);
            delay = random.nextInt(100);

            System.out.println(CUSTOMERS[customer] + " just bought " + weight + "kg of " + CHEESES[cheese]);
            sales++;
            Thread.sleep(5 + delay);
        }
    }
}
