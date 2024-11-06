import java.util.concurrent.ThreadLocalRandom;

public class MetodosDivertidos {

    Integer avaliandoSorte(Integer numeroEscolhido){
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
        Integer contadorTentativas = 1;

        while (!numeroSorteado.equals(numeroEscolhido)){
            contadorTentativas++;
            numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);

        }

        return contadorTentativas;





    }

    Integer exibeSomaSorteio(Integer numeroSorte) {
        Integer numeroSorteado2 = ThreadLocalRandom.current().nextInt(0, 11);
        Integer soma = 0;

        while (!numeroSorteado2.equals(numeroSorte)) {
            soma += numeroSorteado2;
            numeroSorteado2 = ThreadLocalRandom.current().nextInt(0, 11);
        }
              return soma;
    }

  void exibeImpares(){

        for(int i = 1; i<=90 ;i+=2 ){
            System.out.println(i);
        }

    }

}
