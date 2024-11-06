import java.util.concurrent.ThreadLocalRandom;

public class ExemploNumerosAleatorios {
    public static void main(String[] args) {

        Integer inteiroAleatorio = ThreadLocalRandom.current().nextInt(0,10);

        System.out.println(inteiroAleatorio);
    }
}
