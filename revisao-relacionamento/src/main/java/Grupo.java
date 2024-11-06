import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nome;
    private List<Contato> contatos;

    public Grupo(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList<>();
    }

    public void adicionar(Contato c) {
        contatos.add(c);
    }

    public void removerPorNome(String nomeRemover) {
        for (int i = 0; i < contatos.size(); i++) {
            Contato contatoDaVez = contatos.get(i);

            if (contatoDaVez.getNome().equals(nomeRemover)) {
                contatos.remove(i);
            }
        }

    }

    public void removerPorTipo(String tipoRemover) {
        for (int i = 0; i < contatos.size(); i++) {
            Contato contatoDaVez = contatos.get(i);
            if(contatoDaVez.getTipoContato().equals(tipoRemover)) {
                contatos.remove(i);
            }
        }
    }
    public Integer getQuantidadeBloqueados() {
       return 0;
    }
/*Integer qtdBloqueado =0;
    for(int i = 0;i < contatos.size();i++){
        if(contatos.get(i).getBloqueado()){

        }*/


    // Crie na classe contato um atributo chamado valorDuracao
    // Nessa classe, complete o seguinte método

    public Double somaValorDuracoes() {
        return 0.0;
    }

}
