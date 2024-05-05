public class PessoaFisica extends Cliente {
    private char sexo;
    private String cpf;
    private int idade;
    public char getSexo(){return sexo;}
    public void setSexo(char sexo){this.sexo = sexo;}
   
    public int getIdade(){return idade;}
    public void setIdade(int idade){this.idade = idade;}
    public String getCpf() {return cpf;}

    public PessoaFisica(String nome , String cpf , int idade , String Endereco , char sexo)
    {
        setNome(nome);
        this.cpf = cpf;
        this.idade = idade;
        setEndereco(Endereco);
        this.sexo = sexo;
    }
    public void imprimir() {
        System.out.println("===== Nome " + getNome() + " =====");
        System.out.println("Cpf: " + this.cpf);
        System.out.println("idade: " + this.idade);
        System.out.println("Endereco: " + getEndereco());
        System.out.println("Sexo: " + this.sexo);
        System.out.println("====================");
    }
    } 






