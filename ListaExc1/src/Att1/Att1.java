package Att1;

import javax.swing.JOptionPane;

public class Att1 {

	public static void main(String[] args) {
		Double precoLitro = Double.parseDouble( JOptionPane.showInputDialog("Insira o preço do litro: "));
		Integer quantidadesLitros = Integer.parseInt( JOptionPane.showInputDialog("Insira o preço do litro: "));
		
		Double pagamento = totalPagamento(precoLitro, quantidadesLitros);
		JOptionPane.showMessageDialog(null, "Valor a pagar: " + pagamento);
	}
	
	public static  Double totalPagamento(Double precoLitro, Integer quantidadesLitros) {
		Double pagamento = precoLitro * quantidadesLitros;
		return pagamento;
		
	}
}
