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
	
	
	private JLabel lblTama�o;
	
	private JTextField txtTama�o;
	
	private JLabel lblDificultad;
	
	private InterfazLightsOut principal;
	
	private ButtonGroup grupo;
	
	private JRadioButton radioFacil;
	
	private JRadioButton radioMedio;
	
	private JRadioButton radioDificil;
	
	private JComboBox comboTama�o;
	
	
	public PanelOpcionesTablero(InterfazLightsOut principal) {
		
		comboTama�o = new JComboBox();
		comboTama�o.setPreferredSize(new Dimension(70,20));
		comboTama�o.addActionListener(this);
		lblTama�o = new JLabel("Tama�o:  ");
		GridBagConstraints constraint = new GridBagConstraints( );
        constraint.gridx = 0;
        constraint.gridy = 0;
        constraint.fill = GridBagConstraints.BOTH;
        constraint.insets = new Insets( 5, 20, 5, 20 );
        add( comboTama�o, constraint );
		
		grupo = new ButtonGroup();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
