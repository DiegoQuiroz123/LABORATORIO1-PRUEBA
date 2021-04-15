
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coordenada P1;
		P1 = new Coordenada();
		
		Coordenada P2 = new Coordenada(10,-2);
		 
		P1.setX(-34);
		
		P1.ingresarDatos();
		P2.ingresarDatos();
		
		System.out.println("BOTAA TU GAAAA");
		//funcion de clase Rectangulo
		Rectangulo A= new Rectangulo(P1,P2);
		
		Rectangulo B = new Rectangulo(new Coordenada(10,-5) , new Coordenada (-4,12));
		
		System.out.println("RECTANGULO A =" +A);
		System.out.println("RECTANGULO B=" +B);
		
		System.out.println("/n");
		
		System.out.println(P1);
		System.out.println("PUNTO 2: "+P2);
		
		//METODO DISTANCIA
		System.out.println(P1.distancia(P2));
		
		System.out.println(Coordenada.distancia(P1, P2));
		
		
	}

}
