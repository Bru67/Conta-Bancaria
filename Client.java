public class Client {
    private String name; //UPPERCASE(tudo maiusculo)
    private String surname;
    private String email;
    private String password;
    //data de nascimento, telefone, cpf(request),

    public Client(String name, String surname, String email, String password){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public String getName(){
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public  String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }


}
