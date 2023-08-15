public class Aplicacao {
	public static void main(String[] args) {
		System.out.println("Início do método main");
		metodo1();
		System.out.println("Fim do método main");
	}

	private static void metodo1() {
		System.out.println("Início do método 1");
		metodo2();
		System.out.println("Fim do método 1");
	}

    private static void metodo2() {
        System.out.println("Início do método 2");

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {
            for(int i = 0; i <= array.length; i++) {
                System.out.println(String.format("Elementon número: %d", array[i]));
            }
        } catch(ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        } catch(Exception exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("Fim do método 2");
    }


}