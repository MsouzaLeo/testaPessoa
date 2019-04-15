package testapessoa;

public class Professor extends Pessoa {

    protected double Salario;

    public Professor(String Nome, String CPF, double Salario) {
        super(Nome, CPF);
        this.Salario = Salario;
    }

    protected void ReajustaSalario() {
        if (Salario < 998.00) {
            Salario = 998.00;
            System.out.println("Salário reajustado para o novo salário minimo");
        }
    }
    
    protected void MostraAtributos() {
        System.out.println("Nome: " + Nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Salário: " + Salario);
    }
}
