package arrays;

public class Main
{
	public static void main(String[] args)
	{
		int[] enteros = new int[15];
		String[] nombres = new String[20];
		Circulo[] circulos = new Circulo[100];
		enteros[9] = 5;
		nombres[0] = "Francisco";
		int[] arregloNuevo = eliminarValor(enteros, 5);
		imprimirArregloInt(arregloNuevo);
	}
	
	public static void imprimirElementoInt(int[] arreglo, int elemento)
	{
		System.out.println(arreglo[elemento]);
	}//Imprime un elemento dado del arreglo
	
	public static void imprimirArregloInt(int[] arreglo)
	{
		for(int i = 0; i < arreglo.length; i++)
		{
			System.out.println(arreglo[i]);
		}
	}//Imprime el arreglo completo
	
	public static void imprimirElementoString(String[] arreglo, int elemento)
	{
		System.out.println(arreglo[elemento]);
	}//Imprime un elemento dado del arreglo
	
	public static void imprimirArregloString(String[] arreglo)
	{
		for(int i = 0; i < arreglo.length; i++)
		{
			System.out.println(arreglo[i]);
		}
	}//Imprime el arreglo completo
	
	public static Boolean hayValorEntero(int[] arreglo, int valor)
	{
		Boolean valorEncontrado = false;
		for(int i = 0; i < arreglo.length; i++)
		{
			if(arreglo[i] == valor)
			{
				valorEncontrado = true;
				break;
			}
		}
		return valorEncontrado;
	}//Determina si el valor está
	
	public static Boolean hayString(String[] arreglo, String string)
	{
		Boolean valorEncontrado = false;
		for(int i = 0; i < arreglo.length; i++)
		{
			if(arreglo[i].equals(string))
			{
				valorEncontrado = true;
				break;
			}
		}
		return valorEncontrado;
	}//Determina si el String está
	
	
	public static int vecesValor(int[] arreglo, int valor)
	{
		int veces = 0;
		for(int i = 0; i < arreglo.length; i++)
		{
			if(arreglo[i] == valor)
			{
				veces++;
			}
		}
		return veces;
	}//Devuelve el número de veces que el valor está en el arreglo
	
	public static int vecesString(String[] arreglo, String string)
	{
		int veces = 0;
		for(int i = 0; i < arreglo.length; i++)
		{
			if(arreglo[i].equals(string))
			{
				veces++;
			}
		}
		return veces;
	}//Devuelve el número de veces que el string está en el arreglo
	
	public static int[] reemplazarValor(int[] arreglo, int valor)
	{
		int[] arregloFinal = new int[arreglo.length];
		
		return arregloFinal;
	}
	
	public static int[] eliminarValor(int[] arreglo, int valor) {
	    int contador = 0;
	    for (int i = 0; i < arreglo.length; i++) {
	        if (arreglo[i] == valor) {
	            contador++;
	        } else if (contador > 0) {
	            arreglo[i - contador] = arreglo[i];
	            arreglo[i] = 0;
	        }
	    }

	    for (int i = arreglo.length - contador; i < arreglo.length; i++) {
	        arreglo[i] = 0;
	    }

	    return arreglo;
	}//Elimina un valor del arreglo
}