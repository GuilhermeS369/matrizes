package application;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int pos1 = sc.nextInt();
		int pos2 = sc.nextInt();
		
		int[][] mat = new int[pos1][pos2];
	
		for (int i=0; i<mat.length ; i++)
		{
			for (int j = 0; j<mat[i].length; j++)
			{
				mat[i][j] = sc.nextInt();
				
			}
			
		}
		
		int nchave = sc.nextInt();
		
		//ESSE É O POSITION
		for (int i=0; i<mat.length ; i++)
		{
			for (int j = 0; j<mat[i].length; j++)
			{
				if (nchave == mat[i][j]) {
					
					System.out.printf("Position: %d , %d %n",i,j);
					System.out.println("left:" + mat[i][j-1]);
					
					if(j<pos2-1){
						
						System.out.println("right:" + mat[i][j+1]);
					}
					
					if(i>0) {
					System.out.println("up:" + mat[i-1][j]);
					}
					
					if(i<pos1-1) {
						System.out.println("down:" + mat[i+1][j]);
						}
					
				}
				
			}
			
		}
		
		
		
		sc.close();
		
		
		
		
		
	}

}
