import java.util.Scanner;

public class OperacoesMatematicas {

    public static void main(String[] args) {

//Crie um programa em Java que:
//
//Ofereça as seguintes opções ao usuário:
//1 - Somar
//2 - Subtrair
//3 - Multiplicar
//4 - Sair
//Enquanto o usuário não digitar uma opção válida, continue perguntando qual opção ele deseja
//Ao digitar uma opção válida, pergunte dois números e realize a operação
//Utilize switch-case para validar as opções escolhidas
//Só encerre o programa ao escolher a opção 4


        Scanner leitor = new Scanner(System.in);
        System.out.println("""
                1 - Somar
                2 - Subtrair
                3 - Multiplicar
                4 - Sair
                """);
        Integer escolha = leitor.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Digite um numero para sua soma");
                Integer num1 = leitor.nextInt();
                System.out.println("Digite o segundo numero para sua soma");
                Integer num2 = leitor.nextInt();
                Integer soma = num1 + num2;
                System.out.println(soma);
                break;

            case 2:
                System.out.println("Digite um numero para sua soma");
                Integer num3 = leitor.nextInt();
                System.out.println("Digite o segundo numero para sua soma");
                Integer num4 = leitor.nextInt();
                Integer subtracao = num3 - num4;
                System.out.println(subtracao);
                break;

            case 3:
                System.out.println("Digite um numero para sua soma");
                Integer num5 = leitor.nextInt();
                System.out.println("Digite o segundo numero para sua soma");
                Integer num6 = leitor.nextInt();
                Integer multiplicacao = num5 * num6;
                System.out.println(multiplicacao);
                break;

            case 4:
                System.out.println("""
                        
                        ███████╗██╗░░██╗██╗████████╗░░░░░░░░░
                        ██╔════╝╚██╗██╔╝██║╚══██╔══╝░░░░░░░░░
                        █████╗░░░╚███╔╝░██║░░░██║░░░░░░░░░░░░
                        ██╔══╝░░░██╔██╗░██║░░░██║░░░░░░░░░░░░
                        ███████╗██╔╝╚██╗██║░░░██║░░░██╗██╗██╗
                        ╚══════╝╚═╝░░╚═╝╚═╝░░░╚═╝░░░╚═╝╚═╝╚═╝
                        """);
        }

    }
}
