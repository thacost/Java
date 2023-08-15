public class AcaiLeiteCond extends AcaiDecorator {
    public AcaiLeiteCond (Acai acai){
        super(acai);
    }

    @Override
    public double infoPreco() {
        return super.infoPreco() + 3.0;
    }

    @Override
    public String infoAdicional() {
        return super.infoAdicional() + ", com Leite Condensado";
    }

    

    
}
