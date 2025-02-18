package bastrato;

public class Cliente {
    
    protected String nome;
    protected int idade;
    protected Endereco endereco;

    public Cliente() {
    }
    

    @Override
    public String toString() {
        return  "\nNome:" + nome + 
                "\nIdade:" + idade + 
                "\nEndereco:" + endereco + "";
    
                            }

    public Cliente(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    

    

}
    
