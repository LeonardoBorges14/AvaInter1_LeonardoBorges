package usuarioAvaInter1;

public class Usuario {
	
	private String login;
	private String senha;
	private String nome;
	private int categoria;
	
	public Usuario (String login, String senha, String nome, int categoria) {
		
		setLogin(login);
		setSenha(senha);
		setNome(nome);
		setCategoria(categoria);

	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
	public static String criptografaSenha(String senha) {
		
		int letra = 0;	
		String criptografia = "";
		char b;		

			for (int i = 0; i <= senha.length()-1; i++){	
				
				if (senha.charAt(i) == '@' || senha.charAt(i) == '$' ) {
					letra = senha.charAt(i);
				}
				else {
					letra = senha.charAt(i)+2;
					if (i == 0) {
						letra = senha.charAt(i) + 1;
					}
					if (i == senha.length() - 1) {
						letra = senha.charAt(i) + 3;
					}
				}

				b = (char)letra;
				criptografia += Character.toString(b);			
			}
			
		
		return criptografia;
	}

	public static String descriptografaSenha(String senha) {
		
		int letra = 0;	
		String descriptografia = "";
		char b;		

			for (int i = 0; i <= senha.length()-1; i++){	
				
				if (senha.charAt(i) == '@' || senha.charAt(i) == '$' ) {
					letra = senha.charAt(i);
				}
				else {
					letra = senha.charAt(i)-2;
					if (i == 0) {
						letra = senha.charAt(i) - 1;
					}
					if (i == senha.length() - 1) {
						letra = senha.charAt(i) - 3;
					}
				}

				b = (char)letra;
				descriptografia += Character.toString(b);			
			}
		
		
		return descriptografia;
	}
	

}
