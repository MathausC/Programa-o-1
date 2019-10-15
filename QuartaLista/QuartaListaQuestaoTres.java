package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner  input =  new Scanner(System.in);
        double pesoCarga, valorEntrega, imposto, valorCarga;
        int codigoCarga, codigoLocal;
        String mensagem;
        System.out.println("Verifique o valor da sua entrega.");
        System.out.println("Informe o peso da carga:");
        pesoCarga = input.nextDouble();

        if (pesoCarga <= 0) {
            mensagem = "O peso informado não condiz com a realidade.";
        }
        else {
            System.out.println("Agora, informe o código da carga:");
            codigoCarga = input.nextInt();

            if (codigoCarga < 10){
                mensagem = "O código da carga é invalido.";
            }
            else if (codigoCarga > 40) {
                mensagem = "O código da carga é invalido.";
            }
            else{
                System.out.println("Por fim, informe o código do local de entrega:");
                codigoLocal = input.nextInt();

                if (codigoLocal < 1){
                    mensagem = "O código do local de entrega é invalido.";
                }
                else if (codigoLocal > 5) {
                    mensagem = "o código do local de entrega é invalido.";
                }
                else {
                    if (codigoCarga <= 20){
                        valorCarga = pesoCarga * 10;
                    }
                    else if (codigoCarga <= 30){
                        valorCarga = pesoCarga * 25;
                    }
                    else {
                        valorCarga = pesoCarga * 35;
                    }

                    if (codigoLocal == 1) {
                        imposto = valorCarga * 0.35;
                    }
                    else if (codigoLocal == 2) {
                        imposto = valorCarga * 0.25;
                    }
                    else if (codigoLocal == 3) {
                        imposto = valorCarga * 0.15;
                    }
                    else if (codigoLocal == 4) {
                        imposto = valorCarga * 0.05;
                    }
                    else {
                        imposto = 0;
                    }

                    valorEntrega = valorCarga + imposto;
                    mensagem = "O valor da carga é R$" + valorCarga + " e será cobrado R$" + imposto + " de imposto, dando um total de R$" + valorEntrega + " a pagar.";
                }
            }
        }
        System.out.println(mensagem);
    }
}
