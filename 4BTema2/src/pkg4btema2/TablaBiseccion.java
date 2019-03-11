/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4btema2;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alvarado
 */
public class TablaBiseccion extends AbstractTableModel{
    private String columnas[]={"i","xi","xs","xr","fxi","fxs","fxr","error"};
    private ArrayList<IteracionBiseccion> lista;

    public TablaBiseccion(ArrayList<IteracionBiseccion> lista) {
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        //To change body of generated methods, choose Tools | Templates.
    
      return this.lista.size();
    }

    @Override
    public int getColumnCount() {
         //To change body of generated methods, choose Tools | Templates.
   
       return this.columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      //To change body of generated methods, choose Tools | Templates.
    
     IteracionBiseccion fila = this.lista.get(rowIndex);
     switch(columnIndex){
         case 0: return fila.getI();
         case 1: return fila.getXi();
         case 2: return fila.getXs();
         case 3: return fila.getXr();
     
     }
     return null;
     
    }

    @Override
    public String getColumnName(int column) {
        return this.columnas[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
