package negocio;

import bean.Transicoes;
import dao.BibliotecaDAO;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloBiblioteca extends AbstractTableModel {
    
    private List<Transicoes> transic = new ArrayList<>();
    private final DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    private final BibliotecaDAO dao = new BibliotecaDAO();

    public ModeloBiblioteca() {
        this.transic = dao.consultarTodos();
    }
    
    @Override
    public int getRowCount() {
        return transic.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
   public Object getValueAt(int indiceLinha, int indiceColuna) {
        Transicoes lib = this.transic.get(indiceLinha);
        switch(indiceColuna){
            case 0:
                return lib.getUsuario();
            case 1:
                return lib.getLivro();
            case 2:
                return df.format(lib.getEntrada());
            default:
                return null;
        } 
    }
    
    @Override
    public String getColumnName(int coluna) {
        switch(coluna){
            case 0:
                return "Usuario";
            case 1:
                return "Livro";
            case 2:
                return "Data de Retirada";
            default:
                return "";
        }
    }
    
    public Transicoes getValet(int indice) {
        return this.transic.get(indice);
    }
 
    public void adicionar(Transicoes lib) {
        lib = dao.salvar(lib);
        this.transic.add(lib);
        fireTableRowsInserted(this.transic.size() -1, this.transic.size() -1);
    }
    
    public void remover(Transicoes lib){
        dao.atualizar(lib);
        this.transic.remove(lib);
        fireTableRowsInserted(this.transic.size() -1, this.transic.size() -1);
    }
    
}
