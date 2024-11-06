import java.util.List;

public class MetodosComLista {
    void exibeListaDeNomes(List<String> nomes){
        for (int i = 0; i < nomes.size() ; i++) {
            System.out.println("""
                    Nome %d: %s""".formatted(i, nomes.get(i)));


            //add - adiciona elemento
            //size - retorna o tamanho
            //get - busca elemento por indice
            //set -altera elemento por indice
            //remove - remove o elemento por indice
            //isEmpty - retorna true se a lista estiver vazia
            //clear - limpa a lista


        }
    }
}
