
package uni.sistemas.model;

import uni.sistemas.entity.PlanoCartesiano;

public class PlanoCartesianoModel {
    //constructor
    public PlanoCartesianoModel() {
    }
    //metodo para obtener distancia
    public void obtenerDistancia(PlanoCartesiano pc){
        pc.setD(Math.sqrt(Math.pow((pc.getX2()-pc.getX1()),2)+Math.pow((pc.getY2()-pc.getY1()),2)));
        
    }
    // metodo para determinar cuadrante
    public String dCuadrante(double x,double y){
        if (x>=0 && y>0){
            return "Primer Cuadrante";    
        }
        else if(x<0 && y>=0){
            return "Segundo Cuadrante";
        }
        else if(x<0 && y<0){
            return "Tercer Cuadrante";
        }
        else if(x>=0 && y <0){
            return "Cuarto Cuadrante";
        }else{
            return "0,0";
        }
    }}
