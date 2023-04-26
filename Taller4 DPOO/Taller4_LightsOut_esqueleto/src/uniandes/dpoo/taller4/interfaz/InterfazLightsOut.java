package uniandes.dpoo.taller4.interfaz;

import java.awt.BorderLayout;
import java.io.FileNotFoundException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import uniandes.dpoo.taller4.modelo.*;

public class InterfazLightsOut extends JFrame{

	private Tablero modelo;
	private PanelOpcionesTablero panelArriba;
	private PanelTablero panelCentro;
	private PanelOpcionJuego panelDerecha;
	private PanelInfoJugador panelAbajo;
	
	
	public InterfazLightsOut() {
		try {
			modelo = new Tablero(5);
		}
		catch(Exception e) {
			
		}
	}

}
