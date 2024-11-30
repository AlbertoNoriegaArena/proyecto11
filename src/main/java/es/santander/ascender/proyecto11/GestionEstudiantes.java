package es.santander.ascender.proyecto11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GestionEstudiantes implements IGestionEstudiantes {

    // Hash table based implementation of the Map interface. This implementation provides all of the optional map operations, and permits null values and the null key. 
     // Map => nombre como clave, calificacion como valor
    private Map<String, Integer> estudiantes = new HashMap<>();

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerEstudiantesYCalificaciones'");
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarEstudiantes'");
    }
    
}
