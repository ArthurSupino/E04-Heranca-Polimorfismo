public class Main {
    public static void main(String[] args) 
    {
        PessoaFisica joao = new PessoaFisica("Joao","111.111.111-01",30,"Av Pedro 2 - 24",'m');


        if(joao == null) {
            System.out.println("Cliente não foi criado");

        } else {
            System.out.println("Cliente criado com sucesso!");
            Conta conta1 = new Conta(1234, joao, 0, 1500);
            Conta conta2 = new Conta(12121, joao, 10000, 1500);

            conta1.depositar(3000);
            conta1.depositar(2000);
            conta1.sacar(500);
            conta1.depositar(3000);
            conta1.depositar(2023);
            conta1.sacar(123);
            conta1.depositar(3000);
            conta1.depositar(2000);
            conta1.sacar(500);

            conta2.transferir(conta1, 666);
            conta2.depositar(234);

            conta1.imprimirExtrato();
            conta2.imprimirExtrato();

           
        }
    }
}