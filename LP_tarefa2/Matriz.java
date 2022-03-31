package LP_tarefa2;

import java.security.SecureRadom;

public class Matriz {

	public static void main(String[] args) {
		
		int impar = 1;
		int row = 50;
		int column = 50;
		
		int [][] numbers=new int [row][column]; 
		
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++ ) {
				numbers[r][c] = impar ;
				impar = impar+2;
			
				if (r = c) {
					System.out.println(numbers [r][c]);
			}
			
		
		}
		
		}

	}
	
	// final do código 
	

}
