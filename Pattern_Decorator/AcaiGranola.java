public class AcaiGranola extends AcaiDecorator {
    public AcaiGranola (Acai acai){
        super(acai);
    }

    @Override
    public double infoPreco() {
        return super.infoPreco() + 1.0;
    } 

    @Override
    public String infoAdicional() {
        return super.infoAdicional() + ", com Granola";
    }

    
}
