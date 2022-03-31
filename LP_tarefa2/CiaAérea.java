package LP;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int [] lugares = new int [100];
		
		Beggin_Registrer:
		System.out.println("Selecione uma das opções do Menu"
				+ "1- Cadastrar Passageiro"
				+ "2- Check in"
				+ "Cancelar Vôo"
				+ "Sair");
		
		short num = entrada.nextShort();
		
		while (num != 4) {
			
			switch (num) {
			case 1:
				System.out.println("Insira seu Nome");
				String name = entrada.next();
				
				System.out.println("Insira seu CPF");
				String cpf = entrada.next();
				
				System.out.println("Insira o número do vôo");
				int numflight = entrada.nextInt(); 
				
				break;
			
			case 2: 
				System.out.println("Insira seu CPF");
				String cpfCheck = entrada.next();
				
				System.out.println("Insira o número do seu vôo");
				int flightCheck = entrada.nextInt();
				
				
				System.out.println("Escolha sua poltrona");
				int poltrona = entrada.nextInt();
				
				if ( lugares [poltrona- 1] = 0) {
					lugars[poltrona- 1 ] = poltrona
					System.out.println("Check in realizado com sucesso");		
				} else {
					System.out.println("Poltrona já ocupada");
				}
				
				break;
				
			case 3:
				System.out.println("Insira seu CPF");
				String cpfcancel = entrada.next();
				
				System.out.println("Insira o número do seu vôo");
				int flightCancel = entrada.nextInt();
				
				System.out.println("Insira o número da poltrona");
				int poltronaCancel = entrada.nextInt();
				
				if (lugares[poltraonaCancel - 1]!= 0) {
					lugares[poltraonaCancel] = 0
							System.out.println("Vôo cancelado");
				}
				break;
				
			default: 
				System.out.println("Opção inválida, por favor insira um numero de 1 a 4 ");
		}
		
			short num = entrada.nextShort();
		
		}
		
		
	}
	

}
		