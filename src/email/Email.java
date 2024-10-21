package email;

// uma classe herdando de outra classe
public class Email extends Pessoa {
	
	// atributo do email
    private String titulo;

    // aqui é o construtor
    public Email(String nome, String titulo) {
    	
        super(nome);
        this.titulo = titulo;
    }

    //  metodo enviarEmail para a classe email
    @Override
    public void enviarEmail(String mensagem) {
    	String saudacao = "Oi, tudo bem? " + (titulo != null && !titulo.isEmpty() ? titulo : "") + " " + getNome() + "!";
    	
        System.out.println(saudacao + "\n\n" + mensagem);
    }
}