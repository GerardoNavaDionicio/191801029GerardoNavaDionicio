/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import DaoIluminacion.DaoIluminacion;
import Iluminacion.Iluminacion;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author GenadyThink
 */
public class Mostrar extends javax.swing.JInternalFrame {

    /**
     * Creates new form Mostrar
     */
    DefaultListModel modelo = new DefaultListModel();
    private void crearModelo()throws SQLException{
       modelo.clear();
        List <Iluminacion> listaIluminacion = new ArrayList();
        listaIluminacion = DaoIluminacion.listaIluminacion();
        for(Iluminacion iluminacion:listaIluminacion){
            modelo.addElement(iluminacion.getMarca());
        }
    }
    //*******************************************************************
    DefaultListModel modelo2 = new DefaultListModel();
    private void crearModelo2()throws SQLException{
       modelo2.clear();
        List <Iluminacion> listaIluminacion2 = new ArrayList();
        listaIluminacion2 = DaoIluminacion.listaIluminacion();
        for(Iluminacion iluminacion:listaIluminacion2){
            modelo2.addElement(iluminacion.getTipo());
        }
    }
    //*******************************************************************
    DefaultListModel modelo3 = new DefaultListModel();
    private void crearModelo3()throws SQLException{
       modelo3.clear();
        List <Iluminacion> listaIluminacion3 = new ArrayList();
        listaIluminacion3 = DaoIluminacion.listaIluminacion();
        for(Iluminacion iluminacion:listaIluminacion3){
            modelo3.addElement(iluminacion.isDmx());
        }
    }
    //*******************************************************************
    DefaultListModel modelo4 = new DefaultListModel();
    private void crearModelo4()throws SQLException{
       modelo4.clear();
        List <Iluminacion> listaIluminacion4 = new ArrayList();
        listaIluminacion4 = DaoIluminacion.listaIluminacion();
        for(Iluminacion iluminacion:listaIluminacion4){
            modelo4.addElement(iluminacion.isDisponible());
        }
    }
    //*******************************************************************
    DefaultListModel modelo5 = new DefaultListModel();
    private void crearModelo5()throws SQLException{
       modelo5.clear();
        List <Iluminacion> listaIluminacion5 = new ArrayList();
        listaIluminacion5 = DaoIluminacion.listaIluminacion();
        for(Iluminacion iluminacion:listaIluminacion5){
            modelo5.addElement(iluminacion.getVoltaje());
        }
    }
    //*******************************************************************
    DefaultListModel modelo6 = new DefaultListModel();
    private void crearModelo6()throws SQLException{
       modelo6.clear();
        List <Iluminacion> listaIluminacion6= new ArrayList();
        listaIluminacion6 = DaoIluminacion.listaIluminacion();
        for(Iluminacion iluminacion:listaIluminacion6){
            modelo6.addElement(iluminacion.getSerie());
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    //*******************************************************************
    public Mostrar() {
        initComponents();
        try {
            this.crearModelo();
        } catch (SQLException ex) {
            Logger.getLogger(Mostrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        Marca.setModel(modelo);
    //*******************************************************************

        try {
            this.crearModelo2();
        } catch (SQLException ex) {
            Logger.getLogger(Mostrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        tipo.setModel(modelo2);
    //*******************************************************************
        try {
            this.crearModelo3();
        } catch (SQLException ex) {
            Logger.getLogger(Mostrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        dmx.setModel(modelo3);
    //*******************************************************************
        try {
            this.crearModelo4();
        } catch (SQLException ex) {
            Logger.getLogger(Mostrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        disponible.setModel(modelo4);
    //*******************************************************************
        try {
            this.crearModelo5();
        } catch (SQLException ex) {
            Logger.getLogger(Mostrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        voltaje.setModel(modelo5);
    //*******************************************************************
       try {
            this.crearModelo6();
        } catch (SQLException ex) {
            Logger.getLogger(Mostrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        numero.setModel(modelo);
    //*******************************************************************
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TablaVista = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Marca = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tipo = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        dmx = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        disponible = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        voltaje = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        numero = new javax.swing.JList<>();

        setClosable(true);

        Marca.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Marca);

        tipo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(tipo);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Marca");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DMX");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Disponible");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Voltaje");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo de Iluminacion");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("N. Serie");

        dmx.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(dmx);

        disponible.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(disponible);

        voltaje.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(voltaje);

        numero.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane7.setViewportView(numero);

        TablaVista.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        TablaVista.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        TablaVista.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        TablaVista.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        TablaVista.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        TablaVista.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        TablaVista.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        TablaVista.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        TablaVista.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        TablaVista.setLayer(jScrollPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        TablaVista.setLayer(jScrollPane6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        TablaVista.setLayer(jScrollPane7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout TablaVistaLayout = new javax.swing.GroupLayout(TablaVista);
        TablaVista.setLayout(TablaVistaLayout);
        TablaVistaLayout.setHorizontalGroup(
            TablaVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablaVistaLayout.createSequentialGroup()
                .addGroup(TablaVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(TablaVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(TablaVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(TablaVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(TablaVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(18, 18, 18)
                .addGroup(TablaVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        TablaVistaLayout.setVerticalGroup(
            TablaVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablaVistaLayout.createSequentialGroup()
                .addGroup(TablaVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(TablaVistaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(TablaVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TablaVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TablaVistaLayout.createSequentialGroup()
                        .addGroup(TablaVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TablaVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                .addComponent(jScrollPane1))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(TablaVistaLayout.createSequentialGroup()
                        .addGroup(TablaVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 99, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TablaVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TablaVista, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Marca;
    private javax.swing.JDesktopPane TablaVista;
    private javax.swing.JList<String> disponible;
    private javax.swing.JList<String> dmx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JList<String> numero;
    private javax.swing.JList<String> tipo;
    private javax.swing.JList<String> voltaje;
    // End of variables declaration//GEN-END:variables
}
