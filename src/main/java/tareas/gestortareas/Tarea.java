
package tareas.gestortareas;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author Yago
 */


// La clase tarea presenta la estructura del sistema, los datos principales a hacer gestionados

public class Tarea {
    
    private String descripcion;
    private Date fechaVencimiento;
    private Date recordatorio;
    private int prioridad;

    public Tarea(String descripcion, Date fechaVencimiento, Date recordatorio, int prioridad) {
        this.descripcion = descripcion;
        this.fechaVencimiento = fechaVencimiento;
        this.recordatorio = recordatorio;
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Date getRecordatorio() {
        return recordatorio;
    }

    public int getPrioridad() {
        return prioridad;
    }
    
    
//Permite devolver una cadena a la lista al cargar las tareas, asimismo se formatea la fecha
    @Override
    public String toString() {
         SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String recordatorioFormateado = dateFormat.format(fechaVencimiento);
        return  descripcion +"  "+ recordatorioFormateado +"  "+prioridad;
    }

 
}
