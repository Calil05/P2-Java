package Uber;

// Nomes:
// David Marques
// Gabriel Calil

public class TesteUber {
    public static void main (String args[]){
        
        Motorista m1 = new Motorista();
        Passageiro p1 = new Passageiro();
        Calcula_Tarifa c1 = new Calcula_Tarifa();


        m1.setNome("Favan");
        m1.setIdade(25);
        m1.setCPF(111222333);
        m1.setCarro("Chevrolet Camaro 2018");
        m1.setAvaliacao(5);
        m1.setQuantPassageiro(4);

        System.out.println("Dados do Motorista:");
        System.out.println("--------------------");
        m1.mostraMotorista();
        System.out.println("--------------------");
        System.out.println(" ");
    
        p1.setNome("Hilario");
        p1.setIdade(35);
        p1.setCPF(333222111);
        p1.setFormaDePagamento("Cheque");

        System.out.println("Dados do Passageiro:");
        System.out.println("--------------------");
        p1.mostraPassageiro();
        System.out.println("--------------------");
        System.out.println(" ");

        c1.setDestino("Marilia");
        c1.setDistancia(40);
        c1.setValorInicial(5);

        System.out.println("Dados da Viagem:");
        System.out.println("--------------------");
        c1.mostraViagem();
        c1.Calculadora(5);
        System.out.println("--------------------");
        System.out.println(" ");

        m1.capacidade();
    }
    
}
