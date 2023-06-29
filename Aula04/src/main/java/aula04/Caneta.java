package aula04;

public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String m, String c, float p) {
        this.tampar();
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.setCor("Azul");
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean getTampada() {
        return this.tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void tampar (){
        this.tampada = true;
    }

    public void destampar (){
        this.tampada = false;
    }

    public void status (){
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada: " + this.getTampada());
    }
}
