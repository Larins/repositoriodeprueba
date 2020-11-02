import javax.swing.*;

public class array_uni_02 {

	public static void main(String[] args) {
		
		//Declaramos la matriz de tipo STRING "paises".
		
		//String[] paises = new String[8];

		//Aquí podemos hacer dos cosas. La primera sería usar el método clásico para dar valores a los "huecos" de la matriz.
		
		//paises[0] = "España";
		//paises[1] = "México";
		//paises[2] = "Colombia";
		//paises[3] = "Perú";
		//paises[4] = "Chile";
		//paises[5] = "Argentina";
		//paises[6] = "Ecuador";
		//paises[7] = "Venezuela";
		
		//La otra opción es abrir un cuadro de diálogo para ir introduciendo los países de uno en uno.
		
		//for (int i=0; i<8; i++) {
			//paises[i] = JOptionPane.showInputDialog("Introduce país " + (i+1));
		//}
		
		//Hay una tercera opción que es declarar e inicializar la matriz directamente (más rápido): 
		
		//Ahora vamos a generar una matriz con un método diferente, más rápido.
		
		String[] paises = {"España", "México", "Colombia", "Perú", "Chile", "Argentina", "Ecuador", "Venezuela"};
		
		
		//En cualquier caso, una vez rellena de valores la matriz, hacemos un bucle FOR para ver qué resultado nos daría.
		
		//for(int i=0; i< paises.length; i++) {
			
			//System.out.println("País " + (i+1) + " " + paises[i]);
		//}
		
		//Ahora haremos el bucle FOR EACH. Primero vamos a usar la matriz "normal" que hemos generado arriba.
		
		//for(String elemento:paises) {
			//System.out.println(elemento);
		//}
		
		//Vamos ahora a probar a hacer una matriz mucho más grande, rellenada con valores aleatorios que va a generar el programa.
		
		int[] matriz_aleatorios = new int[150];
		
		for (int i=0; i<matriz_aleatorios.length; i++) {
			matriz_aleatorios[i] = (int)Math.round(Math.random()*100);
		
			System.out.println(i);
		
		}
		
		//for (int numeros:matriz_aleatorios) {
			
			//Si printamos así nos imprimiría con un salto de línea entre cada valor.
			//System.out.println(numeros);
			
			//Vamos a printar en una sola línea con un espacio entre medio.
			//System.out.print(numeros + " ");
		//}
	}

}
