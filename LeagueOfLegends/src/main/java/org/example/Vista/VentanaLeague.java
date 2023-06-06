package org.example.Vista;

import javax.swing.*;
import java.awt.*;


public class VentanaLeague extends JFrame {
    private JLabel lblId;
    private JLabel lblPlataforma;
    private JLabel lblRol;
    private JLabel lblPersonaje;
    private JLabel lblRango;
    private JLabel lblUrl;
    private JTextField txtId;
    private JTextField txtPlataforma;
    private JTextField txtRol;
    private JTextField txtPersonaje;
    private JTextField txtRango;
    private JTextField txtUrl;
    private JButton btnAgregar;
    private JTable tabla;
    private JScrollPane scrollpane;
    private GridLayout layout;
    private JButton btnCargar;
    private JLabel lblImagen;
    private JLabel lblEliminar;
    private JTextField txtElimid;
    private JLabel lblEditarPlataforma;
    private JLabel lblEditarRol;
    private JLabel lblEditarPersonaje;
    private JLabel lblEditarRango;
    private JLabel lblEditarUrl;
    private JTextField txtEditPlataforma;
    private JTextField txtEditRol;
    private JTextField txtEditPersonaje;
    private JTextField txtEditRango;
    private JTextField txtEditUrl;
    private JButton btnEliminar;
    private JButton btnActualizar;
    //Formulario
    private JPanel panel1;
    //Tabla conectada a nase de datos
    private JPanel panel2;
    //Imagen URL
    private JPanel panel3;
    //Editar Tabla
    private JPanel panel4;

    public VentanaLeague(String title) throws HeadlessException {
        super(title);
        this.setSize(930,800);

        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //Panel 1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(72, 255, 243));

        lblId = new JLabel("Id:");
        lblPlataforma = new JLabel("Plataforma:");
        lblRol = new JLabel("Rol Favorito:");
        lblPersonaje = new JLabel("Personaje Favorito:");
        lblRango = new JLabel("Rango en Clasificacion:");
        lblUrl = new JLabel("Url:");

        txtId = new JTextField(3);
        txtId.setText("0");
        txtId.setEnabled(false);
        txtPlataforma = new JTextField(10);
        txtRol = new JTextField(10);
        txtPersonaje = new JTextField(10);
        txtRango = new JTextField(10);
        txtUrl = new JTextField(30);

        btnAgregar = new JButton("Agregar");

        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblPlataforma);
        panel1.add(txtPlataforma);
        panel1.add(lblRol);
        panel1.add(txtRol);
        panel1.add(lblPersonaje);
        panel1.add(txtPersonaje);
        panel1.add(lblRango);
        panel1.add(txtRango);
        panel1.add(lblUrl);
        panel1.add(txtUrl);
        panel1.add(btnAgregar);

        //Panel 2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(238, 87, 99));

        btnCargar = new JButton("Cargar");

        tabla = new JTable();
        scrollpane = new JScrollPane(tabla);

        panel2.add(btnCargar);
        panel2.add(scrollpane);

        //Panel 3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(203, 232, 109));

        lblImagen = new JLabel("-----");
        this.panel3.add(lblImagen);

        //Panel 4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(114, 255, 76));

        lblEliminar = new JLabel("Casilla: ");
        txtElimid = new JTextField(3);
        btnEliminar = new JButton("Eliminar");
        this.panel4.add(lblEliminar);
        this.panel4.add(txtElimid);
        this.panel4.add(btnEliminar);

        lblEditarPlataforma = new JLabel("Editar Plataforma: ");
        lblEditarRol = new JLabel("Editar Rol Favorito: ");
        lblEditarPersonaje = new JLabel("Editar Personaje Favorito: ");
        lblEditarRango = new JLabel("Editar Rango en Clasificacion: ");
        lblEditarUrl = new JLabel("Editar Url: ");
        txtEditPlataforma= new JTextField(20);
        txtEditRol= new JTextField(20);
        txtEditPersonaje= new JTextField(20);
        txtEditRango= new JTextField(20);
        txtEditUrl= new JTextField(20);

        this.panel4.add(lblEditarPlataforma);
        this.panel4.add(txtEditPlataforma);
        this.panel4.add(lblEditarRol);
        this.panel4.add(txtEditRol);
        this.panel4.add(lblEditarPersonaje);
        this.panel4.add(txtEditPersonaje);
        this.panel4.add(lblEditarRango);
        this.panel4.add(txtEditRango);
        this.panel4.add(lblEditarUrl);
        this.panel4.add(txtEditUrl);

        btnActualizar = new JButton("Editar");
        this.panel4.add(btnActualizar);

        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblPlataforma() {
        return lblPlataforma;
    }

    public void setLblPlataforma(JLabel lblPlataforma) {
        this.lblPlataforma = lblPlataforma;
    }

