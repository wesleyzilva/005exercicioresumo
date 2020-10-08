package ResumoConceitosAteMomento01;

public abstract class Pessoa {
	/*
	 * No diagrama de classes (+) é publico (#) é protegido (-) é privado
	 */

	protected String nome;
	protected int idade;
	protected String sexo;
	protected int experiencia;

	public Pessoa(String nome, int idade, String sexo, String login) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	void ganharExp() {
		this.experiencia++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", experiencia=" + experiencia + "]";
	}

}
