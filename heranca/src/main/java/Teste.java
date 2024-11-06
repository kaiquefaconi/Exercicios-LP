public class Teste {
    public static void main(String[] args) {
        Faculdade faculdade01 = new Faculdade("SPTech");

        Aluno aluno01 = new Aluno("123", "roida", 10.0, 7.5, 0);
        Aluno aluno02 = new Aluno("1234", "roida total", 4.0, 9.2, 4);


        AlunoPos aluno03 = new AlunoPos("345", "fagner", 5.5, 7.3, 2, 7.1, 8.5);
        faculdade01.matricular(aluno01);
        faculdade01.matricular(aluno02);

       Double somaNotas = faculdade01.somaNotasEntregas(5.0);
        System.out.println("A soma das notas é " + somaNotas);

        System.out.println("Nota do aluno pós: " +  aluno03.calcularMedia());
    }

}
