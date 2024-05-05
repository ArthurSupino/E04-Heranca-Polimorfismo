import java.util.Arrays;

public class Conta {

    private int numero;

    private Cliente dono;

    private double saldo;

    private double limite;

    private OperacaoSaque[] operacoesSaque;

    private OperacaoDeposito[] operacoesDeposito;

    private int proximaOperacao;

    private static int totalContas = 0;

     public Conta(int numero, Cliente dono, double saldo, double limite) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
        this.limite = limite;

        this.operacoesSaque = new OperacaoSaque[10];
        this.operacoesDeposito = new OperacaoDeposito[10];
        this.proximaOperacao = 0;

        Conta.totalContas++;
    }

    private  void redimensionarOperacoesD(){
        operacoesDeposito = (operacoesDeposito.length==proximaOperacao)? Arrays.copyOf(operacoesDeposito, operacoesDeposito.length*2):operacoesDeposito;
    }
    private  void redimensionarOperacoesS(){
        operacoesSaque = (operacoesSaque.length==proximaOperacao)? Arrays.copyOf(operacoesSaque, operacoesSaque.length*2):operacoesSaque;
    }


    public boolean sacar(double valorS) {
    
        if (valorS >= 0 && valorS <= this.limite) {
            this.saldo -= valorS;

            this.operacoesSaque[proximaOperacao] = new OperacaoSaque('s', valorS);
            this.proximaOperacao++;
            redimensionarOperacoesS();
            return true;
        }

        return false;
        
    }

    public void depositar(double valorD) {
        this.saldo += valorD;

        this.operacoesDeposito[proximaOperacao] = new OperacaoDeposito('d' , valorD);
        this.proximaOperacao++;
        redimensionarOperacoesD();
        
    }

    public boolean transferir(Conta destino, double valor) {
        boolean valorSacado = this.sacar(valor);
        if (valorSacado) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public void imprimir() {
        System.out.println("===== Conta " + this.numero + " =====");
        System.out.println("Dono: " + this.dono.getNome());
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);
        System.out.println("====================");
    }

    public void imprimirExtrato() {
        System.out.println("======= Extrato Conta " + this.numero + "======");
        for(OperacaoSaque atualS : this.operacoesSaque) {
            for(OperacaoDeposito atualD : this.operacoesDeposito){
                if (atualD != null || atualS != null ) {
                    atualD.imprimir();
                    atualS.imprimir();
                }
            }
        }
        System.out.println("====================");
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getDono() {
        return dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public static int getTotalContas() {
        return Conta.totalContas;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public void setLimite(double limite) {
        if (limite < 0)
            limite = 0;

        this.limite = limite;
    }
}

