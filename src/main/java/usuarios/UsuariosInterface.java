/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package usuarios;

/**
 *
 * @author Yago
 */
import java.util.List;

public interface UsuariosInterface {
    void crearUsuario(String nombre, String contraseña, String tipoUsuario);
    void asignarTipoUsuario(String nombreUsuario, String tipoUsuario);
    void editarUsuario(String nombreUsuario,String nombreNuevo, String nuevaContraseña, String nuevoTipoUsuario);
    void eliminarUsuario(String nombreUsuario);
    boolean login(String nombreUsuario, String contraseña, String tipoUsuario);
    List<Usuarios> obtenerUsuarios();
     List<Usuarios> cargarUsuariosDesdeArchivo();
}
