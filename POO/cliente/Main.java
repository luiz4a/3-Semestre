package cliente;

public class Main {
    public static void main(String[] args) {
              
        
        Cliente cliente1 = new Cliente();

        cliente1.setNome("Marta");
        cliente1.setEmail("maria123@gmail.com");
        cliente1.setSenha("123Abc");

        System. out.println ("Nome: " + cliente1.getNome () );
        System. out.println("E-mail: " + cliente1.getEmail());
        System. out.println("Senha: " + cliente1.getSenha());
        
        System.out.println("==========================");
        
        Cliente cliente2 = new Cliente ("Luiz", "Luizdias@gmail.com", "1234Abc");
        System.out.println(cliente2.toString());

        //System. out.println ("Nome: " + cliente2.getNome () );
        //System. out.println("E-mail: " + cliente2.getEmail());
        //System. out.println("Senha: " + cliente2.getSenha());
            }
    }


