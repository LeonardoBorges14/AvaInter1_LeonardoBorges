package avaInter1_LeonardoBorges;

import java.util.Scanner;
import livroAvaInter1.Livro;
import usuarioAvaInter1.Usuario;

public class AppAvaInter1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String login, senha, nome;
		int categoria;
		
		int cont1 = 0;
		do {
		System.out.print("Digite o Login: ");
		if(cont1 != 0) {
			sc.nextLine();
		}
		login = sc.nextLine();
		System.out.print("Digite a Senha: ");
		senha = sc.nextLine();
		System.out.print("Digite seu Nome: ");
	    nome = sc.nextLine();
		System.out.print("Digite a Categoria: ");
		categoria = sc.nextInt();
		System.out.println("");
		Validacao.validaLogin(login);
		Validacao.validaSenha(senha);

		if (Validacao.validaLogin(login) == false) {
			System.out.println("Login Inválido! Tente Novamente. (O Login deve conter apenas uma palavra entre 5 e 20 caracteres e sem os caracteres @ e $))");
			System.out.println("");
			cont1 = 1;
		}
		
		if (Validacao.validaSenha(senha) == false) {
			System.out.println("Senha Inválida! Tente Novamente. (A Senha deve conter entre 8 e 15 caracteres e possuir os caracteres @ ou $))");
			System.out.println("");
			cont1 = 1;
		}
		}while(Validacao.validaLogin(login) == false || Validacao.validaSenha(senha) == false);
		
		String criptografia = Usuario.criptografaSenha(senha);
		
		Usuario usuario = new Usuario(login, criptografia, nome, categoria);
		String descriptografia;
		int cont2 = 0;
		
		do {
			
			System.out.println("AUTENTICAÇÃO DE SENHA:");
			System.out.println("");
			System.out.print("Digite o Login: ");
			if (cont2 == 0)sc.nextLine();
			login = sc.nextLine();
			System.out.print("Digite a Senha: ");
			senha = sc.nextLine();
			System.out.println("");
		
	    descriptografia = Usuario.descriptografaSenha(criptografia);
	    
		if (senha.equals(descriptografia) == false) {
			System.out.println("Tentativa Inválida, A senha informada é diferente da senha cadastrada");
			System.out.println("");
			cont2 = 1;
		}

		}while(senha.equals(descriptografia) == false);
		
		System.out.println("CADASTRO DO LIVRO:");
		System.out.println("");
		System.out.print("Digite o Código do livro: ");
		int codigo = sc.nextInt();
		
		System.out.print("Digite o Nome do livro: ");
		sc.nextLine();
		String nomeLivro = sc.nextLine();
		
		System.out.print("Digite a Editora do livro: ");
	    String editora = sc.nextLine();
	    
		System.out.print("Digite o(a) Autor(a) do livro: ");
		String autor = sc.nextLine();
		
		System.out.print("Digite o Ano do livro: ");
		int ano = sc.nextInt();
		System.out.println("");
		
		
		Livro livro = new Livro(codigo, nomeLivro, editora, autor, ano);
		
		System.out.println("BIBLIOGRAFIA:");
		System.out.println("");
		System.out.println(livro.exibeBibliografia());
		sc.close();
	}

}
