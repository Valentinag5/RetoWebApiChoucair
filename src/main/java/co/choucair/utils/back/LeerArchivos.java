package co.choucair.utils.back;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LeerArchivos {
    private static final String RUTA_JSON = "src/main/resources/json/";

    private LeerArchivos() {
    }

    public static String obtenerJsonDelArchivo(String ruta) {
        try {
            return new String(Files.readAllBytes(Paths.get(RUTA_JSON + ruta)));
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}
