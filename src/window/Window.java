package window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;


import dialog.Dialog;
import report.Report;
import connection.DbConnection;

/**
 *
 * @author Gabriel
 */
public class Window extends javax.swing.JFrame {
	private static Dialog dialog;
	private static String user;
	private static String pass;
	private String dniInsert;
	private ArrayList<String> campos;
	private String titulo;
	private Connection connect = null;
    /**
     * Creates new form Window
     */
    public Window(Dialog dialog, String user, String pass) {
        super();
        this.dialog = dialog;
        this.user = user;
        this.pass = pass;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
    	jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(titulo);
        setBackground(new java.awt.Color(153, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(800, 500));
        setLocationRelativeTo(null);
        setResizable(false);
        getNames();
        menuBar();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText(campos.get(0));
        
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText(campos.get(1));
        
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText(campos.get(2));
        
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText(campos.get(3));
        
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText(campos.get(4));
        

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField5.setFocusable(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton1.setText("Crear cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });       
        
        jButton2.setText("Actualizar cliente");

        jButton3.setText("Eliminar cliente");
        
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jDateChooser1.setDateFormatString("dd/MM/yyyy");
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField5)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>                        
    
    private void getNames() {
		try {
			PreparedStatement ps = establishConnection().getConexion().prepareStatement(
					"SELECT * "
					+ "FROM clientes");
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			campos = new ArrayList<String>();
			for(int i=1; i<6; i++) {
				campos.add(rsmd.getColumnName(i));
			}
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(this, e.getMessage(), "Error al mostrar los datos", JOptionPane.ERROR_MESSAGE);
			try {
				if (connect != null) {
					connect.close();
				}
			} catch (SQLException e1) {}
		}
	}
    

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }        
    
    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {                                             
    	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	    Date date = jDateChooser1.getDate();
	    String dateString = String.format("%1$td-%1$tm-%1$tY", date);
	    jTextField5.setText(dateString);
	    revalidate();
    }                                            

    
    private void menuBar() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menuOpciones = new JMenu("Opciones");
		menuOpciones.setMnemonic(KeyEvent.VK_O);
		JMenuItem cambiarUsuario = new JMenuItem("Cambiar usuario");
		cambiarUsuario.setMnemonic(KeyEvent.VK_U);
		cambiarUsuario.setAccelerator(KeyStroke.getKeyStroke("ctrl U"));
		cambiarUsuario.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				changeUser();
			}
		});
		menuOpciones.add(cambiarUsuario);
		
		JMenuItem cargarDatos = new JMenuItem("Cargar datos");
		cargarDatos.setMnemonic(KeyEvent.VK_D);
		cargarDatos.setAccelerator(KeyStroke.getKeyStroke("ctrl D"));
		cargarDatos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				insertDni();
			}
		});
		menuOpciones.add(cargarDatos);
		
		JMenuItem limpiarDatos = new JMenuItem("Limpiar datos");
		limpiarDatos.setMnemonic(KeyEvent.VK_L);
		limpiarDatos.setAccelerator(KeyStroke.getKeyStroke("ctrl L"));
		limpiarDatos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				limpiarDatos();
			}
		});
		menuOpciones.add(limpiarDatos);
		menuBar.add(menuOpciones);
		/*------------*/
		JMenu menuInformes = new JMenu("Informes");
		menuInformes.setMnemonic(KeyEvent.VK_I);
		JMenuItem abrirFacturas = new JMenuItem("Facturas");
		abrirFacturas.setMnemonic(KeyEvent.VK_F);
		abrirFacturas.setAccelerator(KeyStroke.getKeyStroke("ctrl F"));
		abrirFacturas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				showInvoices(jTextField1.getText());
			}
		});
		menuInformes.add(abrirFacturas);
		
		JMenuItem abrirClientes = new JMenuItem("Clientes");
		abrirClientes.setMnemonic(KeyEvent.VK_T);
		abrirClientes.setAccelerator(KeyStroke.getKeyStroke("ctrl T"));
		abrirClientes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				showClients();
			}
		});
		menuInformes.add(abrirClientes);
		menuBar.add(menuInformes);
		setJMenuBar(menuBar);
	}
    private void showClients(){
		try {
			PreparedStatement ps = establishConnection().getConexion().prepareStatement(
					"SELECT * "
					+ "FROM clientes");
			ResultSet rs = ps.executeQuery();
			Report report = new Report(rs);
			report.setVisible(true);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(this, e.getMessage(), "Error al mostrar los datos", JOptionPane.ERROR_MESSAGE);
			try {
				if (connect != null) {
					connect.close();
				}
			} catch (SQLException e1) {}
		}
    }
    private void showInvoices(String dni) {
    	if(jTextField1.isEnabled()) {
    		if(jTextField1 == null || jTextField1.getText().equals("")) {
        		try {
        			PreparedStatement ps = establishConnection().getConexion().prepareStatement(
        					"SELECT * "
        					+ "FROM facturas");
        			ResultSet rs = ps.executeQuery();
        			Report report = new Report(rs);
        			report.setVisible(true);
        		} catch (SQLException e) {
        			JOptionPane.showMessageDialog(this, e.getMessage(), "Error al mostrar los datos", JOptionPane.ERROR_MESSAGE);
        			try {
        				if (connect != null) {
        					connect.close();
        				}
        			} catch (SQLException e1) {}
        		}
    		}else {
        		try {
        			PreparedStatement ps = establishConnection().getConexion().prepareStatement(
        					"SELECT * "
        					+ "FROM facturas WHERE cliente = ?");
        			ps.setString(1, dni);
        			ResultSet rs = ps.executeQuery();
        			 if(!rs.isBeforeFirst()){
        				 JOptionPane.showMessageDialog(this, "No existe ese DNI en la DB", "DNI no encontrado", JOptionPane.ERROR_MESSAGE);
        			 }
        	           else{
    	        	   Report report = new Report(rs);
               			report.setVisible(true);
           			}
        		} catch (SQLException e) {
        			JOptionPane.showMessageDialog(this, e.getMessage(), "Error al mostrar los datos", JOptionPane.ERROR_MESSAGE);
        			try {
        				if (connect != null) {
        					connect.close();
        				}
        			} catch (SQLException e1) {}
        		}
    		}
    	}
    	if(!jTextField1.isEnabled()){
    		try {
    			PreparedStatement ps = establishConnection().getConexion().prepareStatement(
    					"SELECT * "
    					+ "FROM facturas WHERE cliente = ?");
    			ps.setString(1, dni);
    			ResultSet rs = ps.executeQuery();
    			Report report = new Report(rs);
    			report.setVisible(true);	
    		} catch (SQLException e) {
    			JOptionPane.showMessageDialog(this, e.getMessage(), "Error al mostrar los datos", JOptionPane.ERROR_MESSAGE);
    			try {
    				if (connect != null) {
    					connect.close();
    				}
    			} catch (SQLException e1) {}
    		}
    	}
    	
    }
    
    private void changeUser(){
    	this.setVisible(false);
		this.dialog.setVisible(true);
    }
    private void insertDni() {
    	dniInsert = null;
    	dniInsert = JOptionPane.showInputDialog(this, "Introduzca el Dni", "Cargar datos", JOptionPane.INFORMATION_MESSAGE);
       	if(dniInsert == null || dniInsert.equals("")) {
    		return;
    	}
    	if(condiciones()) {
    		getInfo(dniInsert);
    	} else {
    		return;
    	}
    }
    private boolean condiciones() {
    	if(validarDni(dniInsert)==false) {
    	JOptionPane.showMessageDialog(this, "Introduzca un Dni v�lido", "Error", JOptionPane.ERROR_MESSAGE);
    	insertDni();
    	}
    	if(dniInsert == null || dniInsert.equals("")) {
    		return false;
    	}
    	return true;
    }
    
    private boolean validarDni(String dni) {
    	if(dni.length()==9) {
    		char letra = dni.charAt(8);
    		if(Character.isLetter(letra)) {
    			return true;
    		}
    		dniInsert = null;
    		return false;
    	}
    	dniInsert = null;
    	return false;
    }

	private void getInfo(String dni) {
		try {
			PreparedStatement ps = establishConnection().getConexion().prepareStatement(
					"SELECT * "
					+ "FROM clientes WHERE DNI = ?");
			ps.setString(1, dni);
			ResultSet rs = ps.executeQuery();
			if(rs.next() == false) {
				dniInsert = null;
		    	JOptionPane.showMessageDialog(this, "El DNI no existe en la DB", "Error", JOptionPane.ERROR_MESSAGE);
		    	insertDni();
			}else {
				do {
					showInfo(rs);
				}while(rs.next());
			}
		}
	catch (SQLException e) {
			System.out.println("ERROR");
			e.printStackTrace();
		}			
	}
	
	private void showInfo(ResultSet rs) {
		try {
			jTextField1.setEnabled(false);
	    	jTextField2.setEnabled(false);
	    	jTextField3.setEnabled(false);
	    	jTextField4.setEnabled(false);
	    	jTextField5.setEnabled(false);
	    	jDateChooser1.setEnabled(false);
			jTextField1.setText(rs.getString("DNI"));
			jTextField2.setText(rs.getString("Nombre"));
			jTextField3.setText(rs.getString("Ape1"));
			jTextField4.setText(rs.getString("Ape2"));
			jTextField5.setText(rs.getString("Fec_Nac"));
	    	this.revalidate();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(this, "Error al extraer la informaci�n", "Error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}
	private void limpiarDatos() {
		jTextField1.setEnabled(true);
		jTextField1.setText("");
    	jTextField2.setEnabled(true);
    	jTextField2.setText("");
    	jTextField3.setEnabled(true);
    	jTextField3.setText("");
    	jTextField4.setEnabled(true);
    	jTextField4.setText("");
    	jTextField5.setText("");
    	jDateChooser1.setEnabled(true);
    	jDateChooser1.cleanup();
    	revalidate();
	}
    private DbConnection establishConnection() {
		connect = null;
		try {
			DbConnection connection = new DbConnection(connect, dialog.getUser(), dialog.getPass());
			return connection;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(this, "Error en la conexi�n a la DB", "Error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		return null;
	}
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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window(dialog, user, pass).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration                   
}
