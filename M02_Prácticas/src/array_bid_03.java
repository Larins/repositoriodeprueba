//Ejemplo de bucle FOR EACH con matriz BIDIMENSIONAL.

//Este ejemplo pertenece al vídeo tutorial https://youtu.be/xEHkuRApCno

//Este ejemplo es una variante del código guardado en las clases array_bid_01.java y array_bid_02.java.

public class array_bid_03 {
	public static void main(String[] args) {
		
		//Declaramos e inicializamos la matriz. 
		
		int [][] matrix3 = {
				{10,15,18,19,21},
				{5,25,37,41,15},
				{7,19,32,14,90},
				{85,2,7,40,27}
		};
		
		for(int[]fila:matrix3){ 
			System.out.println();
			for(int z: fila) {
				System.out.print(z + " ");
			}
		}
		
	}
}
