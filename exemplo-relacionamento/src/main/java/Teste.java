public class Teste {
    public static void main(String[] args) {
        Musica musica01 = new Musica("Billie Jean", "Michael J.", 4.5);
        Musica musica02 = new Musica("Exagerado", "Cazuza",2.7 );

        Album album01 = new Album("Tops 90s", 2);

        album01.adicionariMusica(musica01);

        Album album02 = new Album("Favoritas", 10);

        album02.adicionariMusica(musica01);
        album02.adicionariMusica(musica02);

        System.out.println(album01);
        System.out.println(musica02);
    }
}
