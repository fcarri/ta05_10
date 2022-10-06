package project5;

import javax.swing.JOptionPane;

public class ta05_10 {
	public static void main(String args[]){
		
		int tot = 0;
		String nv = JOptionPane.showInputDialog("Número de ventas ");		
		int iNv = Integer.parseInt(nv);
		
		for (int n = 1;n <=iNv; n++) {			
			String v = JOptionPane.showInputDialog("Valor venta no "+n);	
			int iV = Integer.parseInt(v);			
			tot = tot + iV;
			
		}
		JOptionPane.showMessageDialog(null, "Total de vendas = "+tot);
	}
}
