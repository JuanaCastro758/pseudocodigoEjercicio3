import java.util.*;
public class Ejercicio3{
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		int n1,f=1;
		System.out.print("Ingrese numero: ");
		n1=scanner.nextInt();
		for (int i=1;i<=n1;i++){
            f*=i;
		}
        System.out.print("El faxtorial es "+f);
	}
}