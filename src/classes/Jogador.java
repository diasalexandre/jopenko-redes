package classes;

import java.util.ArrayList;

public class Jogador {

	private int idJogador;
	private int nome;
	private Jogada jogada;
	
	public ArrayList<Jogada> getJogadas() {
		
		return jogada.getJogadasJogador(idJogador);
		
	}
	
	public int getIdJogador() {
		return idJogador;
	}
	public void setIdJogador(int idJogador) {
		this.idJogador = idJogador;
	}
	public int getNome() {
		return nome;
	}
	public void setNome(int nome) {
		this.nome = nome;
	}
	
}
