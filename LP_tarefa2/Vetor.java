package LP_tarefa2;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		int aux = 0;
		
		int vector[] = {3, 5, 76, 43, 10, 46, 8, 23, 98, 18 };
		
		for(int j = 0; j<vector.length; j++) {
			for (int cl = 0; cl<vector.length; cl++) {
				if (vector[j] < vector [cl]) {
					aux = vector [j];
					vector [j] = vector[cl];
					vector[cl] = aux ;
					
				}
			}
		}
		
		for (int i = 0; i<vector.length; i++ ) {
			System.out.println(vector[i]+ "   ");
		}
		
		
		
		
				

	}

}
