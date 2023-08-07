package conversorMoneda;


import javax.swing.JOptionPane;



public class ConversionMoneda {
	
	//Conversion de pesos argentinos a moneda extranjera
	
	public void ConvertirPesosArgentinoDolares(double valor) {
		double monedaDolar = valor * 0.0037;
		String resultadoDolar = String.format("%.2f", monedaDolar);
		JOptionPane.showMessageDialog(null, "Con tus pesos argentinos tienes " + resultadoDolar + " Dolares");
	}
	public void ConvertirPesosArgentinoEuros(double valor) {
		double monedaEuro = valor * 0.0033;
		String resultadoEuro = String.format("%.2f", monedaEuro);
		JOptionPane.showMessageDialog(null, "Con tus pesos argentinos tienes " + resultadoEuro + " Euros");
	}
	public void ConvertirPesosArgentinoLibra(double valor) {
		double monedaLibra = valor * 0.0028;
		String resultadoLibra = String.format("%.2f", monedaLibra);
		JOptionPane.showMessageDialog(null,"Con tus pesos argentinos tienes " + resultadoLibra + " Libras Esterlinas");
	}
	public void ConvertirPesosArgentinoYen(double valor) {
		double monedaYen = valor * 0.51;
		String resultadoYen = String.format("%.2f", monedaYen);
		JOptionPane.showMessageDialog(null, "Con tus pesos argentinos tienes " + resultadoYen + " Yen Japonés");
	}
	public void ConvertirPesosArgentinoWon(double valor) {
		double monedaWon = valor * 4.67;
		String resultadoWon = String.format("%.2f", monedaWon);
		JOptionPane.showMessageDialog(null, "Con tus pesos argentinos tienes " + resultadoWon + " Won sub-coreano");
	}
	
	//conversion de moneda extranjera a nacional $ars
	
	public void ConvertirDolaresPesosArgentino(double valor) {
		double monedaDolar = 0.0037 / valor;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Con tus Dolares (EE.UU) tienes " + monedaDolar + " pesos argentinos");
	}
	public void ConvertirEurosPesosArgentino(double valor) {
		double monedaEuro = valor / 0.0033;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Con tus Euros tienes " + monedaEuro + " pesos argentinos");
	}
	public void ConvertirLibraPesosArgentino(double valor) {
		double monedaLibra = valor / 0.0028;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Con tus Libras Esterlinas tienes " + monedaLibra + " pesos argentinos");
	}
	public void ConvertirYenPesosArgentino(double valor) {
		double monedaYen = valor / 0.51;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Con tus Yen Japonés tienes " + monedaYen + " pesos argentinos");
	}
	public void ConvertirWonPesosArgentino(double valor) {
		double monedaWon = valor / 4.67;
		monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Con tus Won sur-coreano tienes " + monedaWon + " pesos argentinos");
	}

}