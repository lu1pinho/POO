package Calc_Package;

public class Prog {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        double[] notas = new double[3];

        // Setters 
        aluno.setNome_Completo("Lucas");
        aluno.setMatricula("15249520");
        aluno.setNotas(notas, 10, 5, 6);
        System.out.println(aluno.getNome_Completo());
        
        // Guardando notas atraves do Getter
        notas = aluno.getNotas(notas);;

        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println(notas[2]);

        aluno.setMedia_final(7, notas);
        System.out.println(aluno.getMedia_final()); // Getter que calcula media finak.
        System.out.println(aluno.getMatricula()); // Getter que retorna matricula.
    }
}
