package principal;

import javax.swing.*;
import conversorMoneda.ConversionMonedaOpciones;
import conversorTemperatura.ConversionTemperaturaOpciones;
import java.awt.EventQueue;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.TitledBorder;

@SuppressWarnings("unused")

public class Principal {

	private JFrame frmConversorAlura;
	private JButton btnMonedas;
	private JButton btnTemperatura;
	
	// Declarar una instancia de ConversionMonedaOpciones
	private ConversionMonedaOpciones conversionM = new ConversionMonedaOpciones();
	    
	public Principal() {
		initialize();
	}

	/**
	 * @wbp.parser.entryPoint
	 */

	private void initialize() {
		frmConversorAlura = new JFrame();
		frmConversorAlura.getContentPane().setBackground(new Color(128, 128, 255));
		frmConversorAlura.setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/sources/conversor.png")));
		frmConversorAlura.setTitle("Conversor - Alura");
		frmConversorAlura.getContentPane().setForeground(new Color(128, 128, 192));
		frmConversorAlura.setBounds(100, 100, 450, 400);
		frmConversorAlura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConversorAlura.getContentPane().setLayout(new GridBagLayout());

		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.rowWeights = new double[] { 0.0, 1.0, 0.0 };
		JPanel panel = new JPanel(gbl_panel);
		panel.setBackground(new Color(128, 128, 255));
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(10, 0, 10, 0);

		JLabel lblTitulo = new JLabel(" Seleccione una opción de conversión: ");
		lblTitulo.setFont(new Font("MV Boli", Font.BOLD, 18));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblTitulo, gbc);

		GridBagConstraints gbcBtnMonedas = new GridBagConstraints();
		gbcBtnMonedas.fill = GridBagConstraints.HORIZONTAL;
		gbcBtnMonedas.gridx = 0;
		gbcBtnMonedas.gridy = 1;
		gbcBtnMonedas.insets = new Insets(10, 0, 10, 0);

		btnMonedas = new JButton("Monedas /Divisas");
		btnMonedas.setIcon(new ImageIcon(Principal.class.getResource("/sources/money.png")));
		btnMonedas.setBackground(new Color(187, 0, 187));
		btnMonedas.setForeground(Color.WHITE);
		btnMonedas.setFont(new Font("Segoe Print", Font.BOLD, 14));
		btnMonedas.setBorder(null);
		btnMonedas.setFocusPainted(false);

		panel.add(btnMonedas, gbcBtnMonedas);
		btnMonedas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				convertirMonedas();
			}
		});

		GridBagConstraints gbcBtnTemperatura = new GridBagConstraints();
		gbcBtnTemperatura.fill = GridBagConstraints.HORIZONTAL;
		gbcBtnTemperatura.gridx = 0;
		gbcBtnTemperatura.gridy = 2;
		gbcBtnTemperatura.insets = new Insets(10, 0, 10, 0);

		btnTemperatura = new JButton("Temperatura");
		btnTemperatura.setIcon(new ImageIcon(Principal.class.getResource("/sources/termometer.png")));
		btnTemperatura.setBackground(new Color(205, 255, 155));
		btnTemperatura.setForeground(Color.BLACK);
		btnTemperatura.setFont(new Font("Segoe Print", Font.BOLD, 14));
		btnTemperatura.setBorder(null);

		panel.add(btnTemperatura, gbcBtnTemperatura);
		btnTemperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				convertirTemperatura();
			}
		});

		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridy = 0;
		gbc_panel.gridx = 1;
		frmConversorAlura.getContentPane().add(panel, gbc_panel);

		frmConversorAlura.setVisible(true);
	}

	private void convertirMonedas() {
		String inputMoneda = JOptionPane.showInputDialog(frmConversorAlura, "Ingrese el valor a convertir");
		if (inputMoneda != null) {
			double valorRecibido = Double.parseDouble(inputMoneda);
			conversionM.ConversionMoneda(valorRecibido);
			int respuestaMoneda = JOptionPane.showConfirmDialog(frmConversorAlura, "¿Desea realizar otra Conversión?");
			if (respuestaMoneda != JOptionPane.YES_OPTION) {
				frmConversorAlura.dispose();
			}
		}
	}

	private void convertirTemperatura() {
		String inputTemperatura = JOptionPane.showInputDialog(frmConversorAlura, "Ingrese el valor a convertir");
		if (inputTemperatura != null) {
			double valorRecibidoT = Double.parseDouble(inputTemperatura);
			
			int respuestaTemperatura = JOptionPane.showConfirmDialog(frmConversorAlura,
					"¿Desea realizar otra Conversión?");
			if (respuestaTemperatura != JOptionPane.YES_OPTION) {
				frmConversorAlura.dispose();
			}
		}
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Principal window = new Principal();
				window.frmConversorAlura.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

}

