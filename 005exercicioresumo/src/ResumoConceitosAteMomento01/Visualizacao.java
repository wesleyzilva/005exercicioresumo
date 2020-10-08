package ResumoConceitosAteMomento01;

public class Visualizacao {

	private Gafanhoto Gafanhoto;
	private Video filme;

	public Visualizacao(ResumoConceitosAteMomento01.Gafanhoto gafanhoto, Video filme) {
		super();
		Gafanhoto = gafanhoto;
		this.filme = filme;
		this.Gafanhoto.setTotAssistido(this.Gafanhoto.isTotAssistido() + 1);
		this.filme.setViews(this.filme.getViews() + 1);
	}

	public Gafanhoto getGafanhoto() {
		return Gafanhoto;
	}

	public void setGafanhoto(Gafanhoto gafanhoto) {
		Gafanhoto = gafanhoto;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "Visualizacao [Gafanhoto=" + Gafanhoto + ", filme=" + filme + "]";
	}

	//Sobrecarga de método avaliar
	public void avaliar() {
		this.filme.setAvaliacao(5);
	}

	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}

	public void avaliar(float porcentagem) {
		int Tot = 0;
		if (porcentagem <= 20) {
			Tot = 3;
		} else if (porcentagem <= 50) {
			Tot = 5;
		} else if (porcentagem <= 90) {
			Tot = 8;
		} else {
			Tot = 10;
		}
		this.filme.setAvaliacao(Tot);

	}

}
