
public class Start {

	public static void main(String[] args) {
		
		MatricesDinamicas miMatriz = new MatricesDinamicas(4, 8);
		//miMatriz.imprimir();
		
		miMatriz.imprimir();
		miMatriz.addColumna(0);
		System.out.println("------");
		miMatriz.imprimir();

		

	}

}
