package Att2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Att2 {

	public static void main(String[] args) {
		ArrayList<String> Array = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			Array.add(JOptionPane.showInputDialog("Preencha o array: " + Array));
		}
		
		JOptionPane.showMessageDialog(null, "ArrayList valores: " + Array);
	}

}
