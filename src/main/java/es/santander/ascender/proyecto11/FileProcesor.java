package es.santander.ascender.proyecto11;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProcesor implements IFileProcesor {

    @Override

    public String leerFile(String filePath) throws IOException {
    
        return Files.readString(Paths.get(filePath));
    }

    @Override
    public String eliminarVocales(String input) {

        char [] vocales = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < vocales.length; j++) {
                if (input.charAt(i) == vocales[j]) {
                    
                }
            }
        }

        return;
    }

    @Override
    public void escribirAFile(String filePath, String content) throws Exception {
        // Files.writeString => escribir el contenido en el archivo
        Files.writeString(Path.of(filePath), content);
    }

}
