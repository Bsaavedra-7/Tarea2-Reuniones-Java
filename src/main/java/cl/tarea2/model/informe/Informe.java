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
    private String duracionPrevista;
    private String tipoReunion;

    private ManejarArchivos archivoInforme;
    private List<String> informacionAsistencia;
    private List<String> listaNotas;
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
        duracionPrevista = String.valueOf(ref.getDuracionPrevista());
        tipoReunion = String.valueOf(ref.getTipoReunion());

        this.nombreReunion = nombreReunion;

        this.archivoInforme = new ManejarArchivos();

        //********** Falta iniciar informacionAsistencia y listaNotas


        //PRIMERO VEAMOS LA LISTA CON NOTAS :)
        //Guardamos el contenido de cada nota y las enumeramos.
        List<Nota> listaNotasTemporal = ref.getNotas(); //No es necesario gardar la referencia
        int contador = 0;
        for (Nota elementoLista : listaNotasTemporal){
            contador+=1;
            listaNotas.add("Nota numero " + String.valueOf(contadorNotas) + " : " elementoLista.getContenido());
        }

        List<Asistencia> listaAsistenciasTemporal = ref.getAsistentes();
        informacionAsistencia.add("Personas que atendieron a la reunion: ");

        contador = 0;
        for (Nota elementoLista : listaAsistenciasTemporal){
            contador+=1;
            listaNotas.add(String.valueOf(contadorNotas) + ") " elementoLista.getPaticipante().getNombreCompleto() + "/n" + "    Correo: " + elementoLista.getPaticipante().getCorreo);
        }

        List<Participante> listaAusentesTemporal = ref.obtenerAusencias();
        informacionAsistencia.add("Personas que a pesar de ser invitadas no atendieron a la reunion: ");

        contador = 0;
        for (Nota elementoLista : listaAusentesTemporal){
            contador+=1;
            listaNotas.add(String.valueOf(contadorNotas) + ") " elementoLista.getNombreCompleto() + "/n" + "    Correo: " + elementoLista.getPaticipante().getCorreo);
        }

    }

    public void crearNuevoInforme(){
        archivoInforme.crearNuevoArchivo();//Creamos el archivo
    }

    public void escribirInforme(){
        archivoInforme.escribir("La reunion es de tipo: " + tipoReunion);

        archivoInforme.escribir("1.- Datos relacionados a la fecha y hora de la reunion.");
        archivoInforme.escribir("");//Salto de linea

        //IMPORTANTE:
        //           reunion tiene un metodo toString que indica fecha, hora, tipo, duracionPrevista...
        //           PERO el formato no es el ideal, a futuro, considerar cambiar el formato del toString y/o cambiar esta parte para usarlo

        archivoInforme.escribir("  - Fecha: " + fecha);
        archivoInforme.escribir("  - Hora esperada: " + hora); //??? revisar
        archivoInforme.escribir("  - Hora de inicio real: " + horaInicio);
        archivoInforme.escribir("  - Hora de fin: " + horaFin;
        archivoInforme.escribir("");//Salto de linea
        archivoInforme.escribir("  - Duracion esperada de la reunion: " + duracionPrevista);
        archivoInforme.escribir("  - Duracion real de la reunion: " + tiempoReal);
        archivoInforme.escribir("");//Salto de linea

        archivoInforme.escribir("2.- Datos relacionados a la asistencia de la reunion.");
        archivoInforme.escribir("  - Total de asistencias a la reunion: " + totalAsistencias);
        archivoInforme.escribir("  - Porcentaje de asistencias a la reunion: " + porcentajeAsistencias);
        archivoInforme.escribir("");//Salto de linea
        archivoInforme.escribir("  - Lista de personas que asistieron: ");
        archivoInforme.escribirLista(informacionAsistencia);
        archivoInforme.escribirLista(listaNotas);
    }

    public void vaciarInforme(){
        archivoInforme.vaciarArchivo();
    }

    public void reescribirInforme(){
        archivoInforme.vaciarArchivo();
        escribirInforme(); //Hacemos que el informe se escriba de nuevo
    }

    public void manejarAsistencias(List<String> listaAManejar){//copiar cada elemento de una lista a informacionAsistencia
        for (String elementoLista : listaAManejar){
            informacionAsistencia.add(elementoLista);
        }
    }

}