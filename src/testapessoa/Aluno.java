package testapessoa;

public class Aluno extends Pessoa {

    protected int Nota;

    public Aluno(String Nome, String CPF, int Nota) {
        super(Nome, CPF);
        this.Nota = Nota;
    }

    protected void AtribuiNota() {
        if (Nota >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
    
     protected void MostraAtributos() {
        System.out.println("Nome: " + Nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Nota: " + Nota);
    }
}
