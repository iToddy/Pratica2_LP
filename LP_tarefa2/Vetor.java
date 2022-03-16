package LP_tarefa2;

public class Vetor {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int aux = 0;
		
		int vector[] = {a , b , c, d};
		
		for(int j = o; j<vector.length; j++) {
			for (int c=o; c<victor.length; c++) {
				if (vector[j] < vector [c]) {
					aux = vector [j];
					vector [j] = vector[c];
					vector[c] = aux ;
					
				}
			}
		}
		
		for (int i = 0; i<vector.length; i++ ) {
			System.out.println(vector[i]+ "   ");
		}
		
		System.out.println("Insira valor de a");
		a = entrada.nextInt();
		
		System.out.println("Insira valor de b");
		b = entrada.nextInt();
		
		System.out.println("Insira valor de c");
		c = entrada.nextInt();
		
		System.out.println("Insira valor de d");
		d = entrada.nextInt();
		
		
				

	}

}
