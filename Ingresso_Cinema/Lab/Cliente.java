package Lab;

public class Cliente { //Atributos
    String nome;
    int anoNasc;
    String cpf;
    String telefone;
    Ingresso ingresso;
  


    public void imprimeDados() {

        System.out.println("Nome: " + this.nome);
        System.out.println("Nascimento: " + this.anoNasc);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);


    }


}