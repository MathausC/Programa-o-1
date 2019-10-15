package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double quantidadeCriancasMasculinas = 0, quantidadeCriancasFemininas = 0, quantidadeCriancasTotal = 0, mediaDiasEncubacao, percentualMasculino, percentualFeminino, percentualPrematuros;
        int diasDeEcubacao, maiorDiaDeEncubacao = 0, somaDiasEncubacao = 0;
        char continuar = 'S', sexo, prematuro;
        System.out.println("Vamos fazer uma pesquisa com crianças recem nascidas.");
        while (continuar == 'S') {
            System.out.println("Informe o sexo da criança:");
            sexo = scanner.next().charAt(0);
            while (sexo != 'M' && sexo != 'F') {
                System.out.println("Informe o sexo da criança com 'M' para masculino e 'F' para feminino.");
                System.out.println("Informe o sexo da criança:");
                sexo = scanner.next().charAt(0);
            }
            System.out.println("Informe se a criança teve nascimento prematuro:");
            prematuro = scanner.next().charAt(0);
            while (prematuro != 'S' && prematuro != 'N') {
                System.out.println("Informe a prematuridade da criança com 'S' para sim e 'N' para não.");
                System.out.println("Informe se a criança teve nascimento prematuro:");
                prematuro = scanner.next().charAt(0);
            }
            if (prematuro == 'S') {
                System.out.println("Informe a quantidade de dias em encubação:");
                diasDeEcubacao = scanner.nextInt();
                while (diasDeEcubacao < 1) {
                    System.out.println("Deve ser preenchido pelo menos 1 dia de encubação.");
                    System.out.println("Informe a quantidade de dias em encubação:");
                    diasDeEcubacao = scanner.nextInt();
                }
                somaDiasEncubacao = somaDiasEncubacao + diasDeEcubacao;
                if (diasDeEcubacao > maiorDiaDeEncubacao) {
                    maiorDiaDeEncubacao = diasDeEcubacao;
                }
                if (sexo == 'M') {
                    quantidadeCriancasMasculinas = quantidadeCriancasMasculinas + 1;
                }
                else {
                    quantidadeCriancasFemininas = quantidadeCriancasFemininas + 1;
                }
            }
            quantidadeCriancasTotal = quantidadeCriancasTotal + 1;
            System.out.println("Deseja cadastrar mais uma criança?");
            continuar = scanner.next().charAt(0);
            while (continuar != 'S' && continuar != 'N') {
                System.out.println("Você deve preencher a resposta com 'S' para sim e 'N' para não.");
                System.out.println("Deseja cadastrar mais uma criança?");
                continuar = scanner.next().charAt(0);
            }
        }
        mediaDiasEncubacao = somaDiasEncubacao / (quantidadeCriancasFemininas + quantidadeCriancasMasculinas);
        percentualMasculino = (quantidadeCriancasMasculinas / (quantidadeCriancasFemininas + quantidadeCriancasMasculinas)) * 100;
        percentualFeminino = (quantidadeCriancasFemininas / (quantidadeCriancasMasculinas + quantidadeCriancasFemininas)) * 100;
        percentualPrematuros = ((quantidadeCriancasFemininas + quantidadeCriancasMasculinas) / quantidadeCriancasTotal) * 100;
        System.out.println("O percentual de prematuros é " + percentualPrematuros + "%;");
        System.out.println("O percentual de prematuros masculinos é " + percentualMasculino + "%;");
        System.out.println("O percentual de prematuros femininos é " + percentualFeminino + "%;");
        System.out.println("A media de dias de encubação é " + mediaDiasEncubacao + ".");
        System.out.println("A maior quantidade de dias é de " + maiorDiaDeEncubacao + ".");
    }
}
