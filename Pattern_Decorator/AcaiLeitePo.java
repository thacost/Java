public class AcaiLeitePo extends AcaiDecorator {

    public AcaiLeitePo (Acai acai){
        super(acai);
    }

    @Override
    public double infoPreco() {
        return super.infoPreco() + 1.5;
    }

    @Override
    public String infoAdicional() {
        return super.infoAdicional() + ", com Leite em pó";
    }

    
    
}
