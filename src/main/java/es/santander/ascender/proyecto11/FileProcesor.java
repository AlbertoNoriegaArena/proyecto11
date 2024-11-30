package es.santander.ascender.proyecto11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProcesor implements IFileProcesor {

    @Override

    public String leerFile(String filePath) throws IOException {
    
        // Files.readString => Reads all content from a file into a string, decoding from bytes to characters using the UTF-8
        return Files.readString(Paths.get(filePath));
    }

@Override
public String eliminarVocales(String input) {

    if (input == null || input.isEmpty()) {
        return ""; 
    }
    
    char[] vocales = {'a', 'e', 'i', 'o', 'u' , 'A', 'E', 'I', 'O', 'U'}; 

    // StringBuilder permite modificar su contenido sin crear nuevos objetos en cada operación
    StringBuilder resultado = new StringBuilder();

    for (int i = 0; i < input.length(); i++) {
        boolean vocal = false;
        char caracter = input.charAt(i);
        for (int j = 0; j < vocales.length; j++) {
            if (caracter == vocales[j]) {
                vocal = true;
                break;
            }
        }
        // Si el caracter no es una vocal se añade a resultado
        if (vocal == false) {
            resultado.append( caracter);
        }
    }

    //  el método toString() de la clase StringBuilder convierte su contenido en un objeto String
    return resultado.toString();
}

    @Override
    public void escribirAFile(String filePath, String content) throws Exception {
        // Files.writeString => escribir el contenido en el archivo. Characters are encoded into bytes using the UTF-8
        Files.writeString(Path.of(filePath), content);
    }

}
