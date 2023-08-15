package projetoLivro;
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
  
///Metodo especial
public String detalhes(){
    return "Livro {" + "\ntitulo = " + titulo + " || autor = " + autor + "\ntotPaginas = " + totPaginas 
    + " || pagAtual = " + pagAtual + " || aberto = " 
    + aberto + "\nleitor = " + leitor.getNome() 
    + " || idade = " + leitor.getIdade() + " || sexo = " + leitor.getSexo() + " }";
}



public Livro(String titulo, String autor, int totPaginas, Pessoa leitor){ //Método Construtor
    this.titulo = titulo;
    this.autor = autor;
    this.totPaginas= totPaginas;
    this.aberto = false;
    this.pagAtual = 0;
    this.leitor = leitor;
}

//get e set
public String getTitulo(){
    return titulo;
}
public void setTitulo(String titulo){
    this.titulo = titulo;
}
public String getAutor(){
    return autor;
}
public void setAutor(String autor){
    this.autor = autor;
}
public int getTotPaginas(){
    return totPaginas;
}
public void setTotPaginas(int totPaginas){
    this.totPaginas = totPaginas;
}

public Pessoa getLeitor(){
    return leitor;
}
public void setLeitor(Pessoa leitor){
    this.leitor = leitor;
}

@Override
public void abrir(){
    this.aberto = true;

}
@Override
public void fechar(){
    this.aberto = false;
}
@Override
public void folhear(int p){
    if (p > this.totPaginas){
        this.pagAtual = 0;
        
    }else{
        this.pagAtual = p;
    }
    


}
@Override
public void avancarPag(){
    this.pagAtual++;

}
@Override
public void voltarPag(){
    this.pagAtual--;

}



}
