package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;

public class JogoFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JogoFrame frame = new JogoFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JogoFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblResultado = new JLabel("Resultado");
		GridBagConstraints gbc_lblResultado = new GridBagConstraints();
		gbc_lblResultado.insets = new Insets(0, 0, 5, 0);
		gbc_lblResultado.gridx = 6;
		gbc_lblResultado.gridy = 0;
		contentPane.add(lblResultado, gbc_lblResultado);
		
		JButton btnPedra = new JButton("Pedra");
		GridBagConstraints gbc_btnPedra = new GridBagConstraints();
		gbc_btnPedra.insets = new Insets(0, 0, 5, 0);
		gbc_btnPedra.gridx = 6;
		gbc_btnPedra.gridy = 2;
		contentPane.add(btnPedra, gbc_btnPedra);
		
		JButton btnPapel = new JButton("Papel");
		GridBagConstraints gbc_btnPapel = new GridBagConstraints();
		gbc_btnPapel.insets = new Insets(0, 0, 5, 0);
		gbc_btnPapel.gridx = 6;
		gbc_btnPapel.gridy = 3;
		contentPane.add(btnPapel, gbc_btnPapel);
		
		JButton btnTesoura = new JButton("Tesoura");
		GridBagConstraints gbc_btnTesoura = new GridBagConstraints();
		gbc_btnTesoura.insets = new Insets(0, 0, 5, 0);
		gbc_btnTesoura.gridx = 6;
		gbc_btnTesoura.gridy = 4;
		contentPane.add(btnTesoura, gbc_btnTesoura);
		
		JButton btnVoltae = new JButton("Voltae");
		GridBagConstraints gbc_btnVoltae = new GridBagConstraints();
		gbc_btnVoltae.gridx = 6;
		gbc_btnVoltae.gridy = 6;
		contentPane.add(btnVoltae, gbc_btnVoltae);
	}

}
