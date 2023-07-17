package ejercicio9;

import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;
/*
 * ## Instrucciones

- Crear un programa en `Java` que realice lo siguiente
  
- Crear un diccionario Español-Inglés, que contenga al menos *20* palabras con su respectiva traducción
- Utiliza un *objeto* `HashMap` para almacenar pares de palabras
- Input 
  - Solicitar a usuario una palbra en español
- Output
  - Mostrar por consola la palabra en inglés
  - En caso de no encontrar su traducción en el diccionario, debe imprimir un mensaje indicándolo
 * */
public class ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//crear un HashMap de tipo String como clave y String como valor
		Map<String, String> miMapa = new HashMap<>();
		
		//agregar elementos al mapa (20) espaniol y ingles
		miMapa.put("gato", "cat");
		miMapa.put("puerta", "door");
		miMapa.put("hola", "hello");
		miMapa.put("adios", "goodbye");
		miMapa.put("uva", "grape");
		miMapa.put("sol", "sun");  //6
		miMapa.put("ventana", "window");
		miMapa.put("cortina", "curtain");
		miMapa.put("mesa", "table");
		miMapa.put("cocina", "kitchen"); //10
		miMapa.put("lapiz", "pencil");
		miMapa.put("carro", "car");
		miMapa.put("silla", "chair");
		miMapa.put("blusa", "blouse");
		miMapa.put("pluma", "pen");
		miMapa.put("caja", "box");  //16
		miMapa.put("techo", "roof");
		miMapa.put("perro", "dog");
		miMapa.put("queso", "cheese");
		miMapa.put("tenedor", "fork"); //20
		//Pedir al usuario ingresar una palabra en espaniol
		System.out.println("Ingrese una palabra en espaniol para ver su traduccion");
		//guardarlo en la variable palabra.
		String palabra = scanner.next();
		
		// Comprobar si la palabra está en el diccionario
		if(miMapa.containsKey(palabra)) {
			//se está inicializando la variable output con el valor obtenido del diccionario miMapa.
			String output = miMapa.get(palabra);
			//imprime la traduccion a ingles
			System.out.println("Traducion: " + output);
			
		}else {//...Si no se encontro en el dicc, muestra esta mensaje
			System.out.println("No se encontro esa palabra en el diccionario");
		}
		scanner.close(); //cerrar el Scanner

	} //fin main

}
