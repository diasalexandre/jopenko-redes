package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;

import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JButton;

import classes.Jogador;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class MainJogo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainJogo window = new MainJogo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainJogo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		Jogador jogador = new Jogador();
		
		jogador.setIdJogador(1);
		jogador.setNome("Guilherme Carneiro");
		
		JLabel lblJogador = new JLabel("Jogador");
		
		lblJogador.setText(jogador.getNome());
		lblJogador.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblJogador, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnVerJogosEm = new JButton("Ver jogos em andamento");
		GridBagConstraints gbc_btnVerJogosEm = new GridBagConstraints();
		gbc_btnVerJogosEm.insets = new Insets(0, 0, 5, 5);
		gbc_btnVerJogosEm.gridx = 5;
		gbc_btnVerJogosEm.gridy = 1;
		panel.add(btnVerJogosEm, gbc_btnVerJogosEm);
		
		JButton btnNovoJogo = new JButton("Novo Jogo");
		GridBagConstraints gbc_btnNovoJogo = new GridBagConstraints();
		gbc_btnNovoJogo.insets = new Insets(0, 0, 5, 5);
		gbc_btnNovoJogo.gridx = 5;
		gbc_btnNovoJogo.gridy = 3;
		panel.add(btnNovoJogo, gbc_btnNovoJogo);
		
		JButton btnVerAmigosOnline = new JButton("Ver amigos online");
		GridBagConstraints gbc_btnVerAmigosOnline = new GridBagConstraints();
		gbc_btnVerAmigosOnline.insets = new Insets(0, 0, 0, 5);
		gbc_btnVerAmigosOnline.gridx = 5;
		gbc_btnVerAmigosOnline.gridy = 5;
		panel.add(btnVerAmigosOnline, gbc_btnVerAmigosOnline);
	}
}
