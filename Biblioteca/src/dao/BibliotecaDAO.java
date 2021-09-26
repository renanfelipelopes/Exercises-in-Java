package dao;

import bean.Transicoes;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BibliotecaDAO {
    
    public Connection conectar() {
        
        Connection conn = null;
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
            System.out.println("Conectou");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return conn;
    }
    
    
    public void desconectar(Connection conn) {
        try {
            if (conn != null) conn.close(); 
            System.out.println("Desconectou");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public Transicoes salvar(Transicoes lib){
        Connection conn = this.conectar();
        try{
            
            long id = 0L;
            String consultarID = "select biblioteca_seq.nextval as id from dual";
            PreparedStatement consulta = conn.prepareStatement(consultarID);
            ResultSet rs = consulta.executeQuery();
            if (rs.next()) id = rs.getLong("id");
                        
            String inserir = "insert into biblioteca (id, usuario, livro, entrada)"
                    + "values (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(inserir);
            stmt.setLong(1, id);
            stmt.setString(2, lib.getUsuario());
            stmt.setString(3, lib.getLivro());
            stmt.setDate(4, new Date(lib.getEntrada().getTime()));
            stmt.execute();
            
            lib.setId(id);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            desconectar(conn);
        }
        
        return lib;
    }
    
    public void atualizar(Transicoes lib) {
        Connection conn = conectar();
        
        try{            
            String atualizar = "update biblioteca set saida = ?, valor = ?" 
                    + "where id = ?";
            
            PreparedStatement stmt = conn.prepareCall(atualizar);
            stmt.setDate(1,new Date(lib.getSaida().getTime()));
            stmt.setDouble(2, lib.getValor());
            stmt.setLong(3, lib.getId());
            stmt.executeUpdate();
            
        } catch(SQLException ex) {
            ex.printStackTrace();
        } finally {
            desconectar(conn);
        }
    }
        
    public List<Transicoes> consultarTodos() {
        List<Transicoes> transic = new ArrayList<>();
        Connection conn = conectar();
        try {
            String consulta = "select * from biblioteca where saida is null order by entrada";
            PreparedStatement stmt = conn.prepareStatement(consulta);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                Date saida = rs.getDate("saida");
                transic.add(new Transicoes(
                        rs.getLong("id"),
                        rs.getString("usuario"),
                        rs.getString("livro"),
                        new java.util.Date(rs.getDate("entrada").getTime()),
                        saida != null ? new java.util.Date(saida.getTime()) : null,
                        rs.getDouble("valor") 
                ));
            }
                        
        } catch(SQLException ex) {
            ex.printStackTrace();
        } finally {
            desconectar(conn);
        }
        
        return transic;
    }
    
}
