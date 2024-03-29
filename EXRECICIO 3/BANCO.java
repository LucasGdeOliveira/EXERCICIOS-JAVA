public class Dados {
    int agencia;
    int conta;
    String nome;
    float saldo;

    public Dados(int agencia, int conta, String nome){
        this.agencia = agencia;
        this.conta = conta;
        this.nome = nome;
        float saldo = 0;
    }
    public void depositar(float valor){
        if(valor>0){
            saldo += valor;
            System.out.println("Deposito de R$ " + valor + " Realizado com sucesso");
        }
        else{
            System.out.println("O valor depositado deve ser maior que R$0.00");
        }
    }
    public void saque(float valor){
        if(valor>0){
             if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            } 
            else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        } 
        else {
            System.out.println("O valor do saque deve ser maior que zero.");
        }
        }
        public float consultarSaldo() {
            return saldo;
        }
        public void informacoes() {
            System.out.println("Número da Conta: " + conta);
            System.out.println("Nome do Titular: " + nome);
            System.out.println("Saldo Atual: R$" + saldo);
            System.out.println("\n");
        }
}
