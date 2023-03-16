package arrays;

public class Nombres 
{

	String[] nombres;
	
	public Nombres(int tamaño)
	{
		this.nombres = new String[tamaño];
	}
	
	public Nombres()
	{
		this.nombres = new String[0];
	}
	
	public void imprimirElementoString(int elemento)
	{
		System.out.println(nombres[elemento]);
	}
	
	public void imprimirArregloString()
	{
		for(int i = 0; i < nombres.length; i++)
		{
			System.out.println(nombres[i]);
		}
	}
	
	public Boolean hayString(String string)
	{
		Boolean valorEncontrado = false;
		for(int i = 0; i < nombres.length; i++)
		{
			if(nombres[i].equals(string))
			{
				valorEncontrado = true;
				break;
			}
		}
		return valorEncontrado;
	}
	
	public int vecesString(String string)
	{
		int veces = 0;
		for(int i = 0; i < nombres.length; i++)
		{
			if(nombres[i].equals(string))
			{
				veces++;
			}
		}
		return veces;
	}
	
	public int[] posicionesString(String string)
	{
		int[] posiciones = new int[vecesString(string)];
		int m = 0;
		for(int i = 0; i < nombres.length; i++)
		{
			if(nombres[i].equals(string))
			{
				posiciones[m] = i;
				m++;
			}
		}
		return posiciones;
	}
	
	public String[] eliminarString(String string) 
	{
	    int veces = vecesString(string);
	    String[] arregloReemplazado = new String[nombres.length - veces];
	    int m = 0;
	    for (int i = 0; i < nombres.length; i++) 
	    {
	        if (!nombres[i].equals(string)) 
	        {
	        	arregloReemplazado[m] = nombres[i];
	            m++;
	        }
	    }
	    return arregloReemplazado;
	}
}

