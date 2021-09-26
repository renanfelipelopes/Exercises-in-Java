/*
 * Aluno: Renan Felipe Lopes Quentino (matricula: 297035)
 * Curso: CST em Análise e Desenvolvimento de Sistemas 
 * Polo: São Bernardo do Campo (Rudge Ramos)
 */
import javax.swing.JOptionPane;

public class Cliente {
    public int agencia;
    public String contaCorrente;
    public String cpf;
    public double saldo;
    
    public Cliente(int agencia, String contaCorrente, String cpf) {
        this.agencia = agencia;
        this.contaCorrente = contaCorrente;
        this.cpf = cpf;        
    }
    
     public Cliente(int agencia, String contaCorrente, String cpf, double saldo) {
       this(agencia, contaCorrente, cpf);
       this.saldo = saldo;        
    }
    
    public void sacarContaCorrente(double valor) {
        if (this.saldo > valor) this.saldo -= valor; 
        
        else JOptionPane.showMessageDialog(null, "Informação", "Saldo não disponivel", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public int informaAgencia(){
        return this.agencia;
    }
    
    @Override
    public String toString() {
        return "Agencia: " + String.valueOf(this.agencia) + 
                "\nConta Corrente: " + this.contaCorrente +
                "\nCPF: " + this.cpf + 
                "\nSaldo: R$ " + String.valueOf(this.saldo);
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Cliente) {
            Cliente c = (Cliente) o;
            return (c.agencia == this.agencia) && (c.contaCorrente.equals(this.contaCorrente)) &&
                    (c.cpf.equals(this.cpf));
        } else {
            return false;
        }
    }
    
}
