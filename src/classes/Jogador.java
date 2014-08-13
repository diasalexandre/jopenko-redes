package classes;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class Jogador {

	private int idJogador;
	private String nome;
	private Socket jogo;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private String mensagemFrame;
	private int status;
	
	public void novoJogo(Jogador jogador) throws UnknownHostException, IOException, ClassNotFoundException {
		
		jogo = new Socket("localhost", 15333);
		String message;
		
		output = new ObjectOutputStream(jogo.getOutputStream());
		output.flush();
	
		input = new ObjectInputStream(jogo.getInputStream());
		
		do {
			message = (String) input.readObject();
			
			if (message.equals("1")) {
				mensagemFrame = "Jogo iniciado";
			}
		} while (message.isEmpty());
		
		
	}
	
	public void fazerJogada(int movimento) throws IOException, ClassNotFoundException {
		
		output.writeObject((new Integer(movimento)).toString());
		
		status = 0;
		
		String message;
		
		do {
			message = (String) input.readObject();
			
			if (message.equals("2")) {
				mensagemFrame = "Vencedor";
				status = 1;
			} else if (message.equals("3")) {
				mensagemFrame = "Perdedor";
				status = 1;
			} else if (message.equals("4")) {
				mensagemFrame = "Empate";
				status = 1;
			}
			
			
		} while (message.isEmpty());
		
	}
	
	
	
	public int getIdJogador() {
		return idJogador;
	}
	public void setIdJogador(int idJogador) {
		this.idJogador = idJogador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
