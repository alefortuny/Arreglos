package arrays;

public class Circulo 
{

	public float radio;
	
	public Circulo(float radio)
	{
		this.radio = radio;
	}
	public Circulo()
	{
		this(173913);
	}
	public double getCircunference() 
	{
		return radio*2*Math.PI;
	}
	public double getArea() 
	{
		return Math.PI*Math.pow(radio, 2);
	}
}
