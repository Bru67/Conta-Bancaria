import java.util.Scanner;

public class Account {
    private static double saldo;

    public void setSaldo(double saldo){
        Account.saldo = saldo;

    }
    public double getSaldo(){
        return saldo;
    }

    public Account(double saldo){
        setSaldo(0.0d);
    }


    public void sacar() {
        Scanner sc = new Scanner(System.in);
//        sacar(saldo);
        System.out.println("Qual é o valor que você gostaria de sacar?");
        float valor = sc.nextFloat();
        if (getSaldo() > 0) {
            System.out.println("Não foi possível realizar este saque!\n" +
                    "Saldo insuficiente!");
        } else if (valor > getSaldo()) {
            System.out.println("Não foi possível realizar este saque!\n" +
                    "Saldo insuficiente!");
        } else {
            setSaldo(saldo -= valor);
            System.out.println("Saque feito com sucesso! \n" +
                    "Seu saldo atual é de " + saldo);
        }
    }

    public void extrato() {
        System.out.println("Seu saldo atual é " + saldo);

    }

    public void depositar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor que você deseja depositar: ");
        int valor = sc.nextInt();
        saldo += valor;
        System.out.println("Parabéns!\nSeu saldo foi atualizado com suceeso!\n" +
                "Seu novo Saldo é de: " + getSaldo());


    }
    public void alterar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual informação você gostaria de alterar: \n" +
                "1 - Email");
        int alteracao = sc.nextInt();
        sc.nextLine();
        switch (alteracao){
            case 1:
                System.out.println("Digite seu novo endereço de E-mail: ");
//                Client.client.setEmail(sc.nextLine());
                break;
            default:
                System.out.println("ERROR!");
        }
    }


}
