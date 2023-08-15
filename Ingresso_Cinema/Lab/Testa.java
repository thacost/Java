package Lab;

public class Testa {
    public static void main(String[] args){

        //* Criando Clientes */

        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();

        
        c1.nome = "Bruno Silva";
        c1.anoNasc = 2009;
        c1.cpf = "133.456.77-99";
        c1.telefone = "(35) 9 9878-6566";

        c2.nome = "Ana Maria";
        c2.anoNasc = 2005;
        c2.cpf = "369.457.120-59";
        c2.telefone = "(35) 9 9191-8956";
        


        //* Imprimindo Clientes */

        System.out.println("");
        System.out.println("---- Dados do Cliente ----");
        c1.imprimeDados();

        System.out.println("");
        System.out.println("---- Dados do Cliente ----");
        c2.imprimeDados();


        //* Criando Filmes */

        Ingresso filme1 = new Ingresso();
        Ingresso filme2 =  new Ingresso();
         
        filme1.nomeFilme = "Creed III";
        filme1.dataFilme = "03-03-2023";
        filme1.horario = "21h00";
        filme1.sala = 10;
        filme1.valor = 30;
        filme1.cliente = c1;


        filme2.nomeFilme = "Avatar";
        filme2.dataFilme = "10-12-2022";
        filme2.horario = "19h30";
        filme2.sala = 6;
        filme2.valor = 38;
        filme2.cliente = c2;

        

        //* Imprimindo Filmes */
        System.out.println("");
        System.out.println("---- INGRESSO ----");
        filme1.imprimeIngresso();
        filme1.ValorComDesconto(2023);
        System.out.println("");
        System.out.println("---- INGRESSO ----");
        filme2.imprimeIngresso();
        filme2.ValorComDesconto(2023);


    }
    
}
