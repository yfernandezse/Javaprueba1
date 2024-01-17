/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;
import java.io.BufferedReader;
    import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestorUsuarios implements UsuariosInterface {
    private List<Usuarios> usuarios;

    public GestorUsuarios() {
        this.usuarios = new ArrayList<>();
    }

    @Override
    public void crearUsuario(String nombre, String contraseña, String tipoUsuario) {
        Usuarios nuevoUsuario = new Usuarios(nombre, contraseña, tipoUsuario);
        usuarios.add(nuevoUsuario);
        guardarUsuariosEnArchivo();
    }

    @Override
    public void asignarTipoUsuario(String nombreUsuario, String tipoUsuario) {
        for (Usuarios usuario : usuarios) {
            if (usuario.getNombre().equals(nombreUsuario)) {
                usuario.setTipoUsuario(tipoUsuario);
                break;
            }
        }
        guardarUsuariosEnArchivo();
    }

    @Override
    public void editarUsuario(String nombreUsuario, String nuevoNombre, String nuevaContraseña, String nuevoTipoUsuario) {
        for (Usuarios usuario : usuarios) {
            if (usuario.getNombre().equals(nombreUsuario)) {
                usuario.setNombre(nuevoNombre);
                usuario.setContraseña(nuevaContraseña);
                usuario.setTipoUsuario(nuevoTipoUsuario);
                break;
            }
        }
        guardarUsuariosEnArchivo();
    }

    @Override
    public void eliminarUsuario(String nombreUsuario) {
        usuarios.removeIf(usuario -> usuario.getNombre().equals(nombreUsuario));
        guardarUsuariosEnArchivo();
    }

   @Override
public boolean login(String nombreUsuario, String contraseña, String tipoUsuario) {
    // Implementar lógica de inicio de sesión
    for (Usuarios usuario : usuarios) {
        if (usuario.getNombre().equals(nombreUsuario) && usuario.getContraseña().equals(contraseña)) {
            if (usuario.getTipoUsuario().equals(tipoUsuario)) {
                // Verificar el tipo de usuario
                if (tipoUsuario.equals("administrativo")) {
                    mostrarMenuAdministrativo();
                } else if (tipoUsuario.equals("estudiante")) {
                    mostrarMenuEstudiante();
                }
                return true; // Credenciales correctas y tipo de usuario válido
            } else {
                System.out.println("Tipo de usuario incorrecto");
                return false; // Tipo de usuario incorrecto
            }
        }
    }
    System.out.println("Credenciales incorrectas");
    return false; // Credenciales incorrectas
}

private void mostrarMenuAdministrativo() {
    // Lógica para mostrar el menú de administrativo
    System.out.println("Bienvenido, administrativo!");
}

private void mostrarMenuEstudiante() {
    // Lógica para mostrar el menú de estudiante
    System.out.println("Bienvenido, estudiante!");
}

    @Override
    public List<Usuarios> obtenerUsuarios() {
        return new ArrayList<>(usuarios);
    }
    

    private void guardarUsuariosEnArchivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:/usuarios/usuarios.txt"))) {
            for (Usuarios usuario : usuarios) {
                writer.write(usuario.getNombre() + "," + usuario.getContraseña() + "," + usuario.getTipoUsuario());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
     @Override
    public List<Usuarios> cargarUsuariosDesdeArchivo() {
        List<Usuarios> usuariosCargados = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("C:/usuarios/usuarios.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String nombre = parts[0];
                    String contraseña = parts[1];
                     String tipoUsuario = parts[2];
                    Usuarios usuario = new Usuarios(nombre, contraseña, tipoUsuario);
                    usuariosCargados.add(usuario);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return usuariosCargados;
    }
}
