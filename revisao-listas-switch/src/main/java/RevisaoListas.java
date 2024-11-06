import java.util.ArrayList;
import java.util.List;

public class RevisaoListas {

    public static void main(String[] args) {
//
//        List<String> frutas = new ArrayList<>();
//
//        frutas.add("Laranja");
//        frutas.add("Goiaba");
//
//
//      System.out.println(frutas);

        List<String> frutasImutavel = List.of("Laranja", "Goiaba", "Limão");
        System.out.println(frutasImutavel);

        List<String> frutasMutaveis = new ArrayList<>(List.of("Laranja", "Limão", "Goiaba"));
        frutasMutaveis.add("Uva");
        System.out.println(frutasMutaveis);

        frutasMutaveis.set(2, "Jaca");
        System.out.println(frutasMutaveis);

        frutasMutaveis.remove("Limão");
        System.out.println(frutasMutaveis);

        for (String frutaDaVez : frutasMutaveis){
            System.out.println(frutaDaVez);
        }

    }
}
