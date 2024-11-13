public enum Plano {
    BRONZE("Plano mais em conta", 80.0),
    PRATA("Plano ideal", 90.5),
    OURO("Plano perfeito", 100.8);

    private String descricao;
    private Double valor;


    Plano(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }


}
