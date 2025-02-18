package atividade1;

public class MainAtividade {
public static void main(String[] args) {
    

    Veiculo carros = new Veiculo();

    ////cliente.setNome("Maria Dias");
    //cliente.setIdade(18);
    //cliente.setCPF("86633218567");
    //cliente.setEndereco("Rua cardeal jean N44");
    //cliente.setTelefone("71981811414");
    
   Cliente2 cliente = new Cliente2  ("Maria", 18, "86633218567", "Rua cardeal jean", "4156456465");
   System.out.println(cliente.toString());
    //System.out.println("Nome: "+cliente.getNome());
    //System.out.println("Idade:"+cliente.getIdade() );
    //System.out.println("CPF: "+cliente.getCPF());
    //System.out.println("Endereco: " +cliente.getEndereco());
    //System.out.println("Telefone: "+ cliente.getTelefone());

    System.out.println("=======================");

    carros.setPlaca("psvd458");
    carros.setCor("Azul");
    carros.setNpassageiros(5);
    carros.setCapacidadeTanque("45.5L");
    carros.setVelocidadeMaxim("250Km");
    carros.setConsumoMedio("1.2L por KM");

    System.out.println("Placa: "+ carros.getPlaca());
    System.out.println("Cor: "+ carros.getCor());
    System.out.println("Numero de Passageiros: "+ carros.getNpassageiros());
    System.out.println("Capacidade do tanque: "+ carros.getCapacidadeTanque());
    System.out.println("Velocidade maxima : "+ carros.getVelocidadeMaxim());
    System.out.println("Consumo Médio : "+ carros.getConsumoMedio());
    

    
}
}
