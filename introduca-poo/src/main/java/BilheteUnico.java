public class BilheteUnico {

    //Atributos = Caracteristicas de um objeto

    String nomeTitular;
    Double saldo;
    String codigo;
    Integer qtdVezesUsada;

    //Métodos = Comportamentos
    void carregar(Double valorRecarga){
        if(valorRecarga > 0.0){
            saldo+= valorRecarga;
            System.out.println("Recarga feita");
        }else {

        }


    }

    Boolean usar(){

        if(saldo >= 5.0){
            saldo -= 5.0;
            qtdVezesUsada++;
           return true;
        }else {
           return false;
        }
    }

}
