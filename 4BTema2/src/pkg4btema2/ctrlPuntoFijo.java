/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4btema2;

/**
 *
 * @author Edoardo
 */

import java.util.ArrayList;

public class ctrlPuntoFijo {
    
    private double xi;
    private double iteraciones;
    
    private double error;
    
    public ctrlPuntoFijo(double xi, double iteraciones, double error) {
        this.xi = xi;
        this.iteraciones = iteraciones;
        this.error = error;
    }
    
    private double getEvaluacion(double x){
        
     return Math.pow( Math.E, -(x) );
     
    }
    
    private boolean haySolucion(){
     boolean solucion=true;
     return solucion;
    
    }
    
    public ArrayList<IteracionPuntoFijo> getPuntoFijo(){
    
        int i=1;
        double errorCalculado=1;
        
        ArrayList<IteracionPuntoFijo> lista = null;
        
        if( this.haySolucion() ){
            
            lista = new ArrayList<IteracionPuntoFijo>();
            
          
            while( i < this.iteraciones && errorCalculado>this.error ){
             
              IteracionPuntoFijo fila = new IteracionPuntoFijo();
              
              fila.setI(i);
              
              fila.setXi(this.xi);
              
              fila.setFxi(this.getEvaluacion(fila.getXi()));
              
              if(i==1){
                errorCalculado=1;
              }
              
              else{
                
                  double xActual = fila.getFxi();
                  
                  
                  double xAnterior = lista.get(lista.size()-1).getFxi();
                  
                  errorCalculado =Math.abs((xActual-xAnterior)/xActual);
                  
              }
              
              fila.setError(errorCalculado);
              
              System.out.println( fila.toString());
              
              lista.add(fila);
              
              this.xi= fila.getFxi();
              
              i++;
          
          }
        }
        return lista;
        
    }
    
    public TablaPuntoFijo getTabla(){
     
        ArrayList<IteracionPuntoFijo> lista = this.getPuntoFijo();
     
        TablaPuntoFijo tabla= new TablaPuntoFijo(lista);
        
        return tabla;
    }
    
}
