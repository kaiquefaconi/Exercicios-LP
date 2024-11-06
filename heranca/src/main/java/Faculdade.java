import java.util.ArrayList;
import java.util.List;

public class Faculdade {

    private String nome;
    private List<Aluno>alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public void matricular(Aluno aluno){
        alunos.add(aluno);
    }

    public Double somaNotasEntregas(Double notaEntregaMinima){
        Double soma =0.0;
        for(Aluno alunoDaVez : alunos){
            if (alunoDaVez.getNotaEntrega() >= notaEntregaMinima){

            soma+= alunoDaVez.getNotaEntrega();
            }
        }
                return soma;
    }




    public List<Aluno> buscaAlunoPorNome(String nomeBusca){
        List<Aluno> alunosFiltrados = new ArrayList<>();

        for (Aluno alunoDaVez : alunos){
            String nomeDaVez = alunoDaVez.getNome().toLowerCase();
            if (alunoDaVez.getNome().equals(nomeBusca)){
                alunosFiltrados.add(alunoDaVez);
            }
        }

        return alunosFiltrados;
    }

    public void deletarAlunos(){
        alunos.clear();
    }

}
