package banco;

public class Main {
    public static void main(String[] args) {
        
        ContaBancaraia contaBanco = new ContaBancaraia("Caixa Economica", 91, 15487896, "Poupanca", "0.82", "5000" );
        Funcionario funcionario = new Funcionario("09914785", "Maria", "Rua cardeal Jean", 71981414, "maria@gmail.com", contaBanco);
        System.out.println(funcionario.toString());
    }

}
