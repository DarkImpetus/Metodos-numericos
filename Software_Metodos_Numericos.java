
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Software_Metodos_numericos extends JFrame  {
	
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
    
    				

    public Software_Metodos_numericos() { 	
    	
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
    	lblNumeroAproximado = new JLabel("Numero Aproximado: ");
    	chkErrAbs = new JCheckBox("Absoluto");
    	chkErrRel = new JCheckBox("Relativo");
    	chkErrPorc = new JCheckBox("Porcentual");
    	cmdCalcular = new JButton("CALCULAR");
    	rbtrunca = new JRadioButton("Truncado");
    	rbRedondea = new JRadioButton("Redondeado");
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
    				double Cifra;
<<<<<<< HEAD
=======
    				double aux;
    				double aux2;
>>>>>>> c4618769e7b812f00088b5b191e2c57288c3fd0d
    				
    				
    				//truncar
    				
    				
    				
    				Num_Real = Double.parseDouble(txtNumeroVerdadero.getText());
    				Num_Aprox = Double.parseDouble(txtNumeroAproximado.getText());
    				Cifra = Double.parseDouble(txtCifra.getText());
    				
    				     				
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
    							
<<<<<<< HEAD
                                //inicio del redondeo y truncado(error absoluto)
=======
   //inicio del redondeo y truncado(error absoluto)
>>>>>>> c4618769e7b812f00088b5b191e2c57288c3fd0d
   
   								if ((rbRedondea.isSelected())||(rbtrunca.isSelected()))
   								{
   								
    							if(rbRedondea.isSelected())
    							{
    						
<<<<<<< HEAD
    							datos+= "el aboluto reondeado es: \n"+ redondearDecimales(Error_Absoluto,Cifra)+"\n";
    							}
    							if(rbtrunca.isSelected())
    							{
    							datos+= "el aboluto truncado es: \n"+formatearDecimales(Error_Absoluto, Cifra)+"\n";
    							}
   								}
   								//fin del proceso de redondeo y truncado(e.absoluto)
   								else
   								datos+= "El Error Absoluto es: " + Error_Absoluto + "\n";
   								
   			
=======
    							Error_Absoluto = redondearDecimales(Error_Absoluto,Cifra);
    							}
    							if(rbtrunca.isSelected())
    							{
    								aux = Error_Absoluto;
    								aux2 = redondearDecimales2(Error_Absoluto,Cifra);
    								aux = aux - aux2;
    								Error_Absoluto = Error_Absoluto - aux;
    							}
   								}
   								
   								datos+= "El Error Absoluto es: " + Error_Absoluto + "\n";
   								
   //fin del proceso de redondeo y truncado(e.absoluto)			
>>>>>>> c4618769e7b812f00088b5b191e2c57288c3fd0d
    							
    						}
    				
    						if(chkErrRel.isSelected())
    						{
    							Error_Relativo = (Num_Real - Num_Aprox)/(Num_Real);
    							if(Error_Relativo < 0)
    							{
    								Error_Relativo = (-1)*(Error_Relativo);
    							}
    					
<<<<<<< HEAD
  	                            //inicio del redondeo
=======
  	 //inicio del redondeo
>>>>>>> c4618769e7b812f00088b5b191e2c57288c3fd0d
  	 
  	 							if ((rbRedondea.isSelected())||(rbtrunca.isSelected()))
  	 							{
  	 							
    							if(rbRedondea.isSelected())
    							{
<<<<<<< HEAD
    						
    						    datos+= "el relativo redondeado es: \n"+ redondearDecimales(Error_Relativo,Cifra)+"\n";
=======
    							
    						
    								Error_Relativo = redondearDecimales2(Error_Relativo,Cifra);
>>>>>>> c4618769e7b812f00088b5b191e2c57288c3fd0d
    							}
    							//fin del proceso de redondeo
    							if(rbtrunca.isSelected())
    							{
<<<<<<< HEAD
    							datos+= "el relativo truncado es: \n"+formatearDecimales(Error_Relativo, Cifra)+"\n";
    							}
    						}
    						//fin del redondeo truncado
    						else
=======
    								aux = Error_Relativo;
    								aux2 = redondearDecimales2(Error_Relativo,Cifra);
    								aux = aux - aux2;
    								Error_Relativo = Error_Relativo - aux;	
    							}
    						}
    						
