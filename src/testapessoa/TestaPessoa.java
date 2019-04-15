package testapessoa;

public class TestaPessoa {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("maria", "001");
        Aluno a = new Aluno("maria", "001", 7);
        a.MostraAtributos();
        a.AtribuiNota();
        
        
        Pessoa p2 = new Pessoa("joao", "002");
        Aluno a2 = new Aluno("joao", "002", 5);
        a2.MostraAtributos();
        a2.AtribuiNota();
        
        
        Pessoa p = new Pessoa("lucas", "003");
        Professor pr = new Professor("lucas", "003", 997.00);
        pr.MostraAtributos();
        pr.ReajustaSalario();
    }
}
