package br.com.fiap.persistencia.scj16.martins.robson;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Chave Composta (Embeddable) de {@link Emprestimo}
 * @author FIAP/16SCJ - Robson Martins (RM:42055)
 */
@SuppressWarnings("serial")
@Embeddable
public class EmprestimoID implements Serializable {

	@ManyToOne(cascade={CascadeType.REFRESH, CascadeType.PERSIST,
						CascadeType.MERGE}, fetch=FetchType.EAGER)
    @JoinColumn(name="idUsuario")
    private Usuario usuario;

	@ManyToOne(cascade={CascadeType.REFRESH, CascadeType.PERSIST,
						CascadeType.MERGE}, fetch=FetchType.EAGER)
    @JoinColumn(name="isbnLivro")
	private Livro livro;
	
	public EmprestimoID() { }
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Livro getLivro() {
		return livro;
	}
	
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	@Override
    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
