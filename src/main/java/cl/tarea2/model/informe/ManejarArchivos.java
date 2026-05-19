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

    public void escribir(String informacion){
    	informacion = informacion + "\n"; //Agregamos un salto de linea
    	Files.write(ruta, informacion.getBytes(), StandardOpenOption.APPEND); //Y escribimos la informacion    	
    }
    public void escribirLista(List<String> lista){
    	for (String elementoLista : lista){
    		Files.write(ruta, elementoLista.getBytes(), StandardOpenOption.APPEND); //Escribimos todos los String de la lista 	
        	Files.write(ruta, "\n".getBytes(), StandardOpenOption.APPEND);
    	}
    }

    public void vaciarArchivo(){
        Files.write(ruta, "".getBytes()); //Sin el StandardOpenOption.APPEND esto re-escribe lo que tenia el archivo
    }
}