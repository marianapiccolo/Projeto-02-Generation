package projeto07;

import javax.swing.JOptionPane;

public class OrcamentoFamiliar {

	public static void main(String[] args) {
		Metodo metodo = new Metodo();
		Login login = new Login();
		
		int opcao = 1;
		int opcao1 = 0;

		while (opcao != 0) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção para iniciar \n1 - Logar \n2 - Cadastrar novo usuárie. \n0 - Finalizar sistema"));			
			
			//Laço de decisão para fazer login/cadastro

			switch (opcao) {
			case 1:				
				login.setLogin();
								
				do {		
				opcao1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção:\n1 - Cadastrar \n2 - Editar \n3 - Excluir \n4 - Consultar \n0 - Fazer logout"));
				
				//Laço de decisão para usar o sistema
				
				switch (opcao1) {
				case 0:
					break;
					
				case 1:
					metodo.cadastros();
					break;
				
				case 2:					
					metodo.editar();				
					
					break;
					
				case 3:
					metodo.excluir();
					break;
				
				case 4:
					metodo.consultarLista();
					break;
				
				default:
					JOptionPane.showMessageDialog(null ,"Opção inválida","Alerta!",JOptionPane.ERROR_MESSAGE);
				}
				
				} while (opcao1 != 0);
				
				break;
				
				//Fim do laço de decisão para usar o sistema

			case 2:
				login.setCriar();
				break;
			
			case 0:
				break;
			
			default:
				JOptionPane.showMessageDialog(null ,"Opção inválida","Alerta!",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
