package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(String dono, int numConta) {
        this.numConta = numConta;
        this.dono = dono;
    }

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abriConta(String tipo) {
        if(!getStatus()) {
            this.setTipo(tipo);
            setStatus(true);
            if (tipo.equals("CC")) {
                this.setSaldo(50);
            } else {
                this.setSaldo(150);
            }
            System.out.println(getDono()+ ": Conta aberta com sucesso");
        }
    }

     public void fecharConta() {
        if (getSaldo() == 0) {
            this.setStatus(false);
            System.out.println(this.getDono() + ": Conta encerrada com sucesso");
        } else {
            System.out.print("Impossível sacar: ");
            System.out.printf("%s\n", getSaldo() > 0 ? "Conta com dinheiro" : "Conta com débito");
        }
    }

    public void depositar(float deposito) {
        if (getStatus()) {
            this.setSaldo(getSaldo() + deposito);
            System.out.println("Depósito realizado com sucesso na conta de: " + getDono());
        } else System.out.println("Impossível depositar em uma conta fechada");
    }

    public void sacar(float saque) {
        if (getStatus()) {
            if (getSaldo() >= saque) {
                this.setSaldo(getSaldo() - saque);
                System.out.println("Saque realizado com sucesso na conta de: " + getDono());
            }else System.out.println("Impossível sacar, saldo insuficiente");
        } else System.out.println("Impossível sacar, conta fechada");
    }

    public void pagarMensalidade() {
        if (getStatus()) {
            if (getTipo().equals("CC")) {
                this.sacar(20);
            } else if (getTipo().equals("CP")){
                this.sacar(10);
            }
        } else System.out.println("Impossível pagar mensalidade, conta fechada");
    }

    public void estadoAtual (){
        System.out.printf("\n--------------------------------"+
                           "\nConta: " + this.getNumConta() +
                           "\nTipo: " + this.getTipo() +
                           "\nDono: " + this.getDono() +
                           "\nSaldo: " + this.getSaldo() +
                           "\nStatus: %s", this.getStatus()?"Aberta":"Fechada");
    }
}
