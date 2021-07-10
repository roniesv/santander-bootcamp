package javaDate;
import java.util.Date;

/**
 * Exemplo de utilizacao de construtor de classe Date
 */

public class Exemplo002 {
    public static void main(String[] args) {
        Long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);
        Date novaData = new Date(currentTimeMillis);
        System.out.println(novaData);
    }
}
