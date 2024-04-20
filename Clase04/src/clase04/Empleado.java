/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase04;

/**
 *
 * @author Lenovo
 */
public class Empleado extends Persona{

    private String codempleado;
    private String area;
    
    public Empleado (String nombre, String apellido, int edad, String codempleado, String area){
        
        super(nombre,apellido,edad); 
    this.codempleado = codempleado;
    this.area = area;
    }
    
    
    /**
     * @return the codempleado
     */
    public String getCodempleado() {
        return codempleado;
    }

    /**
     * @param codempleado the codempleado to set
     */
    public void setCodempleado(String codempleado) {
        this.codempleado = codempleado;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }
}
