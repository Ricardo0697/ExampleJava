/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Producto;

import Vista.Cliente.*;
import Entidad.Cliente;
import Entidad.Producto;
import Logica.ClienteLogica;
import Logica.ProductoLogica;
import Vista.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ricardo
 */
public class Obtener extends ObtenerMain {

    JTable jTable1;
    /**
     * Creates new form Obtener
     */
    public Obtener() {
        super();
        initComponents();
        this.CargarDatos();
        this.SetDatos();
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });

    }

    public void SetDatos() {
        this.setTitle("Producto");
        this.setLblTitulo("Producto");

    }
    
    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        Agregar agregar = new Agregar();
        agregar.setVisible(true);
        agregar.setAlwaysOnTop(true);
        agregar.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent ev) {
                agregar.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                agregar.setVisible(false);
                if (agregar.isAceptar()) {
                    CargarDatos();
                }
            }
        });
    }  
    
    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        int selectRow = this.jTable1.getSelectedRow();
        if (selectRow >= 0) {
            String id = jTable1.getModel().getValueAt(selectRow, 0).toString();
            String cedula = jTable1.getModel().getValueAt(selectRow, 1).toString();
            String nombre = jTable1.getModel().getValueAt(selectRow, 2).toString();
            String direccion = jTable1.getModel().getValueAt(selectRow, 3).toString();
            Cliente cliente = new Cliente();
            cliente.setId(Integer.parseInt(id));
            cliente.setNombre(nombre);
            cliente.setCedula(cedula);
            cliente.setDireccion(direccion);
            Editar editar = new Editar();
            editar.setCliente(cliente);
            editar.setVisible(true);
            editar.setAlwaysOnTop(true);
            editar.SetData();
            editar.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent ev) {
                    editar.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                    editar.setVisible(false);
                    if (editar.isAceptar()) {
                        CargarDatos();
                    }
                }
            });
        }
    } 
    
    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        int selectRow = jTable1.getSelectedRow();
        if (selectRow >= 0) {
            int confirm = JOptionPane.showOptionDialog(this,
                    "Seguro de eliminar el registro",
                    "Confirmación", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, null, null);
            if (confirm == JOptionPane.YES_OPTION) {
                ClienteLogica ClienteLogica = new ClienteLogica();
                Cliente cliente = new Cliente();
                String id = jTable1.getModel().getValueAt(selectRow, 0).toString();
                cliente.setId(Integer.parseInt(id));
                ClienteLogica.Eliminar(cliente);
                CargarDatos();
            }
        }
    } 
    
    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        this.CargarDatos();
    } 
    
    public void CargarDatos() {

        jTable1 = new javax.swing.JTable() {
            public boolean editCellAt(int row, int column, java.util.EventObject e) {
                return false;
            }
        };;
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Id", "Nombre", "Codigo", "Unidad","Precio Unitario","impuesto","descuento"
                }
        ));
        
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jTable1.setUpdateSelectionOnSort(false);

        jTable1.setVerifyInputWhenFocusTarget(false);

        this.getjScrollPane1().setViewportView(jTable1);

        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        int rowCount = modelo.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }

        ProductoLogica productoLogica = new ProductoLogica();

        modelo = (DefaultTableModel) jTable1.getModel();
        List<Producto> productos = productoLogica.Obtener();
        for (int i = 0; i < productos.size(); i++) {
            Object[] fila = new Object[7];
            fila[0] = ((Producto) productos.get(i)).getId();
            fila[1] = ((Producto) productos.get(i)).getNombre();
            fila[2] = ((Producto) productos.get(i)).getCodigo();
            fila[3] = ((Producto) productos.get(i)).getUnidad();
            fila[4] = ((Producto) productos.get(i)).getPrecioUnitario();
            fila[5] = ((Producto) productos.get(i)).getImpuesto();
            fila[6] = ((Producto) productos.get(i)).getDescuento();
            modelo.addRow(fila);
        }
        jTable1.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Vista.Empleado.Obtener.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.Empleado.Obtener.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.Empleado.Obtener.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.Empleado.Obtener.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista.Producto.Obtener().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
