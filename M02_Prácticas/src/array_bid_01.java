//Ejemplo de bucle FOR con matriz BIDIMENSIONAL.

//Este ejemplo pertenece al v�deo tutorial https://youtu.be/_tUncS0AsNE

public class array_bid_01 {
	public static void main(String[] args) {
		
		//Declaramos la matriz.
		
		int [][] matrix1 = new int[4][5];
		
		//La inicializamos con valores para cada posici�n (tb llamado �ndice).
		
		matrix1 [0][0] = 15;
		matrix1 [0][1] = 21;
		matrix1 [0][2] = 18;
		matrix1 [0][3] = 9;
		matrix1 [0][4] = 15;

		matrix1 [1][0] = 10;
		matrix1 [1][1] = 52;
		matrix1 [1][2] = 17;
		matrix1 [1][3] = 19;
		matrix1 [1][4] = 7;

		matrix1 [2][0] = 19;
		matrix1 [2][1] = 2;
		matrix1 [2][2] = 19;
		matrix1 [2][3] = 17;
		matrix1 [2][4] = 7;

		matrix1 [3][0] = 92;
		matrix1 [3][1] = 13;
		matrix1 [3][2] = 13;
		matrix1 [3][3] = 32;
		matrix1 [3][4] = 41;

		//Podr�amos printar los valores por consola.
		
		//System.out.println(matrix1[2][3]);
		//System.out.println("El valor almacenado en la posici�n (2,3) es: " + matrix1[2][3]);
		
		//Para recorrer la matriz necesitamos 2 bucles FOR anidados. Uno para cada dimensi�n.
		
		//El primer bucle FOR se detiene en la posici�n 0. El segundo bucle FOR recorre de 0.0 a 0.4. El primero se detiene en la posici�n 1. El segundo recorre de 1.0 a 1.4. Y as� sucesivamente.
		
		//Escribimos el PRIMER BUCLE FOR. 
		
		//Importante: En el segundo bloque del BUCLE FOR (la condici�n), escribimos "i<4", es decir, se repite el b  ucle mientras "i" es igual o menor a 3. Eso es porque hemos construido nuestra matriz con 4 posiciones en la primera dimensi�n = [0,1,2,3].
		
		for(int i=0;i<4;i++) {
			
			//Incluimos aqu� un print vac�o para poder printar en forma de matriz luego (ver m�s abajo).
			System.out.println();
			
			//Escribimos el SEGUNDO BUCLE FOR de forma anidada (dentro del primero)
			
			for(int j=0;j<5;j++) {
				
				//Printar sin espacios ni saltos.
				//System.out.print(matrix1[i][j]);
				
				//Printar sin espacios, pero con saltos.
				//System.out.println(matrix1[i][j]);
 
				//Printar sin saltos pero con espacios.
				//System.out.print(matrix1[i][j] + " ");

				//Por �ltimo, podemos printar en forma de matriz. Para ello es necesario incluir un print antes del SEGUNDO BUCLE FOR (ver m�s arriba).
				System.out.print(matrix1[i][j] + " ");


			}	

		}	
	}
}
