package org.example.Percistencia;

import org.example.Modelo.LeagueOfLegens;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class LeagueDB implements InterfazDAO{

    public LeagueDB() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO LeagueOfLegends(Plataforma,Rol,Personaje,Rango,URL) VALUES(?,?,?,?,?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("LeagueOfLegends.db").getConexion().prepareStatement(sqlInsert);
        pstm.setString(1,((LeagueOfLegens)obj).getPlataforma());
        pstm.setString(2,((LeagueOfLegens)obj).getRolFavorito());
        pstm.setString(3,((LeagueOfLegens)obj).getPersonajeFavorito());
        pstm.setString(4,((LeagueOfLegens)obj).getRangoClasificatorio());
        pstm.setString(5,((LeagueOfLegens)obj).getUrl());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE LeagueOfLegends SET Plataforma = ?, Rol = ?, Personaje = ?, Rango = ?, Url = ? WHERE ID = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("LeagueOfLegends.db").getConexion().prepareStatement(sqlUpdate);
        pstm.setString(1,((LeagueOfLegens)obj).getPlataforma());
        pstm.setString(2,((LeagueOfLegens)obj).getRolFavorito());
        pstm.setString(3,((LeagueOfLegens)obj).getPersonajeFavorito());
        pstm.setString(4,((LeagueOfLegens)obj).getRangoClasificatorio());
        pstm.setString(5,((LeagueOfLegens)obj).getUrl());
        pstm.setInt(6, ((LeagueOfLegens)obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM LeagueOfLegends WHERE id = ?;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("LeagueOfLegends.db").getConexion().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM LeagueOfLegends";
        ArrayList<LeagueOfLegens> resultado = new ArrayList<>();

        Statement stm = ConexionSingleton.getInstance("LeagueOfLegends.db").getConexion().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()){
            resultado.add(new LeagueOfLegens(rst.getInt(1),rst.getString(2),rst.getString(3),
                    rst.getString(4),rst.getString(5),rst.getString(6)));

        }

        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM LeagueOfLegends WHERE id = ?;";
        LeagueOfLegens legens = null;

        PreparedStatement pstm = ConexionSingleton.getInstance("LeagueOfLegends.db").getConexion().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()){
            legens = new LeagueOfLegens(rst.getInt(1), rst.getString(2), rst.getString(3),
                    rst.getString(4), rst.getString(5), rst.getString(6));
            return legens;
        }


        return null;
    }
}
