package projeto07;

import javax.swing.JOptionPane;

public class OrcamentoFamiliar {

	public static void main(String[] args) {
		Metodo metodo = new Metodo();
		Login login = new Login();
		
		int opcao = 1;
		int opcao1 = 0;

		while (opcao != 0) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma op��o para iniciar \n1 - Logar \n2 - Cadastrar novo usu�rie. \n0 - Finalizar sistema"));			
			
			//La�o de decis�o para fazer login/cadastro

			switch (opcao) {
			case 1:				
				login.setLogin();
								
				do {		
				opcao1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma op��o:\n1 - Cadastrar \n2 - Editar \n3 - Excluir \n4 - Consultar \n0 - Fazer logout"));
				
				//La�o de decis�o para usar o sistema
				
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
					JOptionPane.showMessageDialog(null ,"Op��o inv�lida","Alerta!",JOptionPane.ERROR_MESSAGE);
				}
				
				} while (opcao1 != 0);
				
				break;
				
				//Fim do la�o de decis�o para usar o sistema

			case 2:
				login.setCriar();
				break;
			
			case 0:
				break;
			
			default:
				JOptionPane.showMessageDialog(null ,"Op��o inv�lida","Alerta!",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
