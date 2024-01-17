
package tareas.gestortareas;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Yago
 */


public interface GestorTareasInterface {

//Posee las funcionalidades de la aplicacion y los parametros que necesita

    void agregarTarea(String descripcion, Date fechaVencimiento, Date recordatorio, int prioridad);
    void editarTarea(int indice, String descripcion, Date fechaVencimiento, Date recordatorio, int prioridad);
    void eliminarTarea(int indice);
    List<Tarea> obtenerTareas();
    List<Tarea> listarTareasPendientes();
    void recordarTareas();
    void guardarTareasEnArchivo();
    void cargarTareasDesdeArchivo();
}
