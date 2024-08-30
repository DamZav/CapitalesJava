package cod5;
 
//importamos Scanner
import java.util.Scanner;

public class Codigo5 {

	public static void main(String[] args) {
		// el método new Scanner debe llevar el system.in 
	    Scanner s = new Scanner(System.in);
	    System.out.print("Introduzca un número: ");
	    String ni = s.nextLine();
	    int c = Integer.parseInt(ni); // Convertimo a int
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (c > 0) { //tomamos c que es entero
		  int digito = c % 10; //tomamos el ultimo digito del numero
	      if (digito == 3 || digito == 7 || digito == 8 || digito == 9) { //quitamos parentesis sobrantes
			afo++;
	      } else {
			noAfo++;
	      } //cerramos else
		  c /= 10; //se quita el ultimo digito del numero
	    }
	    
	    // comparamos numeros afos y no afos
	    if (afo > noAfo) {
	      System.out.println("El " + ni + " es un número afortunado."); //corregimos variable a mostrar
	    } else {
	      System.out.println("El " + ni + " no es un número afortunado.");
	    }
	    s.close(); //cerrramos Scanner
	} 
}
  
