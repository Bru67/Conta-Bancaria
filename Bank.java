import java.util.*;

public class Bank {
    Client cliente;

    //      public void criarCodico(){}
    //    public void Login(String name, int password){
//
//    }
    public static void cadastrar(String name, String surname, String email, String password){
        Scanner sc = new Scanner(System.in);

        System.out.println(
                "         BEM-VINDO!\n" +
                        "Ficamos felizes de ter você conosco!\n" +
                        "Para começarmos, por favor\n" +
                        "INSIRA SEU NOME: ");

        name = sc.nextLine();
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("INSIRA SEU SOBRENOME: " );
        surname = sc.nextLine();
        surname = surname.substring(0,1).toUpperCase() + surname.substring(1).toLowerCase();
        System.out.println("INSIRA O SEU EMAIL PARA CONTATO: ");
        email = sc.nextLine();
        System.out.println("AGORA DIGITE SUA SENHA: ");
        password = sc.nextLine();

        Client client = new Client(name, surname, email, password);


        System.out.println("Confirme seus dados:\n " +
                "Nome: " + client.getName() + " " + client.getSurname() + "\n"+
                "E-mail: " + client.getEmail());
        String ok = sc.nextLine();
        if (ok == "ok"){

        }
        System.out.println("Cadastro realizado com sucesso!");
//        Account conta = new Account;
        String [] clientes = new String [4];
        clientes[0] = client.getName();
        clientes[1] = client.getSurname();
        clientes[2] = client.getEmail();
        clientes[3] = client.getPassword();
        System.out.println(clientes);

    }




}
