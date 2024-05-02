package Calc_Package;
/**
 * Classe que representa um aluno.
 */
public class Aluno {
    // Pesos para cálculo da média final
    final double peso_trabalho = 2.0;
    final double peso_prova = 2.5;
    final double mf_minima = 7.0;

    // Atributos do aluno
    private String Nome_Completo;
    private String Matricula;
    private double notas[] = new double[3];
    private double media_final;

    /**
     * Define o nome completo do aluno.
     *
     * @param nome_Completo O nome completo do aluno.
     */
    public void setNome_Completo(String nome_Completo) {
        Nome_Completo = nome_Completo;
    }

    /**
     * Retorna o nome completo do aluno.
     *
     * @return O nome completo do aluno.
     */
    public String getNome_Completo() {
        return this.Nome_Completo;
    }

    /**
     * Define a matrícula do aluno.
     *
     * @param matricula A matrícula do aluno.
     */
    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    /**
     * Retorna a matrícula do aluno.
     *
     * @return A matrícula do aluno.
     */
    public String getMatricula() {
        return this.Matricula;
    }

    /**
     * Define as notas do aluno.
     *
     * @param notas Um vetor contendo as notas do aluno.
     * @param x     A nota da primeira prova.
     * @param y     A nota da segunda prova.
     * @param z     A nota do trabalho.
     */
    public void setNotas(double[] notas, double x, double y, double z) {
        this.notas[0] = x;
        this.notas[1] = y;
        this.notas[2] = z;
    }

    /**
     * Retorna as notas do aluno.
     *
     * @param notas O vetor contendo as notas do aluno.
     * @return Um vetor contendo as notas do aluno.
     */
    public double[] getNotas(double[] notas) {
        return this.notas;
    }

    /**
     * Retorna a média final do aluno.
     *
     * @return A média final do aluno.
     */
    public double getMedia_final() {
        return this.media_final;
    }

    /**
     * Define a média final do aluno.
     *
     * @param mf_minima A média mínima para aprovação.
     * @param notas     O vetor contendo as notas do aluno.
     */
    public void setMedia_final(double mf_minima, double[] notas) {
        media_final = ((notas[0] * peso_prova) + (notas[1] * peso_prova) + (notas[2] * peso_trabalho)) / (peso_prova * 2 + peso_trabalho);
    }
}
