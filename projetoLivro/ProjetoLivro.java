package projetoLivro;
public class ProjetoLivro {
    public static void main(String[] args){
        Pessoa[] pes = new Pessoa[2];
        Livro[] lvr = new Livro[3];
        
        pes[0] = new Pessoa("Pedro", 22, "M");
        pes[1] = new Pessoa("Maria", 27, "F");

        lvr[0] = new Livro("Aprendendo Java", "José da Silva", 300, pes[0]);
        lvr[1] = new Livro("Aprendendo Python", "Carlos de Almeida", 250, pes[1]);
        lvr[2] = new Livro("Aprendendo Javascript", "Joaquim Silva", 330, pes[0]);

        lvr[0].abrir();
        lvr[0].folhear(130);
        lvr[0].avancarPag();
        System.out.println(lvr[0].detalhes()); 


    }
    
}
