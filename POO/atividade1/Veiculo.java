package atividade1;

public class Veiculo {

 private String placa;
 private String cor;
 private int Npassageiros;
 private String CapacidadeTanque;
 private String VelocidadeMaxim;
 private String ConsumoMedio;

    public Veiculo() {
}
    public Veiculo(String placa, String cor, int npassageiros, String capacidadeTanque, String velocidadeMaxim,
        String consumoMedio) {
    this.placa = placa;
    this.cor = cor;
    Npassageiros = npassageiros;
    CapacidadeTanque = capacidadeTanque;
    VelocidadeMaxim = velocidadeMaxim;
    ConsumoMedio = consumoMedio;
}
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getNpassageiros() {
        return Npassageiros;
    }
    public void setNpassageiros(int npassageiros) {
        Npassageiros = npassageiros;
    }
    public String getCapacidadeTanque() {
        return CapacidadeTanque;
    }
    public void setCapacidadeTanque(String capacidadeTanque) {
        CapacidadeTanque = capacidadeTanque;
    }
    public String getVelocidadeMaxim() {
        return VelocidadeMaxim;
    }
    public void setVelocidadeMaxim(String velocidadeMaxim) {
        VelocidadeMaxim = velocidadeMaxim;
    }
    public String getConsumoMedio() {
        return ConsumoMedio;
    }
    public void setConsumoMedio(String consumoMedio) {
        ConsumoMedio = consumoMedio;
    }

 

}
