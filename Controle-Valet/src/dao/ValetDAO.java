package dao;

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
import modelo.Valet;

public class ValetDAO {
    
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
    public Valet salvar(Valet v){
        Connection conn = this.conectar();
        try{
            
            long id = 0L;
            String consultarID = "select valet_seq.nextval as id from dual";
            PreparedStatement consulta = conn.prepareStatement(consultarID);
            ResultSet rs = consulta.executeQuery();
            if (rs.next()) id = rs.getLong("id");
                        
            String inserir = "insert into valet (id, modelo, placa, entrada)"
                    + "values (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(inserir);
            stmt.setLong(1, id);
            stmt.setString(2, v.getModelo());
            stmt.setString(3, v.getPlaca());
            stmt.setDate(4, new Date(v.getEntrada().getTime()));
            stmt.execute();
            
            v.setId(id);
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            desconectar(conn);
        }
        
        return v;
    }
    
    public void atualizar(Valet v) {
        Connection conn = conectar();
        
        try{            
            String atualizar = "update valet set saida = ?, preco = ?" 
                    + "where id = ?";
            
            PreparedStatement stmt = conn.prepareCall(atualizar);
            stmt.setDate(1,new Date(v.getSaida().getTime()));
            stmt.setDouble(2, v.getPreco());
            stmt.setLong(3, v.getId());
            stmt.executeUpdate();
            
        } catch(SQLException ex) {
            ex.printStackTrace();
        } finally {
            desconectar(conn);
        }
    }
        
    public List<Valet> consultarTodos() {
        List<Valet> valets = new ArrayList<>();
        Connection conn = conectar();
        try {
            String consulta = "select * from valet where saida is null order by entrada";
            PreparedStatement stmt = conn.prepareStatement(consulta);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                Date saida = rs.getDate("saida");
                valets.add(new Valet(
                        rs.getLong("id"),
                        rs.getString("modelo"),
                        rs.getString("placa"),
                        new java.util.Date(rs.getDate("entrada").getTime()),
                        saida != null ? new java.util.Date(saida.getTime()) : null,
                        rs.getDouble("preco") 
                ));
            }
                        
        } catch(SQLException ex) {
            ex.printStackTrace();
        } finally {
            desconectar(conn);
        }
        
        return valets;
    }
}
