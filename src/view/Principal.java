package view;

import javax.swing.JOptionPane;
import br.edu.fateczl.WillianMeirelles.pilhastring.*;
import controller.HistoricoController;

public class Principal {

	public static void main(String[] args) {
		HistoricoController Hcontroller = new HistoricoController();
		Pilha historico = new Pilha();
		String dado = "";
		int opc = 0;
		Boolean validador = false;
		while (validador==false) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Consulta de Historico. "
					+ "Digite os numeros para:\n"
					+ "1- Inserir um novo endereço\n"
					+ "2- Remover ultimo historico\n"
					+ "3- Consultar o Ultimo Endereço\n"
					+ "4- Sair"));
			switch (opc) {
			case 1: {
				dado = JOptionPane.showInputDialog("Digite o Link");
				historico = Hcontroller.ContrHistorico(historico, dado, opc);
			}break;
			case 2: {
				historico = Hcontroller.ContrHistorico(historico, dado, opc);
			}break;
			case 3: {
				historico = Hcontroller.ContrHistorico(historico, dado, opc);
			}break;
			case 4: {
				validador = true;
			}break;
			default:
				JOptionPane.showMessageDialog(null, "Opção invalida");
			}
		}
	}

}
