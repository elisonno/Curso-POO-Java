package projeto_youtube;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de Java");
        v[2] = new Video("Aula 10 de PHP");

        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("João",18,"M","joaozinho");
        g[1] = new Gafanhoto("Maria", 17,"F","mariazinha");

        Visualizacao[] vis = new Visualizacao[5];
        vis[0]=new Visualizacao(g[0],v[2]);
        vis[0].avaliar();
        System.out.println(vis[0]);
        vis[1]=new Visualizacao(g[1],v[2]);
        vis[1].avaliar(90.4f);
        System.out.println(vis[1]);
        vis[2]=new Visualizacao(g[0],v[1]);
        vis[2].avaliar(7);
        System.out.println(vis[2]);
    }
}
