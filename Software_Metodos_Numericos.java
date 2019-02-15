/**
 * @(#)Software_Metodos_Numericos.java
 *
 *
 * @author 
 * @version 1.00 2019/2/8
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Software_Metodos_Numericos extends JFrame  {
	
	//DECLARACIÓN DE LOS MIEMBROS DE LA CLASE O ATRIBUTOS
    	JTextField txtNumeroVerdadero;
    	JTextField txtNumeroAproximado;
    	JTextField txtCifra;
    	JLabel lblNumeroVerdadero;
    	JLabel lblNumeroAproximado;
    	JCheckBox chkErrAbs;
    	JCheckBox chkErrRel;
    	JCheckBox chkErrPorc;
    	JButton cmdCalcular;
    	JLabel lblEscogeError;
    	JLabel lblCifra;
    	JPanel panelReal;
    	JPanel panelAprox;
    	JPanel tiposError;
    	JRadioButton rbtrunca;
    	JRadioButton rbRedondea;
    	JPanel PanelCifras;

    public Software_Metodos_Numericos() { 	
    	
    	super ("Calculadora de Errores");
    	setSize(500, 500);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	//OBTENER PANEL DE CONTENIDO GRAFICO
    	Container contenedor = getContentPane();
    	contenedor.setLayout(new FlowLayout()); 
    	
    	//INICIALIZAMOS LOS COMPONENTES GRAFICOS
    	txtNumeroVerdadero = new JTextField(10);
    	txtNumeroAproximado = new JTextField(10);
    	txtCifra = new JTextField(10);
    	lblNumeroVerdadero = new JLabel("Numero Verdadero: ");
    	lblNumeroAproximado = new JLabel("Nuemro Aproximado: ");
    	chkErrAbs = new JCheckBox("Absoluto");
    	chkErrRel = new JCheckBox("Relativo");
    	chkErrPorc = new JCheckBox("Porcentual");
    	cmdCalcular = new JButton("CALCULAR");
    	rbtrunca = new JRadioButton("Truncado");
    	rbRedondea = new JRadioButton("Redondeado2");
    	lblCifra = new JLabel("Escoja el numero de cifras");
    	lblEscogeError = new JLabel("Escoge el error a calcular: ");
    	
    	
    	cmdCalcular.addActionListener
    	(
    		new ActionListener()
    		{
    			public void actionPerformed(ActionEvent e)
    			{
    				String datos = "";
    				double Num_Real;
    				double Num_Aprox;
    				double Error_Absoluto;
    				double Error_Relativo;
    				double Error_Porcentual;
    				
    				
    				Num_Real = Double.parseDouble(txtNumeroVerdadero.getText());
    				Num_Aprox = Double.parseDouble(txtNumeroAproximado.getText());
    				     				
    					if((Num_Real == 0))
    					{
    						datos = "El numero real no puede ser cero, pruebe con otro numero\n";
    					}
    					else
    					{   
    						 				    			    				
    						if(chkErrAbs.isSelected())
    						{
    							Error_Absoluto = Num_Real - Num_Aprox;
    							if(Error_Absoluto < 0)
    							{
    								Error_Absoluto = (-1)*(Error_Absoluto);
    							}
    							datos+= "El Error Absoluto es: " + Error_Absoluto + "\n";
    						}
    				
    						if(chkErrRel.isSelected())
    						{
    							Error_Relativo = (Num_Real - Num_Aprox)/(Num_Real);
    							if(Error_Relativo < 0)
    							{
    								Error_Relativo = (-1)*(Error_Relativo);
    							}
    					
    							datos+= "El Error Relativo es: " + Error_Relativo + "\n";
    						}
    						if(chkErrPorc.isSelected())
    						{
    							Error_Porcentual = ((Num_Real - Num_Aprox)/(Num_Real))*100;
    							if(Error_Porcentual < 0)
    							{
    								Error_Porcentual = (-1)*(Error_Porcentual);
    							}
    					
    							datos+= "El Error Porcentual es: " + Error_Porcentual + "%\n";
    						}
    					}
    				
    				
    				if((chkErrAbs.isSelected()==false)&&(chkErrRel.isSelected()==false)&&(chkErrPorc.isSelected()==false))
    				{
    					datos = "Seleccione un tipo de error a calcular\n";
    				}
    				
    				JOptionPane.showMessageDialog(null, datos);
    			}
    		}
    	);
    	
    	
    	//CREAMOS LOS PANELES    	
    	panelReal = new JPanel();
    	panelReal.setLayout(new FlowLayout());
    	panelReal.add(lblNumeroVerdadero);
    	panelReal.add(txtNumeroVerdadero);
    	
    	panelAprox = new JPanel();
    	panelAprox.setLayout(new FlowLayout());
    	panelAprox.add(lblNumeroAproximado);
    	panelAprox.add(txtNumeroAproximado);
    	
    	tiposError = new JPanel();
    	tiposError.setLayout(new FlowLayout());
    	tiposError.add(lblEscogeError);
    	tiposError.add(chkErrAbs);
    	tiposError.add(chkErrRel);
    	tiposError.add(chkErrPorc);
    	
    	PanelCifras = new JPanel();
    	PanelCifras.setLayout(new FlowLayout());
    	PanelCifras.add(lblCifra);
    	PanelCifras.add(txtCifra);
    	PanelCifras.add(rbRedondea);
    	PanelCifras.add(rbtrunca);
    	
    	
    	//AGREGAMOS LOS PANELES AL CONTENEDOR Y DESIGNAMOS LA POSICION EN LA VENTANA
    	contenedor.add(panelReal, BorderLayout.NORTH);
    	contenedor.add(panelAprox, BorderLayout.CENTER);
    	contenedor.add(tiposError, BorderLayout.CENTER);
    	contenedor.add(PanelCifras, BorderLayout.CENTER);
    	contenedor.add(cmdCalcular, BorderLayout.SOUTH);
    	
    	//HACEMOS VISIBLE AL FRAME
    	setVisible(true);
    	
    	//PARA EVITAR DESACOMODOS HACEMOS QUE LA VENTANA NO SEA REDIMENSIONABLE
    	setResizable(true);  	
    	
    }//FIN DEL CONSTRUCTOR
    
    public static void main (String[] args) {
    	
    	Software_Metodos_Numericos ventana = new Software_Metodos_Numericos();
}
    
}