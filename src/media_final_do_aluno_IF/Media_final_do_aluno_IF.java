package media_final_do_aluno_IF;

import java.util.Scanner;

public class Media_final_do_aluno_IF {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double nota1, nota2, nota3, media, percentualFaltas;
		int numAulas, numFaltas;
		System.out.println("Digite a primeira nota.");
		nota1 = input.nextDouble();
		
		System.out.println("Digite a segunda nota.");
		nota2 = input.nextDouble();
		
		System.out.println("Digite a terceira nota.");
		nota3 = input.nextDouble();
		
		System.out.println("Digite a quantodade de aulas ministradas.");
		numAulas = input.nextInt();
		
		System.out.println("Digite a quantidade de faltas.");
		numFaltas = input.nextInt();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		percentualFaltas = numAulas * 0.25;
		
		if (numFaltas >= percentualFaltas) {
			System.out.println("Reprovado por falta");
			System.exit(0); // Encerra o programa aqui
		}
		
		if (media >=7) {
			System.out.println("Aprovado.");
		} else if (media < 3) {
			System.out.println("Reprovado por nota.");
		}else {
			System.out.println("Em exame.");
		}
	}

}
