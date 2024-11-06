public class ExemploRevisao {
    public static void main(String[] args) {

        //TIpos Wrapper = são classes, ou seja
        // possuem métodos que ajudam :)
        String nome = "Bob da Silva";
        Integer idade = 42;
        Double altura = 1.55;
        Boolean bloqueado = false;

        // Posso declarar a variavel depois de criada (somente Wrapper começa sem valores)
        String nomePet;
        nomePet = "Teste";

        //Já tipo primitvo começa com valores, se não declarar valor vira false

        // Tipo primitivos, não são classes (sem métodos :( )
        boolean bloqueado02 = false;
        int numero = 42;

        System.out.println("Meu nome é " + nome + " minha altura é " + altura + " minha idade é " + idade);

        System.out.println("Meu nome é %s, minha altura é %.2f e minha idade é %d".formatted(nome, altura, idade));

        //println usando interpolação e text block
        System.out.println("""
                Nome: %s
                Idade: %d
                Altura: %.2f
                Nome do Pet: %s
                """.formatted(nome, idade, altura, "Thor"));
    }
}