>>>>>>> c4618769e7b812f00088b5b191e2c57288c3fd0d
    						datos+= "El Error Relativo es: " + Error_Relativo + "\n";
    						}
    						if(chkErrPorc.isSelected())
    						{
    							Error_Porcentual = ((Num_Real - Num_Aprox)/(Num_Real))*100;
    							if(Error_Porcentual < 0)
    							{
    								Error_Porcentual = (-1)*(Error_Porcentual);
    							}
    							
    							if ((rbRedondea.isSelected())||(rbtrunca.isSelected()))
  	 							{
  	 							
    							if(rbRedondea.isSelected())
    							{
    							
    						
<<<<<<< HEAD
    							datos+= "el aboluto porcentual es: \n"+ redondearDecimales(Error_Porcentual,Cifra)+"\n";
    							}
    							
    							if(rbtrunca.isSelected())
    							{
    							datos+= "el porcentual truncado es: \n"+formatearDecimales(Error_Porcentual, Cifra)+"\n";
    								
    							}
    						}
    						//fin del proceso de redondeo
    						else
=======
    								Error_Porcentual = redondearDecimales2(Error_Porcentual,Cifra);
    							}
    							//fin del proceso de redondeo
    							if(rbtrunca.isSelected())
    							{
    								aux = Error_Porcentual;
    								aux2 = redondearDecimales2(Error_Porcentual,Cifra);
    								aux = aux - aux2;
    								Error_Porcentual = Error_Porcentual - aux;
    								
    							}
    						}
    						
>>>>>>> c4618769e7b812f00088b5b191e2c57288c3fd0d
    					
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
    public static double redondearDecimales(double Error_Absoluto, double Cifra) {
        /*double parteEntera, resultado;
        resultado = Error_Absoluto;
        parteEntera = Math.floor(resultado);
        resultado=(resultado-parteEntera)*Math.pow(10, Cifras);
        resultado=Math.round(resultado);
        resultado=(resultado/Math.pow(10, Cifras))+parteEntera;
        return resultado;*/
        double resultado;
        resultado = Error_Absoluto * Math.pow(10,Cifra );
        resultado = Math.round(resultado);
        resultado = resultado/Math.pow(10,Cifra);
        return resultado;
    };
    public static double redondearDecimales2(double Error_Relativo, double Cifra) {
        /*double parteEntera, resultado;
        resultado = Error_Absoluto;
        parteEntera = Math.floor(resultado);
        resultado=(resultado-parteEntera)*Math.pow(10, Cifras);
        resultado=Math.round(resultado);
        resultado=(resultado/Math.pow(10, Cifras))+parteEntera;
        return resultado;*/
        double resultado;
        resultado = Error_Relativo * Math.pow(10,Cifra );
        resultado = Math.round(resultado);
        resultado = resultado/Math.pow(10,Cifra);
        return resultado;
<<<<<<< HEAD
    };
    public static Double formatearDecimales( Double  Error_Absoluto, Double Cifra) {
    return Math.floor(Error_Absoluto * Math.pow(10, Cifra)) / Math.pow(10, Cifra);
};
    	
    public static void main (String[] args) {
    		
    	Software_Metodos_Numericos ventana = new Software_Metodos_Numericos();
=======
    }
    
    	
    public static void main (String[] args) {
    		
    	Software_Metodos_numericos ventana = new Software_Metodos_numericos();
>>>>>>> c4618769e7b812f00088b5b191e2c57288c3fd0d
}
    
}