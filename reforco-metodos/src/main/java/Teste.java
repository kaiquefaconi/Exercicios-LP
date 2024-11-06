public class Teste {
    public static void main(String[] args) {
        MetodosDivertidos metodos = new MetodosDivertidos();

        Integer qtdTentativa = metodos.avaliandoSorte(7 );

        System.out.println("""
                Tentativas feitas: %d   
                """.formatted(qtdTentativa));



Integer soma = metodos.exibeSomaSorteio(0);
        System.out.println("""
                A soma dos
                números é: %d   """.formatted(soma));



    }
}
