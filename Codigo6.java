package cod5;

import java.util.Scanner;

public class Codigo6 {

	public static void main(String[] args) { //agrego public static void main
		// TODO Auto-generated method stub
		int[] n = new int[20]; // corrigo la creacion de new int

	    for (int i = 0; i < 20; i++) { // corrijo el incremento i++
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " "); //corrijo print
	    }
	    
	   
	    System.out.println("\n¿Qué números quiere resaltar? "); //corrijo print
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    
	     //Lee opcion del usuario
	    Scanner scanner = new Scanner(System.in); //agergamos scanner para leer
	    int opcion = Integer.parseInt(scanner.nextLine());

	    int multiplo = (opcion == 1) ? 5 : 7; //correccion
	    
	    // cambio forEach por for y char por int
	    for (int e : n) { 
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      } else { // agrego llave pa cerrar if
	        System.out.print(e + " ");
	      }
	    }
		scanner.close();
		
	}

}
