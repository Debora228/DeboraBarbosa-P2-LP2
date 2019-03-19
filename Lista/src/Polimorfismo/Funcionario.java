package Polimorfismo;

public class Funcionario {
	private String nome;
	private int cpf;
	private String email;
	private int registroUnico;
	private int dataNascimento;
	private String funcao;
	private String senha;
	
	public boolean realizarLogin(String email, String senha) {
		return true;
	}
	
	public boolean realizarLogin(int registroUnico, String senha) {
		return true;
	}

	
	public Funcionario(String nome, int cpf, String email, int registroUnico, int dataNascimento, String funcao,
			String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.registroUnico = registroUnico;
		this.dataNascimento = dataNascimento;
		this.funcao = funcao;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRegistroUnico() {
		return registroUnico;
	}

	public void setRegistroUnico(int registroUnico) {
		this.registroUnico = registroUnico;
	}

	public int getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha, int cpf) {
		if(cpf == this.cpf) {
			this.senha = senha;
		}
	}
	
	
	
}
