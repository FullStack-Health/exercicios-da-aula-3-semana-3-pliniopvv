package senai.exercicio.entities;

public class Jogador {
	private int id;
	private String nome;
	private String apelido;
	private int numero;
	private String posicao;
	private int qualidade;
	private int cartoes;
	private boolean suspenso;

	public Jogador() {

	}

	public Jogador(int id, String nome, String apelido, int numero, String posicao, int qualidade, int cartoes,
			boolean suspenso) {
		super();
		this.id = id;
		this.nome = nome;
		this.apelido = apelido;
		this.numero = numero;
		this.posicao = posicao;
		this.qualidade = qualidade;
		this.cartoes = cartoes;
		this.suspenso = suspenso;
	}
	
	public boolean verificarCondicaoDeJogo() {
		return this.cartoes > 3 || this.suspenso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public int getQualidade() {
		return qualidade;
	}

	public void setQualidade(int qualidade) {
		this.qualidade = qualidade;
	}

	public int getCartoes() {
		return cartoes;
	}

	public void setCartoes(int cartoes) {
		this.cartoes = cartoes;
	}

	public boolean isSuspenso() {
		return suspenso;
	}

	public void setSuspenso(boolean suspenso) {
		this.suspenso = suspenso;
	}

}
