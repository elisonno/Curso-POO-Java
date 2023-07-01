package aula06;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.pause();
        this.setLigado(false);

    }

    @Override
    public void abrirMenu() {
        System.out.println("-------------------");
        System.out.printf("Está ligado? %s\n", (getLigado() ? "SIM" : "NÃO"));
        System.out.printf("Está tocando? %s\n", (getTocando() ? "SIM" : "NÃO"));
        System.out.print("Volume: " + this.getVolume());
        for (int i = 10; i <= this.getVolume(); i += 10) {
            System.out.print(" []");
        }
    System.out.println();
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (getLigado() && getVolume() < 100) {
            setVolume(getVolume() + 1);
        }
    }

    @Override
    public void menosVolume() {
        if (getLigado() && getVolume() == 0) {
            setVolume(getVolume() - 1);
        }
    }

    @Override
    public void ligarMudo() {
        if (getLigado() && getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (getLigado() && getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (getLigado() && !getTocando()) {
            setTocando(true);
        }

    }

    @Override
    public void pause() {
        if (getLigado() && getTocando()) {
            setTocando(false);
        }
    }
}
