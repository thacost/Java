public class ProgramaPrincipal {
    public static void imprimirInfo(Acai s){
        System.out.println("Preço: R$" + String.format("%.2f", s.infoPreco()) + " | Adicional: " + s.infoAdicional());
        System.out.println("");
    }
    public static void imprimirAcai(Acai s){
        System.out.println("Preço: R$" + String.format("%.2f", s.infoPreco()));
        System.out.println("");
    }

    public static void main(String[] args) {
        Acai s = new AcaiSimples();
        System.out.println("Açai puro cremoso");
        imprimirAcai(s);
        
        System.out.println("Açai Opcional 1");
        s = new AcaiSimples();
        s = new AcaiLeitePo(s);
        imprimirInfo(s);

        System.out.println("Açai Opcional 2");
        s = new AcaiSimples();
        s = new AcaiGranola(s);
        imprimirInfo(s);

        System.out.println("Açai Opcional 3");
        s = new AcaiSimples();
        s = new AcaiLeiteCond(s);
        imprimirInfo(s);


        System.out.println("Açai Completo");
        s = new AcaiSimples();
        s = new AcaiLeiteCond(s);
        s = new AcaiLeitePo(s);
        s = new AcaiGranola(s);
        imprimirInfo(s);


    }
    
}
