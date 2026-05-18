package cl.tarea2.model.informe;
import cl.tarea2.model.persona.Empleado;
import java.nio.file.*;
import java.io.*;
import cl.tarea2.model.reunion.*; //Importa todas las clases de reunion
import java.util.List;

public class Informe {
            //El informe debe proporcionar al menos:
// Fecha y hora de la reunión
// Horas de inicio y fin, y duración total
// Información sobre el tipo de reunión
// Enlace o sala
// Lista de participantes y información sobre retrasos
// Todas las notas relacionadas con la reunión (ordenadas
//cronológicamente)

    private String tiempoReal;
    private String totalAsistencias;
    private String porcentajeAsistencias;
    private String fecha;
    private String hora;
    private String horaInicio;
    private String horaFin;
    private String nombreReunion;
    private Path nombreDirectorio;

    public Informe(Reunion ref, String nombreReunion) {//ref es la referencia a la reunion

//-------------------------------------------------------------
        //Los getters para el tiempo, el porcentaje y el total de asistencia no son String
        //Por lo tanto hemos de convertirlos a String, sin embargo, este proceso puede ser "peligroso"
        //Por ello, ha futuro hemos de considerar manjear excepciones aqui, es decir, usar un try

        tiempoReal = String.valueOf(ref.calcularTiempoReal());
        totalAsistencias = String.valueOf(ref.obtenerTotalAsistencia());
        porcentajeAsistencias = String.valueOf(ref.obtenerPorcentajeAsistencia());
        hora = String.valueOf(ref.obtenerHora());
        horaInicio = String.valueOf(ref.obtenerHoraInicio());
        horaFin = String.valueOf(ref.obtenerHoraFin());
        fecha = String.valueOf(ref.obtenerFecha());
        this.nombreReunion = nombreReunion;
        //Intentar asignar la direccion de la carpeta en donde se quiere crear el archivo
        this.nombreDirectorio = Paths.get("./" + nombreReunion + ".txt");
    }

    public void crearNuevoInforme(){
        Files.createFile(nombreDirectorio); //Creamos el archivo
        Files.write(nombreDirectorio, nombreReunion.getBytes());
    }

}