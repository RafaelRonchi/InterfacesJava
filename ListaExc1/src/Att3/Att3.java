package Att3;

import java.lang.reflect.Array;


import javax.swing.JOptionPane;

public class Att3 {

	public static void main(String[] args) {
		Float[] Notas = new Float[3];
		Float total = (float) 0;
		
		for (int i = 0; i < Notas.length; i++) {
			Notas[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota: "));
			
			total += Notas[i];
		}
		total = total/3;
		if(total >= 6) {
			JOptionPane.showMessageDialog(null, "Aprovado! nota: " + total);
		} else if(total >=4 && total<6) {
			JOptionPane.showMessageDialog(null, "Recuperação! nota: " + total);
		} else if(total < 4) {
			JOptionPane.showMessageDialog(null, "Reprovado! nota: " + total);
		}
	} 

}
