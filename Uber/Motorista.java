package Uber;

// Encapsulamento Utilizado
// Herança Utilizada
// Polimorfismo Utilizado
// Exception Utilizada

public class Motorista extends Pessoa{

    // Encapsulamento Aqui

    private String carro;
    private int avaliacao;
    private int quantPassageiro;
    
    public Motorista() {

    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getQuantPassageiro() {
        return quantPassageiro;
    }

    public void setQuantPassageiro(int quantPassageiro) {
        this.quantPassageiro = quantPassageiro;
    }

    public void mostraMotorista() {

        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("CPF: "+this.getCPF());
        System.out.println("Carro: "+this.getCarro());
        System.out.println("Avaliação: "+this.getAvaliacao());
        System.out.println("Capacidade: "+this.getQuantPassageiro());
    }

    public void capacidade() {

        // Exception Aqui

        if(this.getQuantPassageiro() > 4) {
            IllegalArgumentException erro = new IllegalArgumentException();
            throw erro;
          }else {
            System.out.println("Corrida Iniciada");
          }

    }
}

