package atividade1;

public class Cliente2 {
    private String nome;
    private int idade;
    private String CPF;
    private String endereco;
    private String telefone;
    
    public Cliente2() {
    }

    

    @Override
    public String toString() {
        return "Cliente2 [nome=" + nome + ", idade=" + idade + ", CPF=" + CPF + ", endereco=" + endereco + ", telefone="
                + telefone + "]";
    }



    public Cliente2(String nome, int idade, String cPF, String endereco, String telefone) {
        this.nome = nome;
        this.idade = idade;
        CPF = cPF;
        this.endereco = endereco;
        this.telefone = telefone;
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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    
}
