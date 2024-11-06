public class Cofrinho {
        private String meta;
        private Double valorGuardao;
        private Boolean quebrado;


    public Cofrinho( Double valorGuardao, Boolean quebrado) {
        this.meta = "Não possui";
        this.valorGuardao = valorGuardao;
        this.quebrado = quebrado;
    }


    public Cofrinho(String meta, Double valorGuardao, Boolean quebrado) {
        this.meta = meta;
        this.valorGuardao = valorGuardao;
        this.quebrado = quebrado;
    }
}
