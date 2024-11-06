import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        BilheteUnico bilhete01 = new BilheteUnico();
        bilhete01.saldo = 0.0;
        bilhete01.nomeTitular = "Bob";
        bilhete01.qtdVezesUsada = 0;
        bilhete01.codigo = "B001";

        BilheteUnico bilhete02 = new BilheteUnico();
        bilhete02.saldo = 0.0;
        bilhete02.nomeTitular = "José";
        bilhete02.qtdVezesUsada = 0;
        bilhete02.codigo = "B002";

        bilhete01.carregar(42.1);
        Boolean deuCerto1 = bilhete01.usar();
        bilhete02.carregar(10.0);
        Boolean deuCerto2 = bilhete02.usar();
        System.out.println("Uso do B2 deu certo? " + deuCerto2);
        System.out.println("Uso do B1 deu certo? " + deuCerto1);
        System.out.println("Saldo do B1 " + bilhete01.saldo);
        System.out.println("Saldo do B2 " + bilhete02.saldo);
    }
}
