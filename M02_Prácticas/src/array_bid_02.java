//Ejemplo de bucle FOR con matriz BIDIMENSIONAL.

//Este ejemplo pertenece al vídeo tutorial https://youtu.be/xEHkuRApCno

//Este ejemplo es una variante del código guardado en la clase array_bid_01.java.

public class array_bid_02 {
	public static void main(String[] args) {
		
		//Declaramos e inicializamos la matriz. Ojo a la sintaxis con llaves y comas.
		
		int [][] matrix2 = {
				{10,15,18,19,21},
				{5,25,37,41,15},
				{7,19,32,14,90},
				{85,2,7,40,27}
		};
		
		for(int i=0;i<4;i++) {
			System.out.println();
			for(int j=0;j<5;j++) {
				System.out.print(matrix2[i][j] + " ");
			}
		}
	}
}
