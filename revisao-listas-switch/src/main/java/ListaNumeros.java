import java.util.ArrayList;
import java.util.List;

public class ListaNumeros {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(List.of(1, 2, 3, 4));

        Integer valor = 1;
        numeros.remove(valor);

        System.out.println(numeros);
    }
}
