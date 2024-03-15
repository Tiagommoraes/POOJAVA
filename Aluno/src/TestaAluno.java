public class TestaAluno {
    public static void main(String[] args) {
        Disciplina d1 = new Disciplina(" Matemática ",60);
        Disciplina d2 = new Disciplina(" Física ", 60);
        Aluno a1 = new Aluno("Tiago", 12120303, 5, 6, 6, 5,3, d1);
        Aluno a2 = new Aluno(" Ayla ", 3223, 10, 10, 8, 9, 8, d2);

        System.out.println("Situação do Aluno 1: " + a1.nome + " = " + a1.situaçãoAluno() + " Com média: " + a1.calcularMedia());
        System.out.println("Situação do Aluno 2: " + a2.nome + " = " + a2.situaçãoAluno() + " Com média: " + a2.calcularMedia());
        System.out.println("Disciplina preferida do Aluno 1: " + a1.disciplina_preferida.nome);
        System.out.println("Disciplina preferida do Aluno 2 : " + a2.disciplina_preferida.nome);
    }
}
