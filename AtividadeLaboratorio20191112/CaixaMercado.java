package com.CC;

import java.util.Scanner;

public class CaixaMercado {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		exibePrograma();
	}

	public static void exibePrograma() {
		Scanner input = new Scanner(System.in);
		int quantidadeProdutos, codigoProduto;
		double valorCompra = 0, valorProduto, valorTotal = 0, valorAnterior = 0, dinheiro = 0;
		
		do {
			do {
				System.out.print("Informe o c�digo do produto:");
				codigoProduto = input.nextInt();
				while (codigoProduto < 1 || codigoProduto > 50) {
					System.out.println("C�digo incorreto.");
					System.out.print("Informe o c�digo do produto:");
					codigoProduto = input.nextInt();
				}

				System.out.print("Informe a quantidade deste produto: ");
				quantidadeProdutos = input.nextInt();
				while (quantidadeProdutos <= 0) {
					System.out.println("Quantidade de produtos deve ser maior que zero");
					System.out.print("Informe a quantidade deste produto: ");
					quantidadeProdutos = input.nextInt();
				}

				valorProduto = retornaPreco(codigoProduto);
				valorCompra = TotalGastoComProduto(valorProduto, quantidadeProdutos);
				valorTotal = RetornoValorDaCompra(valorCompra, valorAnterior);
				valorAnterior = valorTotal;

				System.out.println("Valor parcial: " + valorCompra);
				System.out.println(
						"Voc� quer Registrar mais algum produto ? \n Se quiser encerrar, Digite 0 ou digite 1 para Continuar.");
				codigoProduto = input.nextInt();

				while (codigoProduto < 0 || codigoProduto > 1) {
					System.out.println("Op��o Incorreta");
					System.out.println(
							"Voc� quer Registrar mais algum produto ? \n Se quiser encerrar, Digite 0 ou digite 1 para Continuar.");
					codigoProduto = input.nextInt();
				}

			} while (codigoProduto != 0);

			System.out.println("Informe a quantidade em dinehiro para pagamento:");
			dinheiro = input.nextDouble();
			
			while (dinheiro <= 0) {
				System.out.println("O valor em dinheiro deve ser maior que zero (0)");
				System.out.println("Informe a quantidade em dinehiro para pagamento:");
				dinheiro = input.nextDouble();
			}
			
			exibeCedulaTroco(dinheiro);
			
			System.out.println("Ainda deseja fazer mais uma compra? "
					+ "\n Digite para encerrar ou 1 para fazer mais uma compra.");
			codigoProduto = input.nextInt();

			while (codigoProduto < 0 || codigoProduto > 1) {
				System.out.println("Op��o Incorreta");
				System.out.println("Ainda deseja fazer mais uma compra? "
						+ "\n Digite para encerrar ou 1 para fazer mais uma compra.");
				codigoProduto = input.nextInt();
			}
		}
		while(codigoProduto != 0);
		
		System.out.print("programa encerrado.");
		

	}

	public static double retornaPreco(int prod) {
		double preco;
		if (prod >= 1 && prod <= 5) {
			preco = 1.0;
		} else if (prod <= 10) {
			preco = 2.0;
		} else if (prod <= 15) {
			preco = 3.0;
		} else if (prod <= 20) {
			preco = 4.0;
		} else if (prod <= 25) {
			preco = 5.0;
		} else if (prod <= 30) {
			preco = 6.0;
		} else if (prod <= 35) {
			preco = 7.0;
		} else if (prod <= 40) {
			preco = 8.0;
		} else if (prod <= 45) {
			preco = 9.0;
		} else if (prod <= 50) {
			preco = 10.0;
		} else {
			preco = 0;
		}
		return preco;
	}

	public static double TotalGastoComProduto(double PrecoDoProduto, int QuantidadecComprada) {
		double TotalGastoComProduto = PrecoDoProduto * QuantidadecComprada;
		return TotalGastoComProduto;
	}

	public static double RetornoValorDaCompra(double TotalgastoComUmProduto, double TotalDaCompraMomento) {
		double ValorTotaldaCompra = TotalgastoComUmProduto + TotalDaCompraMomento;
		return ValorTotaldaCompra;
	}

	public static double ValordoTroco(double ValorTotaldaCompra, double ValorRecebidoEmDinheiro) {
		double TrocoFinal = ValorRecebidoEmDinheiro - ValorTotaldaCompra;
		return TrocoFinal;
	}

	public static void exibeCedulaTroco(double valor) {
		int cedula50 = 0, cedula20 = 0, cedula10 = 0, cedula5 = 0, cedula2 = 0;
		double moedas;

		while (valor > 50) {
			valor = valor - 50;
			cedula50++;
		}
		while (valor > 20) {
			valor = valor - 20;
			cedula20++;
		}
		while (valor > 10) {
			valor = valor - 10;
			cedula10++;
		}
		while (valor > 5) {
			valor = valor - 5;
			cedula5++;
		}
		while (valor > 2) {
			valor = valor - 5;
			cedula2++;
		}
		moedas = valor;
		System.out.println("O troco ser� dado em:");
		exibeQuantidadeCedulas(cedula50, 50);
		exibeQuantidadeCedulas(cedula20, 20);
		exibeQuantidadeCedulas(cedula10, 10);
		exibeQuantidadeCedulas(cedula5, 5);
		exibeQuantidadeCedulas(cedula2, 2);
		System.out.println(moedas + " em moedas.");
	}

	public static void exibeQuantidadeCedulas(int quantidadeCedulas, int cedula) {
		if (quantidadeCedulas > 0) {
			System.out.println(quantidadeCedulas + " cedulas de " + cedula);
		}

	}

}
