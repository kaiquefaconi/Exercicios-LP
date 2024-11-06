public class Bicicleta extends Veiculo {

    private Double calibragemPneu;

    public Bicicleta(String nomeCliente, String marca, Integer anoFabricacao, Double calibragemPneu) {
        super(nomeCliente, marca, anoFabricacao);
        this.calibragemPneu = calibragemPneu;
    }

    @Override
    public void exibirRelatorio(){
        System.out.println("Relatorio da bike de: " + nomeCliente);

        if (calibragemPneu < 0.2){

        }
    }
}
