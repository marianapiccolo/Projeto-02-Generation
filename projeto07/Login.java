package projeto07;

import javax.swing.JOptionPane;

public class Login {	
	Administrador mae = new Administrador("Yasmin Silva", "Beco do Batman", 12345678910L, "(11) 93265-4896");
	Administrador pai = new Administrador(null, null, 0, null);
	
	int x;
	
	public void setLogin() {
		
		String login = null;
		String senha = null;

		login = JOptionPane.showInputDialog(null, "Entre com o seu login: ");
		senha = JOptionPane.showInputDialog(null, "Entre com o sua senha: ");
		
		x = 0;

		while (x != 1) {

			if (login.equals(mae.getNome()) && senha.equals("1234")) {
				JOptionPane.showMessageDialog(null, "Logade com sucesso\nBem vinde " + mae.getNome());
				x = 1;
			} else if (login.equals(pai.getNome()) && senha.equals(pai.getSenha())) {
				JOptionPane.showMessageDialog(null, "Logade com sucesso\nBem vinde " + pai.getNome());
				x = 1;
			} else {
				JOptionPane.showMessageDialog(null, "Login ou senha inválide!", "Alerta!", JOptionPane.ERROR_MESSAGE);
				x = 0;

				login = JOptionPane.showInputDialog(null, "Entre novamente o seu login: ");
				senha = JOptionPane.showInputDialog(null, "Entre novamente o sua senha: ");
			}
		}
	}
	
	public void setCriar() {
		pai.setNome(JOptionPane.showInputDialog(null, "Digite seu nome para login: "));
		pai.setEndereco(JOptionPane.showInputDialog(null, "Digite o endereço: "));
		pai.setCpf(Long.parseLong(JOptionPane.showInputDialog(null, "Digite o CPF: ")));
		pai.setTelefone(JOptionPane.showInputDialog(null, "Digite o telefone: "));
		pai.setSenha(JOptionPane.showInputDialog(null, "Crie uma senha: "));
		JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
	}
}
