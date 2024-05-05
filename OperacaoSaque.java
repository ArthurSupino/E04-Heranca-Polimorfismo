

public class OperacaoSaque extends Operacao {
    private double valor;
    private char tipo;
    private int total_saques;

    public int getTotal_saques() {
        return total_saques;
    }
    public void setTotal_saques(int total_saques) {
        this.total_saques = total_saques;
    }
    public char getTipo() {
        return tipo;
    }
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public OperacaoSaque(char tipo , double valor_recebido)
    {
        this.tipo = tipo;
        this.valor = valor_recebido;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    }
    

    


