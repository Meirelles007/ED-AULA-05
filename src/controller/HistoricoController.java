package controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.WillianMeirelles.pilhastring.*;

public class HistoricoController {

	public Pilha ContrHistorico(Pilha historico, String dado, int opc) {
		String nomevalidos = "http://www.";

		switch (opc) {
		case 1:
			if (dado.contains(nomevalidos)) {
				historico = inserirhistorico(historico, dado);
			} else {
				JOptionPane.showMessageDialog(null, "URL invalida");
			}
			break;
		case 2:
			if (historico.size() >= 1) {
				historico = removerhistorico(historico, dado);
			} else {
				JOptionPane.showMessageDialog(null, "Sem Historico");
			}
			break;
		case 3:
			if (historico.size() >= 1) {
				colsultarhistorico(historico, dado);
			}
			break;
		}
		return historico;
	}

	private void colsultarhistorico(Pilha historico, String dado) {
		String site = "";
		try {
			site = historico.top();
			JOptionPane.showMessageDialog(null, "Ultimo site: " + site);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private Pilha inserirhistorico(Pilha historico, String dado) {
		historico.push(dado);
		return historico;
	}

	private Pilha removerhistorico(Pilha historico, String dado) {
		String site = "";
		try {
			site = historico.pop();
			JOptionPane.showMessageDialog(null, "Historico: " + site);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return historico;
	}
}
