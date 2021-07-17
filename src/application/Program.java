package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		int[][] mat = new int[n][n];
		
		for (int i=0; i<n ; i++) { //PERCORRE A LINHA
			for (int j=0; j<n;j++) //PERCORRE A CONLUNA
				
			mat[i][j] = sc.nextInt();
		}
		
		System.out.println("MAIN DIAGONAL:");
		for (int i = 0; i<n ; i++) { // TRAZ OS VALORES NA DIAGONAL, VISTO Q 
									// OS NUNEROS EM DIAGONAL TEM O MESMO NUMERO DE COLUNA E LINHA
									//POR EXEMPLO, COLUNA 1 LINHA 1, COLUNA 2 LINHA 2 ETC..
			System.out.print(mat[i][i] + " "); // AQUI O MAT[I][I] IMPRIME OQ CONTEM DENTRO DAQELA MATRIZ NUMERADA
		}
		System.out.println();
		
		
		int count = 0;
		for (int i = 0; i<mat.length ;i++) { //MAT.LENGTH PARA LINHAS
			for (int j = 0; j<mat[i].length; j++) { //MAT[I] PARA SELECIONAR A LINHA E TRAZER O TANTO DE COLUNA
				if(mat[i][j] < 0) { // TRAZ PRA MIM VALORES MENOR Q 0
					count++; //SE APARECER ALGUM, AUMENTA O CONTADOR
				}
			}
		}
		
		System.out.println("negativa numbers = " + count); //IMPRIME O CONTADOR
		
		
		sc.close();
		
	}

}
