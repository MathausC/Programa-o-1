packcage com.CC;
import java.util.Scanner;

public class Main {
	public static void main (String [] arg){
		Scanner input = new Scanner(System.in);
		double salario, gratificacao, percentualGratificacao;
		int anos;
		System.out.println("Qual o seu sal�rio?");
		salario = input.nestDouble();
		System.out.println("Quantos anos de empresa voc� tem?");
		anos = input.nestInt();
		if(anos > 15){
			percentualGratificacao = 20/100;
		}
		else{
			percentualGratificacao = 10/100;
		}
		gratificacao = salario * percentualGratificacao;
		System.out.println("Sua gratifica��o ser�de R$ " + gratificacao + ".");
	}
}