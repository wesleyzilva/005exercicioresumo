package ResumoConceitosAteMomento01;

public class Youtube {
	public static void main(String[] args) {

		Video video[] = new Video[2];
		video[0] = new Video("Java");
		video[1] = new Video("Python");

		Gafanhoto gafanhoto[] = new Gafanhoto[2];
		gafanhoto[0] = new Gafanhoto("Samuel", 5, "M", "zilvaSamuel");
		gafanhoto[1] = new Gafanhoto("Heitor", 7, "M", "heitorZilva");

		Visualizacao vis[] = new Visualizacao[5];
		vis[0] = new Visualizacao(gafanhoto[0], video[0]);
		vis[1] = new Visualizacao(gafanhoto[0], video[1]);
		vis[2] = new Visualizacao(gafanhoto[1], video[0]);
		video[0].setReproduzindo(false);
		video[1].setReproduzindo(true);
		vis[0].avaliar();
		vis[1].avaliar(95f);
		vis[2].avaliar(1);
		System.out.println(gafanhoto[0].toString());
		System.out.println(gafanhoto[1].toString());
		// Agregação: Instancias de outras classes
		System.out.println("");
		System.out.println(vis[0].toString());
		System.out.println("");
		System.out.println(vis[1].toString());
		System.out.println("");
		System.out.println(vis[2].toString());

	}
}
