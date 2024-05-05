public class Cliente {

    private String nome;
    private String endereco;

    public void setNome(String nome){this.nome = nome;}
    public void setEndereco(String endereco){this.endereco = endereco;}

    public String getNome() {return nome;}
    public String getEndereco(){return endereco;}
   
    public void imprimir() {
        System.out.println("===== Nome " + getNome() + " =====");
        System.out.println("Endereco: " + getEndereco());
        System.out.println("====================");
    }

    
   


    public static void valida_cpf_cnpj() {

        String cpf = "111.111.111-11";
        boolean cpfValido = true;

        // Remove caracteres não numéricos
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verifica se o CPF tem 11 dígitos
        if (cpf.length() != 11)
            cpfValido = false;

        // Verifica se todos os dígitos são iguais
        boolean allDigitsEqual = true;
        for (int i = 1; i < cpf.length(); i++) {
            if (cpf.charAt(i) != cpf.charAt(0)) {
                allDigitsEqual = false;
                break;
            }
        }
        if (allDigitsEqual)
            cpfValido = false;

        // Calcula o primeiro dígito verificador
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += (cpf.charAt(i) - '0') * (10 - i);
        }
        int digit1 = 11 - (sum % 11);
        if (digit1 > 9)
            digit1 = 0;

        // Verifica o primeiro dígito verificador
        if ((cpf.charAt(9) - '0') != digit1)
            cpfValido = false;

        // Calcula o segundo dígito verificador
        sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += (cpf.charAt(i) - '0') * (11 - i);
        }
        int digit2 = 11 - (sum % 11);
        if (digit2 > 9)
            digit2 = 0;

        // Verifica o segundo dígito verificador
        if ((cpf.charAt(10) - '0') != digit2)
            cpfValido = false;

        if (cpfValido)
            System.out.println("CPF Válido");
        else
            System.out.println("CPF Inválido");

    }
}