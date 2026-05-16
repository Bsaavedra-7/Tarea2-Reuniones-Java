package cl.tarea2.model.informe;
import cl.tarea2.model.persona.Empleado;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
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

    String tiempoReal;
    String totalAsistencias;
    String porcentajeAsistencias;




    public Informe(Reunion ref, String nombreReunion) {//ref es la referencia a la reunion

//-------------------------------------------------------------
        //Los getters para el tiempo, el porcentaje y el total de asistencia no son String
        //Por lo tanto hemos de convertirlos a String, sin embargo, este proceso puede ser "peligroso"
        //Por ello, ha futuro hemos de considerar manjear excepciones aqui, es decir, usar un try

    }
}