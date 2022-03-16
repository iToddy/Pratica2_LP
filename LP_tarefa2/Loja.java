package LP_tarefa2;

import java.util.Scanner;

public class Loja {

	public static int main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner(System.in);
		
		int expensesClient;
		float payTotal1;
		float payTotal2;
		float payTotal3;
		int numMonths;
		
		
		System.out.println("Gasto do cliente:");
		expensesClient = entrada.nextInt();
		
		System.out.println("Selecione forma de pagamento:  "
				+ " 1- À vista "
				+ " 2- Parcelado 2x: em duas vezes (preço da etiqueta) "
				+ " 3- Parcelado de 3x até 6x: de 3 até 6 vezes com 3% de juros ao mês (somente para\r\n"
				+ "compras acima de R$ 500,00 - inclusive).");
		
		switch (expensesClient) {
			case 1: 
				payTotal1 = (float) (expensesClient * 0.9);
				return expensesClient;
				
				break;
			
			case 2:
				payTotal2 = expensesClient / 2 ;
				String payment = "Valor a pagar: Duas parcelas de:" + payTotal2;
				
				return payment;
				
				break;
				
			case 3: 
				
				System.out.println("Quantas parcelas solicitadas?");
				numMonths = entrada.nextInt();
				
				if (numMonths == 3 || numMonths == 4 || numMonths == 5 || numMonths == 6) {
					
					for (int i =0; i <= numMonths; i++) {
						payTotal3 = expensesClient;
						payTotal3 = payTotal3 + (payTotal3 * 1.03);
					}
					
					return payTotal3;
				}
				
			default: 
				System.out.print("Selecione uma das opções de pagamento");
				
				break;
				
		}
		
				
	}

}
