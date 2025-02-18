package banco;

public class ContaBancaraia {
    private String banco;
    private int agencia;
    private int numeroDaconta;
    private String tipodaConta;
    private String saldoAtual;
    private String limiteDisponivel;
    
    public ContaBancaraia() {
    }

    

    public ContaBancaraia(String banco, int agencia, int numeroDaconta, String tipodaConta, String saldoAtual,
            String limiteDisponivel) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroDaconta = numeroDaconta;
        this.tipodaConta = tipodaConta;
        this.saldoAtual = saldoAtual;
        this.limiteDisponivel = limiteDisponivel;
    }



    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroDaconta() {
        return numeroDaconta;
    }

    public void setNumeroDaconta(int numeroDaconta) {
        this.numeroDaconta = numeroDaconta;
    }

    public String getTipodaConta() {
        return tipodaConta;
    }

    public void setTipodaConta(String tipodaConta) {
        this.tipodaConta = tipodaConta;
    }

    public String getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(String saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public String getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(String limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    public String toString() {
        return "Banco:" + banco + 
        "\nAgencia:" + agencia + 
        "\nNumero Da conta:" + numeroDaconta + 
        "\nTipo da Conta:" + tipodaConta + 
        "\nSaldo Atual:" + saldoAtual + 
        "\nLimite Disponivel:" + limiteDisponivel + "";
    }

    
}
