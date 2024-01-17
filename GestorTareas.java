
package tareas.proyectogestortareas;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Yago
 */


//Esta clase reutiliza las funciones dadas en la intefaz e implementa la logica de programacion
//para que funcione

public class GestorTareas implements GestorTareasInterface{
    
    //la lista permite guardar la informacion para mostrar
    private List<Tarea> listaTareas = new ArrayList<>();

    
    
    // permite añadir los registros a una lista, se crea un objeto de la clase tareas y se le pasa al
    //Arraylist
    
    @Override
    public void agregarTarea(String descripcion, Date fechaVencimiento, Date recordatorio, int prioridad) {
        Tarea nuevaTarea = new Tarea(descripcion, fechaVencimiento, recordatorio, prioridad);
        listaTareas.add(nuevaTarea);
    }

    // Recibe los mismos valores que agregar tarea, solo que se debe indicar el indice o numero de fila
    // para actualizar los datos, se verifica el tamaño de la lista y si hay algun registro
    @Override
    public void editarTarea(int indice, String descripcion, Date fechaVencimiento, Date recordatorio, int prioridad) {
        if (indice >= 0 && indice < listaTareas.size()) {
            listaTareas.set(indice, new Tarea(descripcion, fechaVencimiento, recordatorio, prioridad));
        } else {
            System.out.println("Índice de tarea no válido.");
        }
    }
    
    // Funciona de forma parecida a editar tarea, recibe un numero de fila
    // se verifica el tamaño de la lista y si existen datos

    @Override
    public void eliminarTarea(int indice) {
        if (indice >= 0 && indice < listaTareas.size()) {
            listaTareas.remove(indice);
        } else {
            System.out.println("Índice de tarea no válido.");
        }
    }

    // Permite obtener o listar las tareas
    @Override
    public List<Tarea> obtenerTareas() {
        return listaTareas;
    }
    
    // Verifica que las listas sean vigentes de lo contrario no se mostraran en la lista
    @Override
    public List<Tarea> listarTareasPendientes() {
        List<Tarea> tareasPendientes = new ArrayList<>();

        for (Tarea tarea : listaTareas) {
            if (tarea.getFechaVencimiento().compareTo(new Date()) > 0) {
                tareasPendientes.add(tarea);
            }
        }

        return tareasPendientes;
    }

    //Permite verificar si una tarea ya esta por vencerse o falta tiempo para terminarla
    @Override
    public void recordarTareas() {
        LocalTime horaActual = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        for (Tarea tarea : listaTareas) {
            if (tarea.getRecordatorio() != null) {
                // Convertir el recordatorio a LocalTime usando la zona horaria del sistema
                LocalTime horaRecordatorio = LocalDateTime
                        .ofInstant(tarea.getRecordatorio().toInstant(), ZoneId.systemDefault())
                        .toLocalTime();

                String horaFormateada = horaRecordatorio.format(formatter);

                if (horaFormateada.equals(horaActual.format(formatter))) {
                    JOptionPane.showMessageDialog(null, "¡Recordatorio! La tarea \"" + tarea.getDescripcion() + "\" está próxima a vencer.");
                }else{
                      JOptionPane.showMessageDialog(null,   tarea.getDescripcion() + " Todavia tienes tiempo de terminarla.");
                }
            }
        }}
    }
