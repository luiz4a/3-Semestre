package banco;

public class Funcionario {
    private String codigoFuncionario;
    private String nome;
    private String endereco;
    private int telefone;
    private String email;
    private ContaBancaraia contaBanco;
    
    public Funcionario() {
    }

    public Funcionario(String codigoFuncionario, String nome, String endereco, int telefone, String email,
            ContaBancaraia contaBanco) {
        this.codigoFuncionario = codigoFuncionario;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contaBanco = contaBanco;
    }

    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContaBancaraia getContaBanco() {
        return contaBanco;
    }

    public void setContaBanco(ContaBancaraia contaBanco) {
        this.contaBanco = contaBanco;
    }

    @Override
    public String toString() {
        return "Codigo do Funcionario:" + codigoFuncionario + 
        "\nNome:" + nome + 
        "\nEndereco:" + endereco +
        "\nTelefone:" + telefone + 
        "\nEmail:" + email + 
        "\nConta Banco:" + contaBanco + "";
    }

    

}
