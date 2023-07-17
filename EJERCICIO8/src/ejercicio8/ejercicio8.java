package ejercicios;

import java.util.Scanner;

/*
 * - Crear un programa en `Java` que realice lo siguiente:
- Input
  - Solicitar al usuario 10 números por consola y almacenarlos en un *array*
- Colocar todos los números primos a las primeras posiciones, desplazando el resto al final de forma que ningún número se pierda.
- Output
  - Mostrar por consola el array que contiene los números primos al inicio, mostrando el índice seguido del valor de la posición.
- El orden de los números **no importa** siempre y cuando los números primos se encuentren al inicio del array.

 * 
 * */

public class ejercicio8 {
	
	public static boolean checkPrime(int numeros) {
		//si el numero es menor o igual, entonces retorna un falso, no es primo
		if (numeros <= 1) {
			return false;
		}
		
		// Verificar si el número es divisible por algún otro número menor a la mitad de su valor
		for(int i = 2; i <numeros /2; i++) {
			// Si el número es divisible, entonces no es primo
			if(numeros%i==0) {
				return false;	
			}
			
		} //fin de for
		
		// Si el número no es divisible por ningún otro número, entonces es primo
		return true;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[10]; //el arreglo que solo va contener 10 numeros
		int contador = 0; // Variable para contar el número de primos ingresados por el usuario
		
		//Pedir a los usuarios que ingrese 10 numeros
		System.out.println("Ingrese 10 numeros");
		// Leer la entrada del usuario como una cadena
		String input = scanner.nextLine();
		// Dividir la cadena en subcadenas separadas por comas
		String[] numerosStr = input.split(",");
		
		if(numerosStr.length !=10) { //condicion si el valor ingresado es mayor a 10 numeros
			System.out.println("Ingresar solamente 10 numeros");
		}
		 
		// Recorrer las subcadenas y convertirlas a enteros para almacenar en el arreglo
		for(int i = 0; i < numerosStr.length; i++) {
			// Convertir la subcadena a un entero y eliminar espacios en blanco
			numeros[i] = Integer.parseInt(numerosStr[i].trim());
			// Verificar si el número ingresado es primo y aumentar el contador si lo es
			if(checkPrime(numeros[i])) {
				contador++;
			}
		} //fin del for
		
		// Declarar un nuevo arreglo para almacenar los números ordenados
		int[] numerosOrdenados = new int[numeros.length];
		
		// Variables para indicar los índices de los números primos y no primos en el nuevo arreglo
        int indicePrimos = 0;
        int indiceNoPrimos = contador;
        
     // Recorrer el arreglo original y colocar los números en el arreglo ordenado según sean primos o no
        for (int i = 0; i < numeros.length; i++) {
            if (checkPrime(numeros[i])) {
                numerosOrdenados[indicePrimos] = numeros[i];
                indicePrimos++;
            } else {
                numerosOrdenados[indiceNoPrimos] = numeros[i];
                indiceNoPrimos++;
            }
        }//fin for
        
        // Imprimir el arreglo original
        System.out.println("\nArray original:");
        for (int i=0; i<numeros.length; i++) {
            System.out.println("pos[" + i + "] = " + numeros[i]);
        }
        
        // Imprimir el arreglo ordenado
        System.out.println("\nArray ordenado:");
        for (int i = 0; i < numerosOrdenados.length; i++) {
            System.out.println("pos[" + i + "] = " + numerosOrdenados[i]);
        }
		
		scanner.close(); //Cerrar el scanner
	} //fin de main

}