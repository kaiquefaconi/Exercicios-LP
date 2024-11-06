public class Carro extends Veiculo{

    private Double nivelOleo;
    private  Boolean possuiEstep;

    public Carro(String nomeCliente, String marca, Integer anoFabricacao, Double nivelOleo, Boolean possuiEstep) {
        super(nomeCliente, marca, anoFabricacao);
        this.nivelOleo = nivelOleo;
        this.possuiEstep = possuiEstep;
    }

    @Override
    public void exibirRelatorio(){
        System.out.println("Relatorio de carro " + nomeCliente);
        if (possuiEstep){
            System.out.println("Estepe ok");
        }else {
            System.out.println("Compre um estepe com a gente :)");
        }

        if (nivelOleo<0.5){
            System.out.println("Nível de óleo abaixo, complete aqui :)");
        }else{
            System.out.println("Nível de óleo ok");
        }
    }

    public Double getNivelOleo() {
        return nivelOleo;
    }

    public Boolean getPossuiEstep() {
        return possuiEstep;
    }

    public void setNivelOleo(Double nivelOleo) {
        this.nivelOleo = nivelOleo;
    }

    public void setPossuiEstep(Boolean possuiEstep) {
        this.possuiEstep = possuiEstep;
    }
}

