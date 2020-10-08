package ResumoConceitosAteMomento01;

public class Gafanhoto extends Pessoa {
	private String login;
	private int totAssistido;

	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo, login);
		this.login = login;
		this.totAssistido = 0;
	}

	void viuMaisUm() {
		totAssistido++;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int isTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int i) {
		this.totAssistido = i;
	}

	@Override
	public String toString() {
		return "Gafanhoto " + super.toString() + "\nlogin=" + login + ", totAssistido=" + totAssistido + "]";
	}

}
