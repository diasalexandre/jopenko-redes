package classes;

public class Jogada {

	private int idJogada;
	private int idJogador1;
	private int idJogador2;
	private int	movimento1;
	private int movimento2;
	private int status;
	private int vencedor;
	
	
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
