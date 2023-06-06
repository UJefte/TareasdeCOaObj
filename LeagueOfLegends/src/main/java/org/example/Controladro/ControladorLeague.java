package org.example.Controladro;

import org.example.Modelo.LeagueOfLegens;
import org.example.Modelo.ModeloTablaLeague;
import org.example.Percistencia.LeagueDB;
import org.example.Vista.VentanaLeague;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.sql.SQLException;

public class ControladorLeague extends MouseAdapter {
        private VentanaLeague view;
        private ModeloTablaLeague modelo;

        public ControladorLeague(VentanaLeague view) {
            this.view = view;
            modelo = new ModeloTablaLeague();
            this.view.getTabla().setModel(modelo);
            this.view.getBtnCargar().addMouseListener(this);
            this.view.getBtnAgregar().addMouseListener(this);
            this.view.getTabla().addMouseListener(this);
            this.view.getBtnEliminar().addMouseListener(this);
            this.view.getBtnActualizar().addMouseListener(this);
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource() == this.view.getBtnCargar()){

                modelo.cargarDtos();
                this.view.getTabla().setModel(modelo);
                this.view.getTabla().updateUI();
            }
            if (e.getSource() == this.view.getBtnAgregar()){
                LeagueOfLegens legens = new LeagueOfLegens();
                legens.setId(0);
                legens.setPlataforma(this.view.getTxtPlataforma().getText());
                legens.setRolFavorito(this.view.getLblRol().getText());
                legens.setPersonajeFavorito(this.view.getTxtPersonaje().getText());
                legens.setRangoClasificatorio(this.view.getTxtRango().getText());
                legens.setUrl(this.view.getTxtUrl().getText());

                if (modelo.agregarXmen(legens)){
                    JOptionPane.showMessageDialog(view,"Se agrego correctamente","Aviso",JOptionPane.INFORMATION_MESSAGE);
                    this.view.getTabla().updateUI();
                }else {
                    JOptionPane.showMessageDialog(view, "No se pudo agregar a la base de datos. Por favor revise su conexion (",
                            "Error al insertar",
                            JOptionPane.ERROR_MESSAGE);
                }
                this.view.limpiar();
            }
            if(e.getSource() == view.getTabla()){
                System.out.println("Clic sobre la tabla");

                int rowIndex = view.getTabla().getSelectedRow();

                LeagueOfLegens temp = modelo.obtenerXmen(rowIndex);

                view.getLblImagen().setText("");
                view.getLblImagen().setIcon(temp.createIcon());
            }

            if (e.getSource() == view.getBtnEliminar()){
                System.out.println("Click en eliminar");
                LeagueDB dao =new LeagueDB();
                try{
                    if (dao.delete(this.view.getTxtElimid().getText())){
                        JOptionPane.showMessageDialog(view,"Se elimino correctamente","Aviso",JOptionPane.INFORMATION_MESSAGE);
                        this.view.getTabla().updateUI();
                    }
                }catch(SQLException sqle){
                    System.out.println("Error al eliminar");
                }

            }

            if (e.getSource() == view.getBtnActualizar()){
                LeagueDB dao = new LeagueDB();
                LeagueOfLegens legens = new LeagueOfLegens();
                legens.setId(Integer.parseInt(this.view.getTxtElimid().getText()));
                legens.setPlataforma(this.view.getTxtEditPlataforma().getText());
                legens.setRolFavorito(this.view.getTxtEditRol().getText());
                legens.setPersonajeFavorito(this.view.getTxtEditPersonaje().getText());
                legens.setRangoClasificatorio(this.view.getTxtEditRango().getText());
                legens.setUrl(this.view.getTxtEditUrl().getText());
                try {
                    if (dao.update(legens)){
                        JOptionPane.showMessageDialog(view,"Se edito exitosamente", "Aviso",JOptionPane.INFORMATION_MESSAGE);
                        this.view.getTabla().updateUI();
                    }
                }catch (SQLException sqle){
                    System.out.println(sqle.getMessage());
                    JOptionPane.showMessageDialog(view, "Faltan por llenar espacios", "Advertencia",JOptionPane.ERROR_MESSAGE);
                }

                this.view.limpiar2();
        }
    }
}
