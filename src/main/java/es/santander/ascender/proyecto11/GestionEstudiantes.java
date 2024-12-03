package es.santander.ascender.proyecto11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GestionEstudiantes implements IGestionEstudiantes {

    // Hash table based implementation of the Map interface. This implementation provides all of the optional map operations, and permits null values and the null key. 
     // Map => nombre como clave, calificacion como valor
    private Map<String, Integer> estudiantes = new HashMap<>();


    //GETTERS Y SETTERS
    public Map<String, Integer> getEstudiantes() {
        return estudiantes;
    }


    public void setEstudiantes(Map<String, Integer> estudiantes) {
        this.estudiantes = estudiantes;
    }


    @Override
    public boolean agregarEstudiante(String nombre, int calificacion) {
        
        // containsKey => Returns true if this map contains a mapping for the specified key.
        if (estudiantes.containsKey(nombre)) {
            return false; // el metodo tiene que devolver un boolean
        }
    
        //put => Associates the specified value with the specified key in this map.
        estudiantes.put(nombre, calificacion);
        return true; // estudiante agregado al map
    }
    

    @Override
    public Integer obtenerCalificacion(String nombre) {
        return estudiantes.get(nombre);
    }

    @Override
    public Map<String, Integer> obtenerEstudiantesYCalificaciones() {
        
        // Devuelvo el mapa original
        // return this.getEstudiantes();

        //Si se quisiera pasar una copia para que no modifique el mapa original
        //Es mejor pasar una copia para que desde fuera no se pueda acceder al original
        return new HashMap<>(this.getEstudiantes());
    }

    @Override
    public boolean existeEstudiante(String nombre) {

        if (estudiantes.containsKey(nombre)) {
            return true; 
        }
        return false;
    }

    @Override
    public boolean eliminarEstudiante(String nombre) {
        
        if (estudiantes.containsKey(nombre)) {
            estudiantes.remove(nombre);
            return true; // Estudiante eliminado
        }
        return false; // Estudiante no encontrado
    }

    @Override
    public void agregarEstudiantes(Set<String> nuevosEstudiantes, Map<String, Integer> nuevasCalificaciones) {
        
        // Compruebo que los estudiantes a introducir no existan ya
        for (String nombreEstudianteAgregar : nuevosEstudiantes) {
            if(estudiantes.containsKey(nombreEstudianteAgregar) == false ){
                // Si no existe, la añade
                estudiantes.put(nombreEstudianteAgregar, nuevasCalificaciones.get(nombreEstudianteAgregar));
            }
        }
    }
    
}
