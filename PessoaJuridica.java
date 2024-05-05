public class PessoaJuridica extends Cliente {
    private String Cnpj;
    private int NumFuncionarios;
    private String Setor;

    public String getcnpj(){return Cnpj;}
    
    public int getNumFuncionarios(){return NumFuncionarios;}
    public int setNumFuncionarios(int numFuncionarios){this.NumFuncionarios = numFuncionarios ;return this.NumFuncionarios;}
    public String getSetor(){return Setor;}
    public String setSetor(String Setor){this.Setor = Setor ; return this.Setor;}

    public PessoaJuridica(String nome , String cnpj , int NumFuncionarios , String Setor , String Endereco )
    {
        setNome(nome);
        this.Cnpj = cnpj;
        this.NumFuncionarios = NumFuncionarios;
        this.Setor = Setor;
        setEndereco(Endereco);
    }

    public void imprimir()
    {
        System.out.println("===== Nome " + getNome() + " =====");
        System.out.println("Endereco: " + getEndereco());
        System.out.println("====================");
        System.out.println("Cnpj:"+this.Cnpj);
        System.out.println("Setor:"+this.Setor);
        System.out.println("Numero de funcionarios:"+this.NumFuncionarios);
        System.out.println("======================");
    }

}
