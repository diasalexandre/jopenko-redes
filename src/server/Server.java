package server;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


/**
 * Mensagens
 * 1 - Conexão aceita
 * 
 * 2 - Vencedor
 * 3 - Perdedor
 * 4 - Vencedor
 * 
 * @author 034547502291
 *
 */
public class Server extends JFrame {

	private JPanel contentPane;
	private ServerSocket serverSocket;
	private Socket socket;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Server frame = new Server();
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
	public Server() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	public void runServer() {
		
		try {
			
			serverSocket = new ServerSocket(15333, 10);
			
			while (true) {
				esperaConexao();
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void esperaConexao() {
		
		
		
	}
	
	
}
