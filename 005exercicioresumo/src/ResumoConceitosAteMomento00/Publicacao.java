package ResumoConceitosAteMomento00;

public interface Publicacao {

	void abrir();

	void fechar();

	// Metodo com parametro precisa de uma ASSINATURA com atributo
	void folhear(int p);

	void avancarPag();

	void voltarPag();

	String detalhes();

}
