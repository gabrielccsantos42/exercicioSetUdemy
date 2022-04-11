package aplicacao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int codigoAlunos;

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("Quantos alunos estudam no curso A: ");
		int quantidadeA = read.nextInt();
		
		
		for(int i = 1; i <= quantidadeA; i++) {
			codigoAlunos = read.nextInt();
			a.add(codigoAlunos);
		}
		
		System.out.print("Quantos alunos estudam no curso B: ");
		int quantidadeB = read.nextInt();
		
		for(int i = 1; i <= quantidadeB; i++) {
			codigoAlunos = read.nextInt();
			b.add(codigoAlunos);
		}

		System.out.print("Quantos alunos estudam no curso C: ");
		int quantidadeC = read.nextInt();
		
		for(int i = 1; i <= quantidadeC; i++) {
			codigoAlunos = read.nextInt();
			c.add(codigoAlunos);
		}
		
		Set<Integer> total = new HashSet<>();
		
		total.addAll(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println(total.size());
		
		read.close();
	}

}
