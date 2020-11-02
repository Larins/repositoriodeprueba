//Author Lara Saiz 2020.

//Ejemplo de MAPA del tipo HASHMAP. El objetivo es una mini database con trabajadores de una empresa. 

//Este ejemplo pertenece al vídeo tutorial https://youtu.be/ltwlQKMn1hk

//Importamos el paquete de Java.

import java.util.*;

//Creamos la CLASE con su MAIN.

public class Mapa01 {
	
	public static void main(String[] args) {
		
		//Creamos el mapa. Ojo, que para ello es necesario crear las variables antes, aunque estén más abajo en el código. Ver abajo.
		
		//La CLAVE del mapa va a ser un STRING, y el VALOR va a ser un OBJETO de tipo EMPLEADO (que hemos creado más abajo).
		
		HashMap<String, Empleado> personal = new HashMap<String, Empleado>();
		
		//Rellenamos el mapa con información. Para cada registro, el primer hueco es la KEY y el segundo es el VALOR.
		
		//Creamos cada Empleado nuevo dentro de la misma sintaxis con el MÉTODO PUT.
		
		//Ojo con repetir la KEY porque si ponemos 2 veces la misma solo se crea 1 OBJETO, y se queda con el valor más reciente.
		
		personal.put("145", new Empleado("Juan"));
		personal.put("146", new Empleado("Ana"));
		personal.put("147", new Empleado("Antonio"));
		personal.put("148", new Empleado("Sandra"));
		
		//Printamos por consola.

		System.out.println(personal);
		
		//Si quisiéramos eliminar un registro...
		
		//personal.remove("145");
		//System.out.println(personal);
		
		//Si quisiéramos sustituir un elemento, basta con introducirlo con la misma clave (lo machaca).
		
		personal.put("146", new Empleado("Lara"));
		System.out.println(personal);
		
		
		//Vamos a experimentar ahora con el MÉTODO ENTRY-SET. Con este método lo que hacemos es pedirle que nos devuelva una COLECCIÓN DEL TIPO "SET", y que nos la imprima.
		
		//En definitiva, lo que hace es devolvernos toda la información que hay. Si te fijas, si lo imprimes como COLECCIÓN te lo imprime entre LLAVES y si lo imprimes como COLECCIÓN DEL TIPO "SET" te lo imprime entre CORCHETES.
		
		System.out.println(personal.entrySet());
		
		//Podríamos usar un BUCLE FOR EACH para que recorra toda la colección y nos devuelva todos los elementos de la colección en forma de SET.
		
		//Creamos el PRIMER BUCLE. Lo que hacemos es acceder a la primera pareja de valores y temporalmente guardarla en una variable llamada "entrada".
		
		for(Map.Entry<String, Empleado> entrada: personal.entrySet()){
			
			//Guárdame en una variable tipo STRING llamada "clave" la CLAVE de la pareja de valores que estés evaluando ahora mismo.
			
			String clave = entrada.getKey();
			
			//Guárdame en una variable tipo EMPLEADO llamada "valor" el VALOR de la pareja de valores que estés evaluando ahora mismo.
			
			Empleado valor = entrada.getValue();
			
			//Una vez almacenados, le pedimos que nos lo printe.
			
			System.out.println("Clave: " + clave + ". Valor: " + valor);
			
		}
	}

}

//Creamos una nueva CLASE. Esta clase va a servir para crear más OBJETOS, todos del tipo EMPLEADO.

class Empleado{
	
	//Creamos el CONSTRUCTOR de los "objetos tipo empleado". Es sencillo: solo va a solicitar el nombre del empleado (variable "n").
	
	public Empleado(String n) {
		
		//Esta clase va a tener 2 CAMPOS ENCAPSULADOS: nombre (argumento "n") y sueldo (que va a ser constante para todos). Están generados más abajo, fuera de la llave del constructor.
		
		nombre = n;
		sueldo = 2000;
				
	}
	
	//Para que toda esta información sea legible después, vamos a usar el MÉTODO TO-STRING, que pertenece a la CLASE OBJECT.
	
	public String toString() {
		
		//Dentro de la llave incluimos un RETURN donde especificamos cómo queremos recibir la información.
		
		return "[Nombre: " + nombre + ". Sueldo: " + sueldo + "].";
	}
	
	//Aquí creamos los CAMPOS ENCAPSULADOS a los que más arriba se hace referencia más arriba.
	private String nombre;
	private double sueldo;
	
}
