package Lab;

public class Ingresso { // Atributos

    String nomeFilme;
    String dataFilme;
    String horario;
    int sala;
    double valor;
    Cliente cliente;

    
    public void ValorComDesconto (int anoAtual) {
        int idade = anoAtual - this.cliente.anoNasc;

        if (idade >= 12 && idade <= 15){
            this.valor = this.valor * 0.60;
        }else if (idade >= 16 && idade <= 20){
            this.valor = this.valor * 0.30;
        }else if (idade > 20){
            this.valor = this.valor * 0.20;
        }

        System.out.println("Valor do ingresso com desconto é: " + this.valor);
        

    }

    public void imprimeIngresso(){

        System.out.println("Filme: " + this.nomeFilme);
        System.out.println("Data: " + this.dataFilme);
        System.out.println("Horário: " + this.horario);
        System.out.println("Sala: "+ this.sala);
        System.out.println("Valor: " + "R$" + this.valor);
        System.out.println("Cliente: " + this.cliente.nome);
        this.cliente.imprimeDados();

    }

   
}
