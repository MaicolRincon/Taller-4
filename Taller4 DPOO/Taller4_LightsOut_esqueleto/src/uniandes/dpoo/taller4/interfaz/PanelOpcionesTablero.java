package uniandes.dpoo.taller4.interfaz;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PanelOpcionesTablero extends JPanel implements ActionListener{
	
	
	private JLabel lblTamaño;
	
	private JTextField txtTamaño;
	
	private JLabel lblDificultad;
	
	private InterfazLightsOut principal;
	
	private ButtonGroup grupo;
	
	private JRadioButton radioFacil;
	
	private JRadioButton radioMedio;
	
	private JRadioButton radioDificil;
	
	private JComboBox comboTamaño;
	
	
	public PanelOpcionesTablero(InterfazLightsOut principal) {
		
		comboTamaño = new JComboBox();
		comboTamaño.setPreferredSize(new Dimension(70,20));
		comboTamaño.addActionListener(this);
		lblTamaño = new JLabel("Tamaño:  ");
		GridBagConstraints constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 0;
        constraint.fill = GridBagConstraints.BOTH;
        constraint.insets = new Insets( 5, 20, 5, 20 );
        add( comboTamaño, constraint );
		
		grupo = new ButtonGroup();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
