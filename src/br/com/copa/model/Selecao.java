package br.com.copa.model;

public class Selecao {
	
	public Selecao() {
		
	}
	
    public Selecao(int id, String nome, int pontos) {
		super();
		this.id = id;
		this.nome = nome;
		this.pontos = pontos;
	}
	private int id;
    private String nome;
    private int pontos;
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
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

}