import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println(
                    "-_-_-_-_-MENU_INICIAL-_-_-_-_-_-\n" +
                            "     BEM-VINDO AO BANCO Flo!\n" +
                            "-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n" +
                            "          1- Entrar:\n" +
                            "         2- Cadastrar:\n" +
                            "-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
            int i = 0;
            while (i < 3) {
                int user = sc.nextInt();
                switch (user) {
                    case 1:
                        System.out.println("Você está sendo endereçado para a área de Login");

                        break;

                    case 2:
                        System.out.println("Você está sendo endereçado para a área de Cadastro\n");
                        Bank.cadastrar("", "", "", "");
                        break;

                    default:
                        System.out.println("ERROR! TRY AGAIN!\n");
                        i++;
                }
                while (true) {
                    System.out.println("-_-_-_-_-MENU_DE_OPÇÕES-_-_-_-_-_-\n" +
                            "1 - Saque\n" +
                            "2 - Depósito\n" +
                            "3 - Extrato\n" +
                            "4 - Alterar informações cadastrais\n" +
                            "5 - Sair"
                    );
                    String menu = sc.nextLine();
                    switch (menu){
                        case "1":
                            Account.sacar();
                            break;
                        case "2":
                            Account.depositar();
                            break;
                        case "3":
                            Account.extrato();
                            break;
                        case "4":
                            Account.alterar();
                            break;
                        case "5":
                            System.out.println("Obrigada pela visita!\n Volte sempre!");
                            break;
                            break;
                        default:
                            System.out.println("Opção inválida\n");
                    }

                }


            }
        }
    }
}
// teste pra ver se consigo commita isso aq
