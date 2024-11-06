public class Veiculo {
    protected  String nomeCliente;
    protected String marca;
    protected Integer anoFabricacao;

    public Veiculo(String nomeCliente, String marca, Integer anoFabricacao) {
        this.nomeCliente = nomeCliente;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
    }
public void exibirRelatorio(){
    System.out.println("Veiculo não especificado");
}

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}
