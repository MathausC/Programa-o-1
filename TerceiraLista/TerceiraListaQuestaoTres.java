packcage com.CC;
import java.util.Scanner;

public class TerceiraLIstaQuestaoTres {
	public static void main (String [] arg){
		Scanner input = new Scanner(System.in);
		double numero;
		System.out.println("Descubra se o número é par ou impar.");
		System.out.println("Informe o número");
		numero = input.nextDouble();
		if(numero % 2 == 0) {
			System.out.println("O número é par.");
		}
		else{
			System.out.println("O seu número é impar");
		}
	}
}