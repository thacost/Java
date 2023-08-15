import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args){
        Cliente c1 = new Cliente();
        Cliente c2 = new Professor();
        Professor c3 = new Professor();
        DecimalFormat f = new DecimalFormat("#.##");
        System.out.println(f.format(c1.this.calcularPreco(1.3, 5.8, 35.7, 20.3)));
        System.out.println(f.format(c2.this.calcularPreco(5.3, 9.7, 55.7, 20.3)));
        System.out.println(f.format(c3.this.calcularPreco(7.3, 5.8, 45.7, 20.3)));







    }
    
}
