package avaInter1_LeonardoBorges;

public class Validacao {
	
	public static boolean validaLogin(String login) {
		if (login.length() >= 5 && login.length() <= 20 && login.contains("@") == false && login.contains("$") == false && login.contains(" ") == false) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean validaSenha(String senha) {
		if (senha.length() >= 8 && senha.length() <= 15 && (senha.contains("@") == true || senha.contains("$") == true)) {
			return true;
		}
		else {
			return false;
		}
	}

}
