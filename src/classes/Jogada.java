package classes;

public class Jogada {

	private int idJogada;
	private int idJogador1;
	private int idJogador2;
	private int	movimento1;
	private int movimento2;
	
	/**
	 * 1 - aguardando jogador
	 * 2 - aguardando 2 jogadas
	 * 3 - aguardando 1 jogada
	 * 4 - encerrada
	 */
	
	private int status;
	
	/**
	 * 1 - jogador 1
	 * 2 - jogador 2
	 * 3 - empate
	 */
	
	private int vencedor;
	
	static final int PEDRA = 1;
	static final int PAPEL = 2;
	static final int TESOURA = 3;
	
	public void defineVencedor() {
		
		switch (movimento1) {
		
		case (PEDRA) : switch (movimento2) {	
		case (PEDRA) : vencedor = 3;
					break;
		case (PAPEL) : vencedor = 2;
					break;
		default: vencedor = 1;
		} break;
		
		case (PAPEL) : switch (movimento2) {
		case (PAPEL) : vencedor = 3;
			break;
		case (PEDRA) : vencedor = 1;
			break;
		default: vencedor = 2;
		} break;
		
		case (TESOURA) : switch (movimento2) {
		case (TESOURA) : vencedor = 3;
			break;
		case (PAPEL) : vencedor = 1;
			break;
		default: vencedor = 2;
		}
		
		}
	}
	
	
	public int getIdJogada() {
		return idJogada;
	}
	public void setIdJogada(int idJogada) {
		this.idJogada = idJogada;
	}
	public int getIdJogador1() {
		return idJogador1;
	}	private int idJogador;
	private String nome;
	
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
	public void setIdJogador1(int idJogador1) {
		this.idJogador1 = idJogador1;
	}
	public int getIdJogador2() {
		return idJogador2;
	}
	public void setIdJogador2(int idJogador2) {
		this.idJogador2 = idJogador2;
	}
	public int getMovimento1() {
		return movimento1;
	}
	public void setMovimento1(int movimento1) {
		this.movimento1 = movimento1;
	}
	public int getMovimento2() {
		return movimento2;
	}
	public void setMovimento2(int movimento2) {
		this.movimento2 = movimento2;
	}
	
}
