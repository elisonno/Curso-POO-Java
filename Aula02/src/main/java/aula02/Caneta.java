package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void rabiscar(){
        if (!this.tampada && this.carga > 0){
            System.out.println("Rabiscando\n");
            this.tirarCarga();
        }else {
            if(this.tampada){

                System.out.println("Não é possível rabiscar com a caneta tampada\n");
        }   else{
                System.out.println("Não é possível rabiscar com a caneta sem carga\n");
        }
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
    void status(){
        String carga = this.carga == 0 ? "Vazia" : Integer.toString(this.carga) + "%";
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + carga);
        System.out.println("Está tampada? " + (this.tampada? "Sim\n":"Não\n"));

    }
    void tirarCarga(){
        this.carga = this.carga == 0 ? 0: (this.carga - 25);
    }

}
