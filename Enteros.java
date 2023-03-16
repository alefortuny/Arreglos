package arrays;

public class Enteros 
{
	int i;
	int[] enteros;
	
	public Enteros(int tamaño)
	{
		this.enteros = new int[tamaño];
	}
	
	public Enteros()
	{
		this.enteros = new int[0];
	}
	
	public void imprimirElementoInt(int elemento)
	{
		System.out.println(enteros[elemento]);
	}
	
	public void imprimirArregloInt()
	{
		for(int i = 0; i < enteros.length - 1; i++)
		{
			System.out.print(enteros[i] + ", ");
		}
		System.out.print(enteros[enteros.length - 1]);
	}
	
	public Boolean hayValorEntero(int valor)
	{
		Boolean valorEncontrado = false;
		for(int i = 0; i < enteros.length; i++)
		{
			if(enteros[i] == valor)
			{
				valorEncontrado = true;
				break;
			}
		}
		return valorEncontrado;
	}
	
	public int vecesValor(int valor)
	{
		int veces = 0;
		for(int i = 0; i < enteros.length; i++)
		{
			if(enteros[i] == valor)
			{
				veces++;
			}
		}
		return veces;
	}
	
	public int[] posicionesValor(int valor)
	{
		int[] posiciones = new int[vecesValor(valor)];
		int m = 0;
		for(int i = 0; i < enteros.length; i++)
		{
			if(enteros[i] == valor)
			{
				posiciones[m] = i;
				m++;
			}
		}
		return posiciones;
	}
	
	public int[] eliminarValor(int valor) 
	{
	    int veces = vecesValor(valor);
	    int[] arregloReemplazado = new int[enteros.length - veces];
	    int m = 0;
	    for (int i = 0; i < enteros.length; i++) 
	    {
	        if (enteros[i] != valor) 
	        {
	        	arregloReemplazado[m] = enteros[i];
	            m++;
	        }
	    }
	    return arregloReemplazado;
	}
	
	public int[] eliminarValors(int valor)
	{
		int veces = vecesValor(valor);
		int[] arregloFinal = new int[enteros.length - veces];
		int m = 0;
		for(int i = 0; i < enteros.length; i++)
		{
			if(enteros[i] != valor)
			{
				arregloFinal[m] = enteros[i];
				m++;
			}
			else if(enteros[i] == valor)
			{
				arregloFinal[m] = enteros[i + 1];
				i++;
			}
		}
		return arregloFinal;
	}
}