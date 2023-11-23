package banco;

class contaBancaria {
    private double saldo;

    public contaBancaria(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double deposito){
        this.saldo += deposito;
    }
}