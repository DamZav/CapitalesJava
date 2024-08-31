package live3;

public class MangosNaranjas {

	private int mangos;
    private int naranjas;

    // Constructor que recibe el número de mangos y naranjas
    public MangosNaranjas(int mangos, int naranjas) {
        this.mangos = mangos;
        this.naranjas = naranjas;
    }

    // Método para calcular el MCD (Máximo Común Divisor) usando el algoritmo de Euclides
    private int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Método para imprimir el resultado
    public void imprimir() {
        // Encontrar el número máximo de cajas usando el MCD
        int cajas = calcularMCD(mangos, naranjas);

        // Calcular cuántos mangos y naranjas habrá por caja
        int mangosPorCaja = mangos / cajas;
        int naranjasPorCaja = naranjas / cajas;

        // Imprimir el resultado
        System.out.println("El número de cajas es: " + cajas);
        System.out.println("El número de mangos en una caja es: " + mangosPorCaja);
        System.out.println("El número de naranjas en una caja es: " + naranjasPorCaja);
    }
}
	
	
