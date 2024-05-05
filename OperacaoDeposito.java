

public class OperacaoDeposito extends Operacao {
    private char tipo;
    private double valor;
    private int total_depositos;

    public int getTotal_depositos() {
        return total_depositos;
    }

    public void setTotal_depositos(int total_depositos) {
        this.total_depositos = total_depositos;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
   
    public OperacaoDeposito(char tipo , double valorRecebido)
    {
        this.valor = valorRecebido;
        

    }

    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }

}
