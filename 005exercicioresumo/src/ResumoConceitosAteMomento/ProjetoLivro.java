package ResumoConceitosAteMomento;

public class ProjetoLivro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instanciando a classe Pessoa e Livro para criar um vetor de objetos para testes.
		Pessoa[] p = new Pessoa[3];
		Livro[] l = new Livro[4];

		// Instanciando a classe pessoa á um objeto novo
		/*
		 * Pessoa p[1] = new Pessoa("Wesley", 36, "M"); Pessoa p[2] = new
		 * Pessoa("Daiana", 39, "F"); Livro livro1 = new Livro(null, null, 0, pessoa1);
		 */

		p[0] = new Pessoa("WesleyG", 36, "M");
		p[1] = new Pessoa("DaianaF", 38, "F");
		p[2] = new Pessoa("FilhosHS", 00, "F");

		// Livro recebe como parametro a pessoa que está lendo.
		l[0] = new Livro("Dentes do cão", "Daiana Never Ganha", 10, p[0]);
		l[1] = new Livro("TI é foda", "Weslão", 99, p[0]);
		l[2] = new Livro("Ninguem gosta desse", "Dunha", 9999, p[0]);

		l[0].abrir();
		l[0].folhear(10);
		l[0].avancarPag();
		System.out.println(l[0].detalhes());
		System.out.println(l[1].detalhes());
	}

}
