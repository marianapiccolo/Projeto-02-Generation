package projeto07;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Metodo extends Login {
	
	List<String> gastosFixosNome = new ArrayList<String>();
	List<Double> gastosFixosValor = new ArrayList<Double>();
	List<String> gastosVariaveisNome = new ArrayList<String>();
	List<Double> gastosVariaveisValor = new ArrayList<Double>();
	double investimento, investimentoTotal;
	
	public String formatarMoeda(double valor) {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(valor);
		return formatoMoeda;
	}
	
//******************************************* CADASTROS DE CUSTOS *************************************************************************
	
	public void cadastros() {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção para cadastrar:\n1 - Gastos Fixos \n2 - Gastos Variáveis \n3 - Investimentos \n4 - Voltar"));
		
		int alternativa = 0;
		
		switch (opcao) {
		
		case 1:
			gastosFixosNome.add(JOptionPane.showInputDialog(null, "Digite o nome da conta: "));
			gastosFixosValor.add(Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor: ")));
			
			do {
				alternativa = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja cadastrar mais um gasto? Digite 1 para sim ou 2 para voltar ao menu de cadastros."));
				if (alternativa == 1) {
					gastosFixosNome.add(JOptionPane.showInputDialog(null, "Digite o nome da conta: "));
					gastosFixosValor.add(Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor: ")));
				}
			} while (alternativa == 1);
			break;
		
		case 2:
			gastosVariaveisNome.add(JOptionPane.showInputDialog(null, "Digite o nome da conta: "));
			gastosVariaveisValor.add(Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor: ")));
			
			do {
				alternativa = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja cadastrar mais um gasto? Digite 1 para sim ou 2 para voltar ao menu de cadastros."));
				if (alternativa == 1) {
					gastosVariaveisNome.add(JOptionPane.showInputDialog(null, "Digite o nome da conta: "));
					gastosVariaveisValor.add(Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor: ")));
				}
			} while (alternativa == 1);
			break;
			
		case 3:
			investimento = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor para investimento: "));
			investimentoTotal = investimentoTotal + investimento;
			
			break;
			
		case 4:
			break;
			
		default:
			JOptionPane.showMessageDialog(null ,"Opção inválida","Alerta!",JOptionPane.ERROR_MESSAGE);
		}
	}
	
//*********************************************** EDITAR **************************************************************

	public void editar() {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma categoria para editar:\n1 - Gastos Fixos \n2 - Gastos Variáveis \n3 - Voltar"));
		
		switch (opcao) {
		
		case 1:
		
			System.out.println("***********************************************************************************");
		
			for(int x = 0; x < gastosFixosNome.size(); x++){			
			
			System.out.println("Posição " + x + "\tNome da conta: " + gastosFixosNome.get(x) + "\nValor: R$ " + gastosFixosValor.get(x) + "\n");
		}
		
			System.out.println("Fim da lista!");
		
			int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Sua lista está impressa no console, digite a posição que você quer atualizar"));
		
			gastosFixosNome.remove(x);
			gastosFixosValor.remove(x);
		
			gastosFixosNome.add(JOptionPane.showInputDialog(null, "Digite o novo nome da conta: "));
			gastosFixosValor.add(Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o novo valor: ")));
		
			break;
		
		case 2:
			
			System.out.println("***********************************************************************************");
			
			for(x = 0; x < gastosVariaveisNome.size(); x++){			
				
				System.out.println("Posição " + x + "\tNome da conta: " + gastosVariaveisNome.get(x) + "\nValor: R$ " + gastosVariaveisValor.get(x) + "\n");
			}
			
			System.out.println("Fim da lista!");
			
			x = Integer.parseInt(JOptionPane.showInputDialog(null, "Sua lista está impressa no console, digite a posição que você quer atualizar"));
			
			gastosVariaveisNome.remove(x);
			gastosVariaveisValor.remove(x);
			
			gastosVariaveisNome.add(JOptionPane.showInputDialog(null, "Digite o novo nome da conta: "));
			gastosVariaveisValor.add(Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o novo valor: ")));
			
			break;
			
		case 3:
			break;
			
		default:
			JOptionPane.showMessageDialog(null ,"Opção inválida","Alerta!",JOptionPane.ERROR_MESSAGE);
		}		
	}		

//*********************************************** EXCLUIR **************************************************************

	public void excluir() {

		int opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Escolha uma categoria para excluir:\n1 - Gastos Fixos \n2 - Gastos Variáveis \n3 - Voltar"));

		switch (opcao) {

		case 1:

			System.out.println("***********************************************************************************");

			for (int x = 0; x < gastosFixosNome.size(); x++) {

				System.out.println("Posição " + x + "\tNome da conta: " + gastosFixosNome.get(x) + "\nValor: R$ "
						+ gastosFixosValor.get(x) + "\n");
			}

			System.out.println("Fim da lista!");

			int x = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Sua lista está impressa no console, digite a posição que você quer excluir"));

			int y = JOptionPane.showConfirmDialog(null, "Tem certeza de que quer excluir o item "
					+ gastosFixosNome.get(x) + " R$ " + gastosFixosValor.get(x) + " ?", "ATENÇÃO!",
					JOptionPane.YES_NO_OPTION);

			if (y == 0) {
				gastosFixosNome.remove(x);
				gastosFixosValor.remove(x);
			}
			break;

		case 2:

			System.out.println("***********************************************************************************");

			for (x = 0; x < gastosVariaveisNome.size(); x++) {

				System.out.println("Posição " + x + "\tNome da conta: " + gastosVariaveisNome.get(x) + "\nValor: R$ "
						+ gastosVariaveisValor.get(x) + "\n");
			}

			System.out.println("Fim da lista!");

			x = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Sua lista está impressa no console, digite a posição que você quer excluir"));

			y = JOptionPane.showConfirmDialog(null, "Tem certeza de que quer excluir o item " + gastosVariaveisNome.get(x)
					+ " R$ " + gastosVariaveisValor.get(x) + " ?", "ATENÇÃO!", JOptionPane.YES_NO_OPTION);

			if (y == 0) {
				gastosVariaveisNome.remove(x);
				gastosVariaveisValor.remove(x);
			}

			break;

		case 3:
			break;

		default:
			JOptionPane.showMessageDialog(null ,"Opção inválida","Alerta!",JOptionPane.ERROR_MESSAGE);
		}

	}
	
//*********************************************** CONSULTA **************************************************************

	public void consultarLista() {

		int opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Escolha uma categoria para consultar:\n1 - Gastos Fixos \n2 - Gastos Variáveis \n3 - Valor total de investimentos \n4 - Saldo \n5 - Voltar"));

		switch (opcao) {

		case 1:

			System.out.println("***********************************************************************************");

			for (int x = 0; x < gastosFixosNome.size(); x++) {

				System.out.println("Posição " + x + "\tNome da conta: " + gastosFixosNome.get(x) + "\nValor: R$ "
						+ gastosFixosValor.get(x) + "\n");
			}

			System.out.println("Fim da lista!");

			JOptionPane.showMessageDialog(null, "Sua lista está impressa no console.");

			break;

		case 2:

			System.out.println("***********************************************************************************");

			for (int x = 0; x < gastosVariaveisNome.size(); x++) {

				System.out.println("Posição " + x + "\tNome da conta: " + gastosVariaveisNome.get(x) + "\nValor: R$ "
						+ gastosVariaveisValor.get(x) + "\n");
			}

			System.out.println("Fim da lista!");

			JOptionPane.showMessageDialog(null, "Sua lista está impressa no console.");
			break;

		case 3:
			JOptionPane.showMessageDialog(null, "Seu investimento total é de " + this.formatarMoeda(investimentoTotal));
			break;
		
		case 4:
			double somaFixos = 0;
			double somaVariaveis = 0;
			
			for (double soma1 : gastosFixosValor) {
				somaFixos = somaFixos + soma1;
			}
			
			for (double soma2 : gastosVariaveisValor) {
				somaVariaveis = somaVariaveis + soma2;
			}
			
			double saldo =  mae.getReceitaMensal() + pai.getReceitaMensal() - somaFixos - somaVariaveis;
			
			JOptionPane.showMessageDialog(null, "Seu saldo total é de " + this.formatarMoeda(saldo));
			break;
		
		case 5:
			break;

		default:
			JOptionPane.showMessageDialog(null, "Opção inválida", "Alerta!", JOptionPane.ERROR_MESSAGE);
		}

	}

}
