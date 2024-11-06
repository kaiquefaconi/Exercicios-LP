import java.util.ArrayList;
import java.util.List;

public class Album {
    private String nome;
    private Integer qtdPremios;
    private List<Musica> musicas;

    public Album( String nome, Integer qtdPremios) {
        this.nome = nome;
        this.qtdPremios = qtdPremios;
        this.musicas = new ArrayList<>();
    }

    public void adicionariMusica(Musica musica){
        musicas.add(musica);
    }

    public void exibirMusicasPorQtdLikes(Integer qtdMinimaLikes){
        for (int i = 0; i < musicas.size(); i++) {
            Musica musicaDaVez = musicas.get(i);
            if (musicaDaVez.getQtdLikes() >= qtdMinimaLikes){
                System.out.println(musicaDaVez);
            }
        }

        //Enhanced for:
        for (Musica musicaDaVez: musicas){
            if (musicaDaVez.getQtdLikes() >= qtdMinimaLikes){
                System.out.println(musicaDaVez);
            }
        }
    }



    public String getNome() {
        return nome;
    }

    public Integer getQtdPremios() {
        return qtdPremios;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtdPremios(Integer qtdPremios) {
        this.qtdPremios = qtdPremios;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    @Override
    public String toString(){
        return """
                Nome: %s
                qtdPremios: %d
                
                """.formatted(nome,qtdPremios);
    }
}
