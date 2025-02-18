package bastrato;

public class MainCliente  {
    public static void main(String[] args) {
        
       // Cliente cliente = new Cliente ("Maria", 19, Endereco: endereco);

       Endereco endereco = new Endereco ("Rua Cardeal Jean", "45", "Salvador");
       
       
       Cliente cliente = new Cliente ("Maria Luiza", 19, endereco);
       System.out.println("=====================");
       System.out.println(cliente.toString());

       
    }


}
