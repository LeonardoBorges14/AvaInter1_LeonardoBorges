package livroAvaInter1;

public class Livro {
	
	private int codigo;
	private String nome;
	private String editora;
	private String autor;
	private int ano;
	
	public Livro (int codigo, String nome, String editora, String autor, int ano) {
		
		setCodigo(codigo);
		setNome(nome);
		setEditora(editora);
		setAutor(autor);
		setAno(ano);

	}
	
	public String exibeBibliografia() {
		String ultimoNome = "";
		String nomes = "";
		String bibliografia = "";
		char letras[] = new char[autor.split(" ").length];
		
		bibliografia = autor.split(" ")[0] + ". " + nome + ". Ed. " + editora + ". " + ano + ".";
		
		for (int i = 0; i < autor.split(" ").length - 1; i++) {

			ultimoNome = autor.split(" ")[autor.split(" ").length - 1];
			letras[i] = autor.split(" ")[i].charAt(0);
			nomes += letras[i] + ". ";
			
			bibliografia = ultimoNome + " " + nomes + nome + ". Ed. " + editora + ". " + ano + ".";
		}

		
		return bibliografia;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	

}
