package controle;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "controlePrincipal")
@SessionScoped
public class ControlePrincipal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mensagem;

	public ControlePrincipal() {
		mensagem = "Bem vindo!";
	}
	
	
	public String Sobre(){
		mensagem = "Você foi redirecionado de maneira dinamica.";
		
		return "sobre";// redireciona pelo post
	}
	
	public String SobreRedirecionado(){
		mensagem = "Redirecionado";
		return "sobre?faces-redirect=true";//redireciona sem ser pelo post
	}
	
	
	public String geraErro(){
		return "error";
	}
	
	public String geraErroGrave(){
		return "error";
	}
	
	public String gerarLogin(){
		return "login";
	}
	
	
	
	
	//GET/SET
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
