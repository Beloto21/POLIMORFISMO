package email;

//  Main para teste

public class Main {
    public static void main(String[] args) {
    	
        // fazendo a instancia do email
        Email email = new Email("Nicolas Beloto", "Aluno");

        // mensagem que sera enviada
        email.enviarEmail("Eu ja terminei minha liçao, da uma nota boa pfv, hehehe");
    }
}