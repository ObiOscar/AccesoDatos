/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos;


import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author oski_
 */
public class CrearTabla extends javax.swing.JDialog {

    /**
     * Creates new form CrearTabla
     */
    public CrearTabla(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboTabla = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jBAbrir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jBGuardar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jBAgregar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(590, 465));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título 1", "Título 2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Título 2");
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 254, 421, 211));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basedatos/Iconos/eliminar.png"))); // NOI18N
        jButton1.setToolTipText("Eliminar Fila");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarFila(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 210, 33, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basedatos/Iconos/anadir.png"))); // NOI18N
        jButton2.setToolTipText("Añadir Fila");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annadirFilaNueva(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 210, 33, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basedatos/Iconos/anadir.png"))); // NOI18N
        jButton3.setToolTipText("Añadir Columna");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annadirColumna(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 210, 33, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basedatos/Iconos/eliminar.png"))); // NOI18N
        jButton4.setToolTipText("Eliminar Columna");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarColumna(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 210, 33, -1));

        jComboTabla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 216, 182, -1));

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));

        jPanel3.setBackground(new java.awt.Color(85, 55, 118));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basedatos/abror.png"))); // NOI18N

        jBAbrir.setBackground(new java.awt.Color(54, 33, 89));
        jBAbrir.setForeground(new java.awt.Color(255, 255, 255));
        jBAbrir.setText("Abrir");
        jBAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAbrirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jBAbrir)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(64, 43, 100));

        jLabel6.setBackground(new java.awt.Color(64, 43, 100));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basedatos/abror.png"))); // NOI18N

        jBGuardar.setBackground(new java.awt.Color(54, 33, 89));
        jBGuardar.setText("Guardar Como");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jBGuardar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(64, 43, 100));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basedatos/abror.png"))); // NOI18N

        jBAgregar.setBackground(new java.awt.Color(54, 33, 89));
        jBAgregar.setText("Guardar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jBAgregar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Base SQLite");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 465));

        jPanel2.setBackground(new java.awt.Color(122, 72, 221));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Administración Base de datos SQLite con Java");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre Tabla");

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Clave Principal");

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Tablas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setToolTipText("Añadir Fila");
        jTable2.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 69, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basedatos/Iconos/icono.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 6, 160, 63));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 210, 4, 33));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /*Con este método obtengo el nombre del archivo que van a abrir*/
    public static String sacarNombre(String archivoAbrir) {
        String nombreArchivo = "";
        try {
            String[] parts = archivoAbrir.split("\\\\");
            int numeroParticiones = parts.length;
            nombreArchivo = parts[numeroParticiones - 1];
            System.out.println(nombreArchivo);

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Ruta inválida", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        return nombreArchivo;
    }

    public String clavePrincipal(String archivoAbrir, String nombreTabla) throws SQLException {
        String catalog = null;
        String columnName = "";
        String schema = null;
        String tableName = nombreTabla;
        Connection conexion = DriverManager.getConnection("jdbc:sqlite:" + sacarNombre(archivoAbrir));
        DatabaseMetaData databaseMetaData = conexion.getMetaData();
        ResultSet result = databaseMetaData.getPrimaryKeys(catalog, schema, tableName);

        while (result.next()) {
            columnName = result.getString(4);
            System.out.println(columnName);
        }

        return columnName;
    }
    
    public void enseñarTablasListaDesplegable(Object[] nombreTabla , int numeroTablas, ResultSet resul2 ) {
        
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) jComboTabla.getModel();
        modelo.setSelectedItem(nombreTabla);
        try {
            modelo.removeAllElements();

            int contador = 0;

                //Con este bucle se va rellenando las filas, indistintamente del tipo y la cantidad de objetos que haya.
                while (numeroTablas <= contador) {
                    for (Object nombreTab : nombreTabla) {
                        System.out.println(nombreTab);
                        nombreTab = resul2.getObject(contador + 1);
                        jComboTabla.addItem((String) nombreTab);
                        contador++;
                        // modelo.addElement(nombreTab.toString());
                    }
                    // jComboTabla.setModel(modelo);

//                modeloNombreTabla.addRow(Nombretabla); // Añade una fila al final
                    //              contador = 0;
                }
            
        } catch (Exception e) {
            System.err.println("ERROR" + e.getMessage());
        }
    }

    private void jBAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAbrirActionPerformed
        jTable1.setModel(new DefaultTableModel()); //Limpiamos la tabla
        //Limpio el ComboBox y la tabla que muestra las Tablas de la base de datos
        jComboTabla.removeAllItems();
        jTable2.setModel(new DefaultTableModel()); //Limpiamos la tabla

        String archivoAbrir = "";
        FileNameExtensionFilter filtroSQLite = new FileNameExtensionFilter("SQLite", "db");    //Se mete un filtro 

        JFileChooser abrir = new JFileChooser();
        //Esto es para abrir en una ruta especificada, para que me sea mas cómodo trabajar
        File dir = new File("F:\\Desarrollo Aplicaciones Multiplataforma - copia\\DAM2\\Acceso a datos\\EjerciciosVarios\\Pruebas\\Nueva Carpeta\\BaseDatos");
        abrir.setCurrentDirectory(dir);

        abrir.addChoosableFileFilter(filtroSQLite);
        abrir.setFileFilter(filtroSQLite);
        abrir.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int opcion = abrir.showOpenDialog(this);    //Guarda la opcion pulsada, 0 si es aceptar

        if (opcion == JFileChooser.APPROVE_OPTION) {
            try {
                archivoAbrir = abrir.getSelectedFile().getCanonicalPath();
                //direcciónAbrir = archivoAbrir;//lo guardo para despues

                try {
                    
                    //Cargar el driver. Necesitamaos carga el driver de MySQL. 
                    Class.forName("org.sqlite.JDBC");
                    //Para Sqlite es: "org.sqlite.JDBC"
                    // Establecemos la conexion con la BD
                    Connection conexion = DriverManager.getConnection("jdbc:sqlite:" + sacarNombre(archivoAbrir));
                    /*jdbc:mysql:indica que estamos utilizando del driver JDBC para MySQL
                     */
                    //Establecemos la conexion con la base de datos nuestra 
                   
                    //preparamos la consulta a hacer para realizarla con Statement y llamamamos al metodo createStatement, el método executeQuery()  sirve para realizar una consulta a la BD y se le pasa un staring en el que	está la consulta SQL*/
                    Statement sentencia = conexion.createStatement();
                    String sql = "select name from sqlite_master where type = \"table\"";
                    ResultSet resul2 = sentencia.executeQuery(sql);  //Enseño las tablas que tiene la base que has selecionado
                   
                    ResultSetMetaData metaDatosTabla = resul2.getMetaData();
                    // Se obtiene el número de tablas.
                    int numeroTablas = metaDatosTabla.getColumnCount();
                    // Se crea un array de tamño numero de tablas que tenga la base de datos
                    Object[] Nombretabla = new Object[numeroTablas];
                    // Se recorre el array para obtener las tablas que tenga
                    for (int i = 0; i < numeroTablas; i++) {
                        // Nuevamente, para ResultSetMetaData la primera columna es la 1. 
                        Nombretabla[i] = metaDatosTabla.getColumnLabel(i + 1);
                    }
                    DefaultTableModel modeloNombreTabla = (DefaultTableModel) jTable2.getModel();
                    modeloNombreTabla.setColumnIdentifiers(Nombretabla);
                    
                    DefaultComboBoxModel modeloLista = (DefaultComboBoxModel) jComboTabla.getModel();
                    modeloLista.setSelectedItem(Nombretabla);
                    
                  //  enseñarTablasListaDesplegable(Nombretabla, numeroTablas,resul2);

                    int contadorTabla = 0;
                    int contadorLista = 0;
                    while (resul2.next()){//se eejcutaa mientras haya mas datos
                   //Con este bucle se va rellenando las filas, indistintamente del tipo y la cantidad de objetos que haya.
                        while (contadorTabla < numeroTablas) {
                            Nombretabla[contadorTabla] = resul2.getObject(contadorTabla + 1);
                            System.out.println(resul2.getObject(contadorTabla + 1));
                            contadorTabla++;
                        }
                        modeloNombreTabla.addRow(Nombretabla); // Añade una fila al final
                        contadorTabla = 0;

                        while (contadorLista < numeroTablas) {
                            Nombretabla[contadorLista] = resul2.getObject(contadorLista + 1);
                            System.out.println(resul2.getObject(contadorLista + 1));
                            jComboTabla.addItem((String) Nombretabla[contadorLista]);
                            contadorLista++;
                        }
                        contadorLista = 0;

//                        for (Object nombreTab : Nombretabla) {
//                            System.out.println(nombreTab);
//                            nombreTab = resul2.getObject(contadorLista + 1);
//                            jComboTabla.addItem((String) nombreTab);
//                            contadorLista++;
//                            // modelo.addElement(nombreTab.toString());
//                        }
//                        contadorLista = 0;
                    }
                    

                

                Statement sentencia2 = conexion.createStatement();
                ResultSet resul = sentencia2.executeQuery("SELECT * FROM departamentos");
                    
                    //sentencia.execute(sql);
//                    "select name from sqlite_master where type = \\\"table\\\";"
//                    ResultSetMetaData metaDatos = resul.getMetaData();
//        
//                    System.out.println(resul);
                    //JOptionPane.showMessageDialog(null, sentencia, "Mensaje en la barra de titulo", JOptionPane.WARNING_MESSAGE);
                    //Pongo titulo, la ruta absoluta de la tabla que se trabaja
                    this.setTitle(archivoAbrir);
                    //Pongo el nombre de la tabla para que se sepa cual se esta trabajando
                    jLabel1.setText(sacarNombre(archivoAbrir));
                    //Pongo la tabla selecionada
                    jTextField3.setText("departamentos");
                    //Pongo la clave principal
                    jTextField2.setText(clavePrincipal(archivoAbrir, "departamentos"));

                    //Es para rellenar la tabla sin saber nada
                    ResultSetMetaData metaDatos = resul.getMetaData();
                    // Se obtiene el número de columnas.
                    int numeroColumnas = metaDatos.getColumnCount();
                    // Se crea un array de etiquetas para rellenar
                    Object[] etiquetas = new Object[numeroColumnas];
                    // Se obtiene cada una de las etiquetas para cada columna
                    for (int i = 0; i < numeroColumnas; i++) {
                        // Nuevamente, para ResultSetMetaData la primera columna es la 1. 
                        etiquetas[i] = metaDatos.getColumnLabel(i + 1);
                    }
                    DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                    modelo.setColumnIdentifiers(etiquetas);

                    //Esto me sirve para las filas, para ir rellenandolas en el bucle 
                    Object[] fila = new Object[numeroColumnas];

                    // Recorremos el resultado para visualizar cada fila
                    int contadorInterno = 0;
                    while (resul.next())//se eejcutaa mientras haya mas datos
                    {
                        //Con este bucle se va rellenando las filas, indistintamente del tipo y la cantidad de objetos que haya.
                        while (contadorInterno < numeroColumnas) {
                            fila[contadorInterno] = resul.getObject(contadorInterno + 1);
                            System.out.println(resul.getObject(contadorInterno + 1));
                            contadorInterno++;
                        }
                        modelo.addRow(fila); // Añade una fila al final
                        contadorInterno = 0;
                    }
                    //Se liberan todos los recursos y se cierra la conexión
                    resul.close();    // Cerrar ResultSet
                    sentencia.close();    // Cerrar Statement
                    conexion.close();    //Cerrar conexion

                } catch (ClassNotFoundException | SQLException cn) {
                }
                //obtener el nombre del fichero
                archivoAbrir = abrir.getSelectedFile().getName();  //guardo el nombre del archivo a abrir
            } catch (IOException e) {
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "No se pudo encontrar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            archivoAbrir = "Operación cancelada";
        }

        
    }//GEN-LAST:event_jBAbrirActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void eliminarFila(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarFila
       try{
        if (jTable1.getRowCount() > 0) { //Compruebo que haya filas para borrar
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.removeRow(jTable1.getSelectedRow());  // borra la fila selecionada
        } else {
            Toolkit.getDefaultToolkit().beep();   //Sino hay fila pita el ordenador
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No ha selecionado FILA", "No se ha podido Borrar", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_eliminarFila

    private void annadirFilaNueva(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annadirFilaNueva
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            Object[] fila = new Object[1];
            modelo.addRow(fila); // Añade una fila al final
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "No ha selecionado COLUMNA", "No se ha podido Borrar", JOptionPane.ERROR_MESSAGE);
        
        }
    }//GEN-LAST:event_annadirFilaNueva

    private void annadirColumna(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annadirColumna
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            String nombreColumna =JOptionPane.showInputDialog(null, "Nombre Columna");
            String columna = nombreColumna;
            modelo.addColumn(columna); // Añade una columna al final
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "No ha selecionado COLUMNA", "No se ha podido Borrar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_annadirColumna

    private void EliminarColumna(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarColumna
        try {
            if (jTable1.getColumnCount() > 0) { //Compruebo que haya columna para borrar
                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                modelo.setColumnCount(jTable1.getColumnCount()-1);
            } else {
                Toolkit.getDefaultToolkit().beep();   //Sino hay fila pita el ordenador
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No ha selecionado COLUMNA", "No se ha podido Borrar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_EliminarColumna

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CrearTabla dialog = new CrearTabla(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAbrir;
    private javax.swing.JButton jBAbrir2;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBAgregar1;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
