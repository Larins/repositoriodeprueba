import javax.swing.*;

public class array_uni_02 {

	public static void main(String[] args) {
		
		//Declaramos la matriz de tipo STRING "paises".
		
		//String[] paises = new String[8];

		//Aqu� podemos hacer dos cosas. La primera ser�a usar el m�todo cl�sico para dar valores a los "huecos" de la matriz.
		
		//paises[0] = "Espa�a";
		//paises[1] = "M�xico";
		//paises[2] = "Colombia";
		//paises[3] = "Per�";
		//paises[4] = "Chile";
		//paises[5] = "Argentina";
		//paises[6] = "Ecuador";
		//paises[7] = "Venezuela";
		
		//La otra opci�n es abrir un cuadro de di�logo para ir introduciendo los pa�ses de uno en uno.
		
		//for (int i=0; i<8; i++) {
			//paises[i] = JOptionPane.showInputDialog("Introduce pa�s " + (i+1));
		//}
		
		//Hay una tercera opci�n que es declarar e inicializar la matriz directamente (m�s r�pido): 
		
		//Ahora vamos a generar una matriz con un m�todo diferente, m�s r�pido.
		
		String[] paises = {"Espa�a", "M�xico", "Colombia", "Per�", "Chile", "Argentina", "Ecuador", "Venezuela"};
		
		
		//En cualquier caso, una vez rellena de valores la matriz, hacemos un bucle FOR para ver qu� resultado nos dar�a.
		
		//for(int i=0; i< paises.length; i++) {
			
			//System.out.println("Pa�s " + (i+1) + " " + paises[i]);
		//}
		
		//Ahora haremos el bucle FOR EACH. Primero vamos a usar la matriz "normal" que hemos generado arriba.
		
		//for(String elemento:paises) {
			//System.out.println(elemento);
		//}
		
		//Vamos ahora a probar a hacer una matriz mucho m�s grande, rellenada con valores aleatorios que va a generar el programa.
		
		int[] matriz_aleatorios = new int[150];
		
		for (int i=0; i<matriz_aleatorios.length; i++) {
			matriz_aleatorios[i] = (int)Math.round(Math.random()*100);
		
			System.out.println(i);
		
		}
		
		//for (int numeros:matriz_aleatorios) {
			
			//Si printamos as� nos imprimir�a con un salto de l�nea entre cada valor.
			//System.out.println(numeros);
			
			//Vamos a printar en una sola l�nea con un espacio entre medio.
			//System.out.print(numeros + " ");
		//}
	}

}
