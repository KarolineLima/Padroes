
public class Mulher extends Usuario {

	
	public Mulher(String nome) {
		super(nome);
	}
	
	
	
	public String saudacoes() {
		return "Bem-vinda Srª."+this.nome;
	}
	
}
