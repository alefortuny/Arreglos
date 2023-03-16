package arrays;

public class Main
{
	public static void main(String[] args)
	{
		Enteros enteros = new Enteros(15);
		Nombres nombres = new Nombres(20);
		Circulo[] circulos = new Circulo[100];
		circulos[0] = new Circulo();
		enteros.enteros[9] = 5;
		nombres.nombres[0] = "Francisco";
		enteros.imprimirArregloInt();
		System.out.println("");
		
		Enteros posiciones = new Enteros();
		posiciones.enteros = enteros.posicionesValor(5);
		posiciones.imprimirArregloInt();
		System.out.println("");
		
		Enteros valorReemplazado = new Enteros();
		valorReemplazado.enteros = enteros.eliminarValor(5);
		valorReemplazado.imprimirArregloInt();
	}
}