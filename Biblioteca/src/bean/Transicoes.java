package bean;

import java.util.Date;

public class Transicoes {
    
    private long id;
    private String usuario;
    private String livro;
    private Date entrada;
    private Date saida;
    private Double valor;

    public Transicoes(String usuario, String livro, Date entrada) {
        this.usuario = usuario;
        this.livro = livro;
        this.entrada = entrada;
    }

    public Transicoes(long id, String usuario, String livro, Date entrada, Date saida, Double valor) {
        this.id = id;
        this.usuario = usuario;
        this.livro = livro;
        this.entrada = entrada;
        this.saida = saida;
        this.valor = valor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }    
}
