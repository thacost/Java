public class Professor extends Cliente{
    public String localTrabalho;
    

    public Professor(){

    }

    public double calcularPreco(double lista){
        double total = 0;
        for (double aux : lista){
            total += aux;
        }
        total = total * 0.8;
        return total;
    }

    public String getLocalTrabalho(){
        return localTrabalho;
    }
    public void setLocalTrabalho(String localTrabalho){
        this.localTrabalho = localTrabalho;
    }

    public String toString(){
        return "Professor [localTrabalho= " + localTrabalho + "]";
    }
}
