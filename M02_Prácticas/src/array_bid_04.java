//Author Lara Saiz 2020.

//Ejemplo de bucle FOR EACH con matriz BIDIMENSIONAL.

//Este ejemplo pertenece al vídeo tutorial https://youtu.be/xEHkuRApCno

//Se trata de hacer un cálculo de rentabilidad. Tenemos 10.000€ como saldo inicial y 6 opciones de tipo de interés (10%, 11%, 12%, 13%, 14% y 15%). Vamos a calcularlo a 5 años vista (serán 6 años en total, incluyendo el año inicial).


public class array_bid_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables/matrices y las inicializamos si es conveniente.
		double acumulado;
		double interes = 0.10;
		double[][] saldo = new double[6][5];
		
		//Primer bucle FOR.
		
		for(int i=0; i<6; i++) {
			
			//Inicializamos las variables con 10.000€, que es el saldo inicial.
			saldo[i][0] = 10000;
			acumulado = 10000;
			
			//Segundo bucle FOR (anidado). 
			
			//IMPORTANTE: En el primer bloque del FOR (variable) inicializamos la variable con el valor (mejor dicho, con la posición) i=1 (cuando lo habitual es i=0). Esto es porque la posición 0 es donde tenemos guardado el saldo inicial (10000) y ya lo hemos inicializado arriba. Será a partir del año 2 (posición 1) cuando el interés empezará a acumularse y, por tanto, cuando el loop empezará a tener efecto.
			
			for(int j=1; j<5; j++) {
				
				//Introducimos la fórmula de cálculo del interés.
				
				acumulado = acumulado + (acumulado * interes);
				
				//Y le pedimos que guarde el resultado en la "casilla" adecuada del array.
				saldo[i][j] = acumulado;				
			}
			
			//Hasta aquí hemos calculado la rentabilidad para un solo tipo de interés.
			
			//Le decimos que el interés se incrementa en un 1% (que es la diferencia entre cada uno de los siguientes: 10%, 11%, 12%, 13%, 14% y 15%. Esto va a hacer que el bucle for vuelva arriba una y otra vez mientras se cumplan las condiciones, cada vez incrementando el tipo de interés en un 1%.
			
			interes = interes + 0.01;
			
		}
		
		//Hasta aquí hemos "rellenado" la matriz. Vamos ahora a printarla. Necesitaremos 2 bucles FOR. IMPORTANTE: deben estar fuera de los 2 bucles FOR anteriores.
		
		//Primer bucle FOR.
		
		for(int z=0; z<6; z++) {
			
			//Incluimos aquí un print vacío para poder printar en forma de matriz luego (ver más abajo).			
			System.out.println();
			
			//Segundo bucle FOR.
			
			for(int h=0; h<5; h++) {
				
				//Printamos con formato (número de decimales).
				System.out.printf("%1.2f", saldo[z][h]);
				
				//Printamos con un 1 espacio de separación entre los valores de la matriz.
				System.out.print(" ");
				
				//De  hecho, podríamos poner cualquier separador. Por ejemplo. " _ ".
				
				//System.out.print(" _ ");
				
			}
			
		}

	}

}
