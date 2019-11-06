package unam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
	//Declaramos los componentes a utilizar
	private JTextField usuarioTxtField;
	private JPasswordField contraseniaField;
	private JLabel usuarioLbl;
	private JLabel contraseniaLbl;
	private JButton botonIngresar;
	private JButton botonCrear;
	private final static String BOTON_INGRESAR = "Ingresar";
	private final static String BOTON_CREAR = "Registrar";
	
	public Login() {
		//Declaramos la ventana principal
		super();
		super.setLayout(null);
		super.setTitle("Cerradura Bluetooth");
		super.setSize(350,450);
		//Label Usuario
		this.usuarioLbl = new JLabel("Usuario:");
		this.usuarioLbl.setBounds(25,30,50,20);
		super.add(this.usuarioLbl);
		//TextField para el usuario
		this.usuarioTxtField = new JTextField(20);
		this.usuarioTxtField.setBounds(90,30,220,25);
		super.add(this.usuarioTxtField);
		//JPassword para contraseña
		this.contraseniaField = new JPasswordField(20);
		this.contraseniaField.setBounds(90,60,220,25);
		super.add(this.contraseniaField);
		//Botones de creación e ingreso
		this.botonIngresar = new JButton(BOTON_INGRESAR);
		this.botonIngresar.setBounds(60,210,100,25);
		this.botonIngresar.addActionListener(this);
		super.add(this.botonIngresar);
		
		this.botonCrear = new JButton(BOTON_CREAR);
		this.botonCrear.setBounds(190,210,100,25);
		this.botonCrear.addActionListener(this);
		super.add(this.botonCrear);
		
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == BOTON_INGRESAR) {
			if(this.usuarioTxtField.getText().equals("") || this.contraseniaField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Debe ingresar los datos de usuario y contraseña");
			}else {
				
			}
		}else if(e.getActionCommand() == BOTON_CREAR) {
			
		}
	}
	public static void main(String[] args) {
		new Login();
	}
}
