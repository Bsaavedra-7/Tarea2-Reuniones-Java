package cl.tarea2.model.informe;
import cl.tarea2.model.persona.Empleado;
import java.nio.file.*;
import java.io.*;
import cl.tarea2.model.reunion.*; //Importa todas las clases de reunion
import java.util.List;

public class ManejarArchivos{
    private Path ruta;
    private String nombreReunion;
	public ManejarArchivos(String nombreReunion){
		this.nombreReunion = nombreReunion;
		//Intentar asignar la direccion de la carpeta en donde se quiere crear el archivo
        this.ruta = Paths.get("./" + nombreReunion + ".txt");

	}

    public void crearNuevoArchivo(){
        Files.createFile(ruta); //Creamos el archivo
        Files.write(ruta, nombreReunion.getBytes());
    }
}