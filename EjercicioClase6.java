import java.util.Scanner;

public class EjercicioClase6 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String saborhelado;
		System.out.println("Cuál es tu sabor de helado favorito?");
		saborhelado = in.nextLine();
		System.out.println("Tu sabor de helado favorito es " + saborhelado);
		
		double porcentajeComision;
		System.out.println("Cuál es el procentaje de comisión en la venta?");
		porcentajeComision = in.nextDouble();
		System.out.println("Tu porcentaje de comisión es " + porcentajeComision);
	
	}
}