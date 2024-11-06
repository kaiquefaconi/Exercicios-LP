public class Teste {
    public static void main(String[] args) {
        Carro carro01 = new Carro("Bob da Silva", "Fiat", 2013, 0.8, false );
        Bicicleta bicicleta01 = new Bicicleta("Xampson", "Caloi", 2000, 0.8);
        Veiculo veiculo01 = new Veiculo("tom", "x", 2020);

        carro01.exibirRelatorio();
        bicicleta01.exibirRelatorio();
        veiculo01.exibirRelatorio();
    }
}