    public JLabel getLblRol() {
        return lblRol;
    }

    public void setLblRol(JLabel lblRol) {
        this.lblRol = lblRol;
    }

    public JLabel getLblPersonaje() {
        return lblPersonaje;
    }

    public void setLblPersonaje(JLabel lblPersonaje) {
        this.lblPersonaje = lblPersonaje;
    }

    public JLabel getLblRango() {
        return lblRango;
    }

    public void setLblRango(JLabel lblRango) {
        this.lblRango = lblRango;
    }

    public JLabel getLblUrl() {
        return lblUrl;
    }

    public void setLblUrl(JLabel lblUrl) {
        this.lblUrl = lblUrl;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtPlataforma() {
        return txtPlataforma;
    }

    public void setTxtPlataforma(JTextField txtPlataforma) {
        this.txtPlataforma = txtPlataforma;
    }

    public JTextField getTxtRol() {
        return txtRol;
    }

    public void setTxtRol(JTextField txtRol) {
        this.txtRol = txtRol;
    }

    public JTextField getTxtPersonaje() {
        return txtPersonaje;
    }

    public void setTxtPersonaje(JTextField txtPersonaje) {
        this.txtPersonaje = txtPersonaje;
    }

    public JTextField getTxtRango() {
        return txtRango;
    }

    public void setTxtRango(JTextField txtRango) {
        this.txtRango = txtRango;
    }

    public JTextField getTxtUrl() {
        return txtUrl;
    }

    public void setTxtUrl(JTextField txtUrl) {
        this.txtUrl = txtUrl;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScrollpane() {
        return scrollpane;
    }

    public void setScrollpane(JScrollPane scrollpane) {
        this.scrollpane = scrollpane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JLabel getLblImagen() {
        return lblImagen;
    }

    public void setLblImagen(JLabel lblImagen) {
        this.lblImagen = lblImagen;
    }

    public JLabel getLblEliminar() {
        return lblEliminar;
    }

    public void setLblEliminar(JLabel lblEliminar) {
        this.lblEliminar = lblEliminar;
    }

    public JTextField getTxtElimid() {
        return txtElimid;
    }

    public void setTxtElimid(JTextField txtElimid) {
        this.txtElimid = txtElimid;
    }

    public JLabel getLblEditarPlataforma() {
        return lblEditarPlataforma;
    }

    public void setLblEditarPlataforma(JLabel lblEditarPlataforma) {
        this.lblEditarPlataforma = lblEditarPlataforma;
    }

    public JLabel getLblEditarRol() {
        return lblEditarRol;
    }

    public void setLblEditarRol(JLabel lblEditarRol) {
        this.lblEditarRol = lblEditarRol;
    }

    public JLabel getLblEditarPersonaje() {
        return lblEditarPersonaje;
    }

    public void setLblEditarPersonaje(JLabel lblEditarPersonaje) {
        this.lblEditarPersonaje = lblEditarPersonaje;
    }

    public JLabel getLblEditarRango() {
        return lblEditarRango;
    }

    public void setLblEditarRango(JLabel lblEditarRango) {
        this.lblEditarRango = lblEditarRango;
    }

    public JLabel getLblEditarUrl() {
        return lblEditarUrl;
    }

    public void setLblEditarUrl(JLabel lblEditarUrl) {
        this.lblEditarUrl = lblEditarUrl;
    }

    public JTextField getTxtEditPlataforma() {
        return txtEditPlataforma;
    }

    public void setTxtEditPlataforma(JTextField txtEditPlataforma) {
        this.txtEditPlataforma = txtEditPlataforma;
    }

    public JTextField getTxtEditRol() {
        return txtEditRol;
    }

    public void setTxtEditRol(JTextField txtEditRol) {
        this.txtEditRol = txtEditRol;
    }

    public JTextField getTxtEditPersonaje() {
        return txtEditPersonaje;
    }

    public void setTxtEditPersonaje(JTextField txtEditPersonaje) {
        this.txtEditPersonaje = txtEditPersonaje;
    }

    public JTextField getTxtEditRango() {
        return txtEditRango;
    }

    public void setTxtEditRango(JTextField txtEditRango) {
        this.txtEditRango = txtEditRango;
    }

    public JTextField getTxtEditUrl() {
        return txtEditUrl;
    }

    public void setTxtEditUrl(JTextField txtEditUrl) {
        this.txtEditUrl = txtEditUrl;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }
    public void limpiar(){
        txtPlataforma.setText("");
        txtRol.setText("");
        txtPersonaje.setText("");
        txtRango.setText("");
        txtUrl.setText("");

    }

    public void limpiar2(){
        txtEditPlataforma.setText("");
        txtEditRol.setText("");
        txtEditPersonaje.setText("");
        txtEditRango.setText("");
        txtEditUrl.setText("");
    }
}

