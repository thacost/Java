public abstract class AcaiDecorator implements Acai{
    private final Acai acaiDecorador;

    public AcaiDecorator(Acai acai){
        this.acaiDecorador = acai;
    }

    @Override
    public double infoPreco() {
        return acaiDecorador.infoPreco();
    }

    @Override
    public String infoAdicional() {
        return acaiDecorador.infoAdicional();
    }

    public Acai getAcai(){
        return acaiDecorador;
    }

    
    
}
