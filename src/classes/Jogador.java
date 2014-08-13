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
	
	public void novoJogo(Jogador jogador) throws UnknownHostException, IOException {
		
		jogo = new Socket("localhost", 15333);
		
		output = new ObjectOutputStream(jogo.getOutputStream());
		output.flush();
	
		input = new ObjectInputStream(jogo.getInputStream());
		
		
		
	}
	
	public void fazerJogada(int movimento) {
		
		
		
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
