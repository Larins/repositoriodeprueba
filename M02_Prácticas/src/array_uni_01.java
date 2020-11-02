
public class array_uni_01 {

	public static void main(String[] args) {
		
		//Declaramos la matriz.
		
		int[] matriz1 = new int[5];
		
		//Si printamos directamente nos va a salir un texto aleatorio.
		
		//System.out.println(matriz1);
		
		//Inicializamos la matriz con un valor para cada �ndice (posici�n).
		
		matriz1[0] = 5;
		matriz1[1] = 38;
		matriz1[2] = -15;
		matriz1[3] = 92;
		matriz1[4] = 71;
		
		//Probamos a printar de nuevo. Sigue saliendo un texto aleatorio.
		
		//System.out.println(matriz1);
		
		//S� obtenemos los resultados si usamos esta sintaxis para printar el valor de cada uno de los �ndices.
		
		//System.out.println(matriz1[0]);
		//System.out.println(matriz1[1]);
		//System.out.println(matriz1[2]);
		//System.out.println(matriz1[3]);
		//System.out.println(matriz1[4]);
		
		//Esto tiene 2 h�ndicaps. Primero, que nos lo imprime con un salto de l�nea (cosa que podr�amos resolver con una concatenaci�n). No obstante, el inconveniente m�s importante es que necesitamos escribir una sentencia para cada posici�n. Con un BUCLE FOR podemos printar todo o una selecci�n con una sola sentencia.
		
		for(int i=0; i<5; i++) {
			
		//Con la expresi�n "matriz1[i] printamos y obtenemos los 5 valores de la matriz separados por saltos de l�nea.
		
		//System.out.println(matriz1[i]);
		
		//Tambi�n podemos concatenar los valores de cada �ndice:
			
		System.out.println("Valor del �ndice " + i + " = " + matriz1[i]);
			
		}
			
	}

}
