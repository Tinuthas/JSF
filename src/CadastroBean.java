import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CadastroBean {
	private List<String> listaSelecionados;
	private List<String> listaSelecionados2;

	public void cadastrar() {
		for (String i : listaSelecionados) {
			System.out.println(i);
		}
		for (String u : listaSelecionados2) {
			System.out.println(u);
			System.out.println("---");
		}
	}
	
	

	public List<Usuario> getUsuarios() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(new Usuario(1, "John Wick"));
		usuarios.add(new Usuario(2, "Eric Sonny"));
		usuarios.add(new Usuario(3, "Sadia Perdigao"));
		return usuarios;
	}

	public CadastroBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CadastroBean(List<String> listaSelecionados) {
		super();
		this.listaSelecionados = listaSelecionados;
	}

	public List<String> getListaSelecionados2() {
		return listaSelecionados2;
	}

	public void setListaSelecionados2(List<String> listaSelecionados2) {
		this.listaSelecionados2 = listaSelecionados2;
	}

	public List<String> getListaSelecionados() {
		return listaSelecionados;
	}

	public void setListaSelecionados(List<String> listaSelecionados) {
		this.listaSelecionados = listaSelecionados;
	}

}
