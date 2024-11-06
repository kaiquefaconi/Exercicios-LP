public class Contato {
    private String nome;
    private String telefone;
    private Boolean bloqueado;
    private String tipoContato;

    public Contato(String nome, String telefone, String tipoContato) {
        this.nome = nome;
        this.telefone = telefone;
        this.bloqueado = false;
        this.tipoContato = tipoContato;
    }

    public void bloquear() {
        bloqueado = true;
    }

    public void desbloquear() {
        bloqueado = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getBloqueado() {
        return bloqueado;
    }

    @Override
    public String toString() {

        return """
                Nome: %s
                Telefone: %s
                Bloqueado: %s
                """.formatted(nome, telefone, (bloqueado ? "Sim" : "Não"));
    }

    public String getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(String tipoContato) {
        this.tipoContato = tipoContato;
    }
}
