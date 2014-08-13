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

import classes.Jogada;
import classes.Jogador;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class JogoFrame extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnPedra = new JButton("Pedra");
	private JButton btnPapel = new JButton("Papel");
	private JButton btnTesoura = new JButton("Tesoura");
	private JButton btnVoltae = new JButton("Voltae");
	private Jogador jogador;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JogoFrame frame = new JogoFrame();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public JogoFrame() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblResultado_1 = new JLabel("Resultado:");
		GridBagConstraints gbc_lblResultado_1 = new GridBagConstraints();
		gbc_lblResultado_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblResultado_1.gridx = 6;
		gbc_lblResultado_1.gridy = 0;
		getContentPane().add(lblResultado_1, gbc_lblResultado_1);
		
		JButton btnPedra_1 = new JButton("Pedra");
		GridBagConstraints gbc_btnPedra_1 = new GridBagConstraints();
		gbc_btnPedra_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnPedra_1.gridx = 6;
		gbc_btnPedra_1.gridy = 2;
		getContentPane().add(btnPedra_1, gbc_btnPedra_1);
		
		JButton btnPapel_1 = new JButton("Papel");
		GridBagConstraints gbc_btnPapel_1 = new GridBagConstraints();
		gbc_btnPapel_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnPapel_1.gridx = 6;
		gbc_btnPapel_1.gridy = 3;
		getContentPane().add(btnPapel_1, gbc_btnPapel_1);
		
		JButton btnTesoura_1 = new JButton("Tesoura");
		GridBagConstraints gbc_btnTesoura_1 = new GridBagConstraints();
		gbc_btnTesoura_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnTesoura_1.gridx = 6;
		gbc_btnTesoura_1.gridy = 4;
		getContentPane().add(btnTesoura_1, gbc_btnTesoura_1);
		
		JButton btnVolta = new JButton("Voltar");
		GridBagConstraints gbc_btnVolta = new GridBagConstraints();
		gbc_btnVolta.gridx = 6;
		gbc_btnVolta.gridy = 6;
		getContentPane().add(btnVolta, gbc_btnVolta);
		
	}

	
	/**
	 * Create the frame.
	 */
	public JogoFrame(Jogador jogador) {
		
		this.jogador = jogador;
		
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
		
		GridBagConstraints gbc_btnPedra = new GridBagConstraints();
		gbc_btnPedra.insets = new Insets(0, 0, 5, 0);
		gbc_btnPedra.gridx = 6;
		gbc_btnPedra.gridy = 2;
		contentPane.add(btnPedra, gbc_btnPedra);
		
		GridBagConstraints gbc_btnPapel = new GridBagConstraints();
		gbc_btnPapel.insets = new Insets(0, 0, 5, 0);
		gbc_btnPapel.gridx = 6;
		gbc_btnPapel.gridy = 3;
		contentPane.add(btnPapel, gbc_btnPapel);
		
		GridBagConstraints gbc_btnTesoura = new GridBagConstraints();
		gbc_btnTesoura.insets = new Insets(0, 0, 5, 0);
		gbc_btnTesoura.gridx = 6;
		gbc_btnTesoura.gridy = 4;
		contentPane.add(btnTesoura, gbc_btnTesoura);
		
		GridBagConstraints gbc_btnVoltae = new GridBagConstraints();
		gbc_btnVoltae.gridx = 6;
		gbc_btnVoltae.gridy = 6;
		contentPane.add(btnVoltae, gbc_btnVoltae);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == btnPedra) {
			try {
				jogador.fazerJogada(Jogada.PEDRA);
			} catch (ClassNotFoundException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (e.getSource() == btnPapel) {
			try {
				jogador.fazerJogada(Jogada.PAPEL);
			} catch (ClassNotFoundException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (e.getSource() == btnTesoura) {
			try {
				jogador.fazerJogada(Jogada.TESOURA);
			} catch (ClassNotFoundException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}

}
