package cl.tarea2.model.informe;
import cl.tarea2.model.persona.Empleado;
import java.nio.file.*;
import java.io.*;
import cl.tarea2.model.reunion.*; //Importa todas las clases de reunion
import java.util.List;

public class ManejarArchivos{
    private Path nombreDirectorio;
	public ManejarArchivos(String nombreDirectorio){
		//Intentar asignar la direccion de la carpeta en donde se quiere crear el archivo
        this.nombreDirectorio = Paths.get("./" + nombreReunion + ".txt");

	}

    public void crearNuevoArchivo(){
        Files.createFile(nombreDirectorio); //Creamos el archivo
        Files.write(nombreDirectorio, nombreReunion.getBytes());
    }
}