import java.util.Scanner;

public class Coordenada {
	private float x;
	private float y;
	
	public Coordenada() {
		
	}
	public Coordenada(float x, float y) {
		this.x= x;
		this.y= y;
	}
	
	public Coordenada(Coordenada c) {
		this.x= c.x;
		this.y= c.y;
	}
	//get y set X
	public float getX() {
		return this.x;
	}
	public void setX(float x) {
		this.x=x;
	}
	//get y set Y
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	public double distancia (Coordenada c) {
		double dis= Math.sqrt(Math.pow(c.x-this.x,2))+Math.pow(c.y-this.y,2);
		return dis;
	}
	
	public static double distancia (Coordenada c1, Coordenada c2) {
		double dis= Math.sqrt(Math.pow(c2.x-c1.x,2))+Math.pow(c2.y-c1.y,2);
		return dis;
	}
	public String toString() {
		return "["+this.x+","+this.y+"]";
	}
	
	
	public void ingresarDatos() {
		Scanner Scanner = new  Scanner (System.in);
		
		System.out.println("Ingrese el punto X :");
		x=Scanner.nextFloat();
		
		System.out.println("Ingrese el punto Y :");
	
		y=Scanner.nextFloat();
		
	}
	
}
