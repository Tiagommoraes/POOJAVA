public class TestaAluno {
    public static void main(String[] args) {
        Disciplina d1 = new Disciplina("Matemática", 60);
        Aluno a1 = new Aluno("Tiago", 3223,  8,7, 6, 9, 7,d1 );
        Aluno a2 = new Aluno("Tiago", 3223,  5,7, 6, 3, 7, d1);


        System.out.print("Situação do aluno: " + a1.nome + " = " + a1.SituacaoAluno() + " Com Média " + a1.calcularMedia());
        System.out.print("\nSituação do aluno: " + a2.nome + " = " + a1.SituacaoAluno() + " Com Média " + a1.calcularMedia());
        System.out.print( "\nDisciplina preferida: " + a1.Disciplina_preferida.nome);
    }
}
