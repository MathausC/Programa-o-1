packcage com.CC;
import java.util.Scanner;

public class Main {
	public static void main (String [] arg){
		Scanner input = new Scanner(System.in);
		double sMinimo, horasTrabalhadas, sParcial, impostoRenda, aReceber;
		System.out.println("Bem-vindo a calculadora de sal�rios");
		System.out.print("Informe o valor do sal�rio m�nimo atual: ");
		sMinimo = input.nextDouble();
		System.out.print("Agora informe a quantidade de horas trabalhadas: ");
		horasTrabalhadas = input.nextDouble();
		sParcial = (sMinimo * (5 / 100)) * horasTrabalhadas;
		if(sParcial > 1500){
			impostoRenda = sParcial * (7.5 / 100);
		}
		else{
			impostoRenda = 0;
		}
		aReceber = sParcial + impostoRenda;
		System.out.println("O seu sal�rio � de R$ " + sParcial + ", o imposto cobrado foi de R$ " + impostoRenda + " e o valor a ser recebido ser� de R$ " + aReceber + ",");
	}
}