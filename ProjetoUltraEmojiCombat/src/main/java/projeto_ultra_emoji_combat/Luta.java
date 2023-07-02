package projeto_ultra_emoji_combat;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar() {
        System.out.println("______________________________");
        if (this.getAprovada()) {
            System.out.println("###_Desafiado_###");
            this.desafiado.apresentar();
            System.out.println("###_Desafiante_###");
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("EMPATE");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.println(this.getDesafiado().getNome() + " WINNER");
                    this.desafiado.gannharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(this.getDesafiante().getNome() + " WINNER");
                    this.desafiante.gannharLuta();
                    this.desafiado.perderLuta();
                    break;
            }

        } else {
            System.out.println("Luta não pode acontecer");
        }
        System.out.println("______________________________");
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
