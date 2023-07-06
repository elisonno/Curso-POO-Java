package projeto_youtube;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews()+1);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porcentagem) {
        int nota = 0;
        if(porcentagem == 100){
            nota = 10;
        }else if(porcentagem >=90.0){
            nota = 9;
        }else if(porcentagem >= 80.0) {
            nota = 8;
        }else if(porcentagem >= 70.0) {
            nota = 7;
        }else if(porcentagem >= 60.0) {
            nota = 6;
        }else if(porcentagem >= 50.0) {
            nota = 5;
        }else if(porcentagem >= 40.0) {
            nota = 4;
        }else if(porcentagem >= 30.0) {
            nota = 3;
        }else if(porcentagem >= 20.0) {
            nota = 2;
        }else if(porcentagem >= 10.0) {
            nota = 1;
        }

        this.filme.setAvaliacao(nota);
    }

    @Override
    public String toString() {
        return "######-Visualizacao-######" + "\n" +
                this.getEspectador() +
                this.getFilme() +
                "######-----######\n";
    }
}
