import java.sql.SQLOutput;
import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero entre 1 e 7: ");
       Integer diaSemana = leitor.nextInt();
//
        System.out.println(diaSemana);
//
//        if(diaSemana.equals(1)){
//            System.out.println("Domingo");
//        }else if(diaSemana.equals(2)){
//            System.out.println("Segunda-feira");
//        } else if (diaSemana.equals(3)) {
//            System.out.println("Terça-feira");
//        } else if (diaSemana.equals(4)) {
//            System.out.println("Quarta-feira");
//        }else if(diaSemana.equals(5)){
//            System.out.println("Quinta-feira");
//        } else if (diaSemana.equals(6)) {
//            System.out.println("Sexta-feira");
//        }else if (diaSemana.equals(7)){
//            System.out.println("Sabado");
//        }else{
//            System.out.println("Numero da semana invalido");
//        }

        switch (diaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("ERRO");
        }
    }
}
