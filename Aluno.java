public class Aluno {
    String nome;
    int matricula;
    double nota_mat;
    double nota_por;
    double nota_fis;
    double nota_geo;
    double nota_quim;
    Disciplina  Disciplina_preferida;

    public Aluno( String nome, int matricula, double nota_mat, double nota_por, double nota_fis, double nota_geo, double nota_quim, Disciplina disciplina_preferida){
        this.nome = nome;
        this.matricula = matricula;
        this.nota_mat = nota_mat;
        this.nota_por = nota_por;
        this.nota_fis = nota_fis;
        this.nota_geo = nota_geo;
        this.nota_quim = nota_quim;
        this.Disciplina_preferida = disciplina_preferida;
    }
    double calcularMedia(){
        return (nota_mat + nota_por + nota_fis + nota_geo + nota_quim) /5;
    }
    String SituacaoAluno(){
        String situacao = "Reprovado"; // Aprovado ou Reprovado
        if (calcularMedia() >= 6)
            situacao = "Aprovado";
        return situacao;
    }
}