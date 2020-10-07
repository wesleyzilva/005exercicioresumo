package ResumoConceitosAteMomento01;

public class Gafanhoto extends Pessoa {

	private String login;
	private int totAssistido;
	private int assistido;

	public Gafanhoto(boolean totAssistido, int assistido) {
		super();
		this.totAssistido = 0;
		this.assistido = 0;
	}

	void viuMaisUm() {
		assistido++;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public boolean isTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(boolean totAssistido) {
		this.totAssistido = totAssistido;
	}

	public int getAssistido() {
		return assistido;
	}

	public void setAssistido(int assistido) {
		this.assistido = assistido;
	}
}
