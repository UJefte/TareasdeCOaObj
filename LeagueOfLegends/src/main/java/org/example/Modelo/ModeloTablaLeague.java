package org.example.Modelo;



import org.example.Percistencia.LeagueDB;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaLeague  implements TableModel {
    public static final int COLUMNS = 6;
    private ArrayList<LeagueOfLegens> datos;
    private LeagueDB jdao;

    public ModeloTablaLeague() {
        jdao = new LeagueDB();
        datos = new ArrayList<>();
    }

    public ModeloTablaLeague(ArrayList<LeagueOfLegens> datos) {
        this.datos = datos;
        jdao = new LeagueDB();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex){
            case 0:
                return "Id";
            case 1:
                return "Plataforma";
            case 2:
                return "Rol de Juego";
            case 3:
                return "Personaje Favorito";
            case 4:
                return "Rango en Clasificacion";
            case 5:
                return "URL";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LeagueOfLegens tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getPlataforma();
            case 2:
                return tmp.getRolFavorito();
            case 3:
                return tmp.getPersonajeFavorito();
            case 4:
                return tmp.getRangoClasificatorio();
            case 5:
                return tmp.getUrl();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                datos.get(rowIndex).setId(0);
                break;
            case 1:
                datos.get(rowIndex).setPlataforma((String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setRolFavorito((String) aValue);
                break;
            case 3:
                datos.get(rowIndex).setPersonajeFavorito((String) aValue);
                break;
            case 4:
                datos.get(rowIndex).setRangoClasificatorio((String) aValue);
                break;
            case 5:
                datos.get(rowIndex).setUrl((String) aValue);
                break;
            default:
                System.out.println("No se modifica nada");
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public void cargarDtos(){

        try {
            ArrayList<LeagueOfLegens> tirar = jdao.obtenerTodo();
            System.out.println(tirar);
            datos = jdao.obtenerTodo();
        }catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }

    public boolean agregarXmen(LeagueOfLegens xmen){
        boolean resultado = false;
        try {
            if (jdao.insertar(xmen)) {
                datos.add(xmen);
                resultado = true;
            }else{
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
    public LeagueOfLegens obtenerXmen(int rowIndex) throws IndexOutOfBoundsException{
        return datos.get(rowIndex);
    }
}


