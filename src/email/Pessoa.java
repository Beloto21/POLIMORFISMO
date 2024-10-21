package email;

// fazendo a classe 
public class Pessoa {
	
	// atributo pra classe 
    private String nome;

    // metodo construtor da classe 
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // metodo getter pro nome
    public String getNome() {
        return nome;
    }

    // metodo para que seja sobrescrito nas subclasses
    public void enviarEmail(String mensagem) {
    
    }
}