import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Digite seu nome:");
        String nomeUsuario = leitor.nextLine();

        System.out.println("Digite sua idade: ");
        Integer idadeUsuario = leitor.nextInt();

        System.out.println("Digite sua altura:");
        Double alturaUsuario = leitor.nextDouble();

        //leitor.nextDouble()
        //leitor.nextInt()


        System.out.println("""
                O nome digitado foi %s
                Sua idade digitada foi %d
                Sua altura é de %.2f""".formatted(nomeUsuario, idadeUsuario, alturaUsuario));

    }
}
