package br.com.zup.heranca;

import java.util.ArrayList;
import java.util.List;

public class Ator extends Pessoa{
	private List<String> filmesParticipados = new ArrayList<String>();
	private boolean temOscar;
	private int anoNascimento;
	private String melhorFilme;
	
	public Ator(List<String> filmesParticipados, boolean temOscar, 
			int anoDeNascimento, String nome, String sobrenome, int idade ) {
		super(nome, sobrenome, idade);
		this.filmesParticipados = filmesParticipados;
		this.temOscar = temOscar;
		this.anoNascimento = anoDeNascimento;
		this.melhorFilme  = melhorFilme;
	}

	public List<String> getFilmesParticipados() {
		return filmesParticipados;
	}

	public void setFilmesParticipados(List<String> filmesParticipados) {
		this.filmesParticipados = filmesParticipados;
	}

	public boolean isTemOscar() {
		return temOscar;
	}

	public void setTemOscar(boolean temOscar) {
		this.temOscar = temOscar;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public String getMelhorFilme() {
		return melhorFilme;
	}

	public void setMelhorFilme(String melhorFilme) {
		this.melhorFilme = melhorFilme;
	}
	public String toString() {
		String modelo ="";
		modelo += "filmes participados-> " + this.getFilmesParticipados() + "\n";
		modelo += "nome -> " + super.getNome() + "\n";
		modelo += "sobrenome" + super.getSobrenome() + "\n";
		modelo += "idade -> " + super.getIdade() + "\n";
		modelo += "tem oscar? -> " + this.isTemOscar() + "\n";
		modelo += "ano de nascimento -> " + this.getAnoNascimento() +"\n";
		modelo += "melhor filme -> " + this.getMelhorFilme() + "\n";
		
		return modelo;
	}
	public String sorteioFilme(int numero, List<String> listaFilmesParticipados) {
		String filme = filmesParticipados.get(numero);
		return filme;
	}
}

