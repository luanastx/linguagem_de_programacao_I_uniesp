
public class Login {

	private String Name;
	private String Login;
	private String Senha;

	public void authentic(String login, String senha) {

		if (this.Login.contentEquals(login) && this.Senha.contentEquals(senha)) {

			System.out.println("autenticado");
		} else {
			System.out.println("não autenticado");
		}
	}

	public void setMeuLogin(String Name, String Login, String Senha) {
		this.Name = Name;
		this.Login = Login;
		this.Senha = Senha;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

}
