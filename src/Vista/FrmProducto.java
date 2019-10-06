package Vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Modelo.Producto;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class FrmProducto extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("New label");
	private JTextField txtPaisDeOrigen;
	private JTextField txtPrecio;
	private JTextField txtNombre;
	private JTextField textBuscar;
	private Producto miProducto = new Producto();
	private JTable myTabla;
	DefaultTableModel modelo = new DefaultTableModel();
	private JButton btnBuscar;


	/**
	 * Create the frame.
	 */
	public FrmProducto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setAlignmentY(Component.TOP_ALIGNMENT);
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel lblNewLabel_1 = new JLabel("Nombre");

		JLabel lblBbddl = new JLabel("BBDD");

		JTextField txtCodigo = new JTextField();
		txtCodigo.setColumns(10);

		JLabel lblInsertar = new JLabel("Codigo");

		txtPaisDeOrigen = new JTextField();
		txtPaisDeOrigen.setColumns(10);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("");

		JLabel lblPrecio = new JLabel("Precio");

		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);

		txtNombre = new JTextField();
		txtNombre.setColumns(10);

		JLabel lblCantidad = new JLabel("Cantidad");
		
		
		

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setAlignmentY(Component.TOP_ALIGNMENT);
		btnGuardar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				miProducto.setPrecio((double) Integer.parseInt(txtPrecio.getText()));
				miProducto.setNombre(txtNombre.getText());
				miProducto.setPaisDeOrigen(txtPaisDeOrigen.getText());
				miProducto.setCodigo(Integer.parseInt(txtCodigo.getText()));

				if (rdbtnNewRadioButton.isSelected()) {

					miProducto.insertBaseDatos(miProducto);

					txtPrecio.setText("");
					txtNombre.setText("");
					txtPaisDeOrigen.setText("");
					txtCodigo.setText("");
				}
			}
		});
		
		
		
		
		

		rdbtnNewRadioButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ResultSet DatoTabla = miProducto.MostrarTabla();
				modelo.setColumnIdentifiers(new Object[] { "cantidad", "nombre", "cantidad", "pais" });

				try {

					boolean r = DatoTabla.next();

					while (r) {

						modelo.addRow(new Object[] { DatoTabla.getInt(1), DatoTabla.getString(2),
								DatoTabla.getString(3), DatoTabla.getString(4) });

						r = DatoTabla.next();
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				myTabla.setModel(modelo);
			}
		});

		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				miProducto.setPrecio((double) Integer.parseInt(txtPrecio.getText()));
				miProducto.setNombre(txtNombre.getText());
				miProducto.setPaisDeOrigen(txtPaisDeOrigen.getText());
				miProducto.setCodigo(Integer.parseInt(txtCodigo.getText()));

				if (rdbtnNewRadioButton_1.isSelected()) {

					miProducto.insertarFichero(miProducto);

					txtPrecio.setText("");
					txtNombre.setText("");
					txtPaisDeOrigen.setText("");
					txtCodigo.setText("");
				}

			}

		});
		
		

		JButton btnModificar = new JButton("Modificar");
		btnModificar.setAlignmentY(Component.TOP_ALIGNMENT);
		btnModificar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				


				miProducto.setPrecio((double) Integer.parseInt(txtPrecio.getText()));
				miProducto.setNombre(txtNombre.getText());
				miProducto.setPaisDeOrigen(txtPaisDeOrigen.getText());
				miProducto.setCodigo(Integer.parseInt(txtCodigo.getText()));

				if (rdbtnNewRadioButton.isSelected()) {

					miProducto.ModificarDatos(miProducto);

					txtPrecio.setText("");
					txtNombre.setText("");
					txtPaisDeOrigen.setText("");
					txtCodigo.setText("");
				}
				
				
				
			}
		});

		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setAlignmentY(Component.TOP_ALIGNMENT);
		btnEliminar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {


				miProducto.setPrecio((double) Integer.parseInt(txtPrecio.getText()));
				miProducto.setNombre(txtNombre.getText());
				miProducto.setPaisDeOrigen(txtPaisDeOrigen.getText());
				miProducto.setCodigo(Integer.parseInt(txtCodigo.getText()));

				if (rdbtnNewRadioButton.isSelected()) {

					miProducto.insertBaseDatos(miProducto);

					txtPrecio.setText("");
					txtNombre.setText("");
					txtPaisDeOrigen.setText("");
					txtCodigo.setText("");
				}
				
			}
		});
		
		

		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setAlignmentY(Component.TOP_ALIGNMENT);

		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		textBuscar = new JTextField();
		textBuscar.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();

		JLabel labelTxt = new JLabel("Txt");
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(410, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblInsertar)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(txtCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(26)
									.addComponent(btnModificar)))
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(48)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblPrecio)
										.addComponent(lblCantidad))
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(txtPaisDeOrigen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtPrecio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnLimpiar, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
										.addComponent(rdbtnNewRadioButton_1))
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(28)
									.addComponent(btnEliminar)))
							.addGap(130))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblBbddl)
								.addComponent(rdbtnNewRadioButton))
							.addGap(73)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(6)
									.addComponent(textBuscar, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
								.addComponent(btnBuscar))
							.addGap(70)
							.addComponent(labelTxt)
							.addGap(7))
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE))
					.addGap(223))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(37)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 405, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(380, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblBbddl)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnNewRadioButton))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnBuscar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textBuscar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(labelTxt)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdbtnNewRadioButton_1)
							.addGap(6)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblInsertar, Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(9)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPrecio)
								.addComponent(txtPrecio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblNewLabel_1)
									.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblCantidad))
							.addGap(38)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnGuardar)
								.addComponent(btnModificar)
								.addComponent(btnEliminar)
								.addComponent(btnLimpiar)))
						.addComponent(txtPaisDeOrigen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
					.addGap(31))
		);
		myTabla = new JTable(modelo);
		scrollPane.setViewportView(myTabla);
		myTabla.setModel(modelo);
		panel.setLayout(gl_panel);

	}
}
