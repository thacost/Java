public class Cliente {
    public String nome;
    public String telefone;


public Cliente(){

}

public double calcularPreco(){
    double total = 0;
    for (double aux : lista){
        total += aux;
    }
    return total;
}

public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome = nome;
}

public String getTelefone(){
    return telefone;
}
public void setTelefone(String telefone){
    this.telefone = telefone;
}

public String toString(){
    return "Cliente [nome= " + nome + ", telefone= " + telefone + "]";
}

}