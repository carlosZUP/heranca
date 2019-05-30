package br.com.zup.heranca;

import java.util.List;

public class Programador extends Pessoa{

	List<String> linguagensUsadas;

	private int anosExperiencia;
	private boolean gostaDeCafe;

	public Programador(List<String> linguagensUsadas, int anosExperiencia, boolean gostaDeCafe, String nome,
			String sobrenome, int idade) {
		super(nome, sobrenome, idade);
		this.anosExperiencia = anosExperiencia;
		this.linguagensUsadas = linguagensUsadas;
		this.gostaDeCafe = gostaDeCafe;
	}

	public List<String> getLinguagensUsadas() {
		return linguagensUsadas;
	}

	public void setLinguagensUsadas(List<String> linguagensUsadas) {
		this.linguagensUsadas = linguagensUsadas;
	}

	public int getAnosExperiencia() {
		return anosExperiencia;
	}

	public void setAnosExperiencia(int anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}

	public boolean isGostaDeCafe() {
		return gostaDeCafe;
	}

	public void setGostaDeCafe(boolean gostaDeCafe) {
		this.gostaDeCafe = gostaDeCafe;
	}
	public String toString() {
		
		String modelo = "";
		modelo += "Nome -> " + super.getNome() + "\n";
		modelo += "sobrenome -> " + super.getSobrenome() + "\n";
		modelo += "Idade -> " + super.getIdade() + "\n";
		modelo += "linguagens Usadas -> " + this.getLinguagensUsadas() + "\n";
		modelo += "anos De Experiencia -> " + this.getAnosExperiencia() + "\n";
		modelo += "gosta de café? -> " + this.isGostaDeCafe() + "\n";
		return modelo;
	}
	
}
