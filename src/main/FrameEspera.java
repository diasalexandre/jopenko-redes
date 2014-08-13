package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import classes.Jogador;

public class FrameEspera extends JFrame {

	private JPanel contentPane;
	private Jogador jogador;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 * @throws UnknownHostException 
	 */
	public FrameEspera(Jogador jogador) throws UnknownHostException, ClassNotFoundException, IOException {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		
		
		
			
		JLabel lblAguardandoJogador = new JLabel("Aguardando Jogador...");
		
		
		lblAguardandoJogador.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblAguardandoJogador, BorderLayout.CENTER);
		
		this.setVisible(true);
		
		jogador.novoJogo(jogador);
		
		this.setVisible(false);
		
		JogoFrame framejogo = new JogoFrame(jogador);
	}
	
	
	

}
