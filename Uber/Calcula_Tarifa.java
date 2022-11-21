package Uber;

// Encapsulamento Utilizado
// Herança Utilizada
// Interface Utilizada

public class Calcula_Tarifa extends Viagem implements Calcular{

    // Encapsulamento Aqui 

    private double valorInicial;
    private double valorFinal;

    public Calcula_Tarifa() {
        
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public void mostraViagem() {

        System.out.println("Destino: "+this.getDestino());
        System.out.println("Distancia: "+this.getDistancia()+"Km");
        System.out.println("Valor Inicial: "+this.getValorInicial());
    }

    @Override // Interface Aqui
    public void Calculadora(double valorInicial) {
        
        this.setValorFinal(this.getValorInicial()*getDistancia());
        System.out.println("Valor Final da Viagem: "+this.getValorFinal());
        
    }

    
}
