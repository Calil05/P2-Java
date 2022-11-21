package Uber;

// Encapsulamento Utilizado
// Herança Utilizada
// Polimorfismo Utilizado

public class Passageiro extends Pessoa{

    // Encapsulamento Aqui

    private String formaDePagamento;

    public Passageiro() {

    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public void mostraPassageiro() {

        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("CPF: "+this.getCPF());
        System.out.println("Forma de Pagamento: "+this.getFormaDePagamento());

    }
    
}
