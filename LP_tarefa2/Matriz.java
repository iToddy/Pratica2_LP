package LP_tarefa2;

import java.security.SecureRadom;

public class Matriz {

	public static void main(String[] args) {
		int row = 50;
		int column =50;
		
		int [][] numbers=new int [row][column]; 
		
		for (int r = 0; r <row; r++) {
			for (int c = 0; c < column; c++ ) {
				numbers[l][c] = new SecureRandom().nextInt(100);
			}
			
		for (row = column){
			System.out.println(numbers, [row],[column]);
		}
		
		}

	}

}
