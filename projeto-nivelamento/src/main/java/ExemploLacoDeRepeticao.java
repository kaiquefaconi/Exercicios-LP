import java.util.concurrent.ThreadLocalRandom;

public class ExemploLacoDeRepeticao {
    public static void main(String[] args) {
        // For que exibi numeros de 0 a 10

        for(int i =0; i<11; i++){
            System.out.println(i  + "\n");
        }
        Integer contador = 0;
        while (contador < 11){
            System.out.println(contador  + "\n");
            contador++;
        }
        System.out.println(" \n Terminei o while");

Integer numerosAleatorios = ThreadLocalRandom.current().nextInt(0,10);
while (!numerosAleatorios.equals(9)){
    System.out.println(numerosAleatorios);
    numerosAleatorios = ThreadLocalRandom.current().nextInt(0,10);
}


    }
}
