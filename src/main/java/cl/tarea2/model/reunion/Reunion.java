package cl.tarea2.model.reunion;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;

import cl.tarea2.model.persona.Empleado;
import cl.tarea2.model.persona.Participante;
import cl.tarea2.util.Nota;

/**
 * Clase abstracta que representa una reunión.
 * <p>
 * Contiene la información común para distintos tipos de reuniones, como fecha,
 * hora, tipo, organizador, duración prevista, invitados, asistentes y notas.
 * Además, permite iniciar y finalizar la reunión, calcular su duración real,
 * obtener ausencias, retrasos y estadísticas de asistencia.
 */
public abstract class Reunion {
    private TipoReunion tipoReunion;
    private LocalDate fecha;
    private LocalTime hora;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private Empleado organizador;
    private int duracionPrevista;
    private List<Invitacion> invitados;
    private List<Asistencia> asistentes;
    private List<Nota> notas;

    /**
     * Crea una nueva reunión con los datos básicos indicados.
     *
     * @param tipoReunion tipo de reunión
     * @param fecha fecha programada de la reunión
     * @param hora hora programada de la reunión
     * @param duracionPrevista duración prevista de la reunión en minutos
     * @param organizador empleado organizador de la reunión
     */
    public Reunion(TipoReunion tipoReunion, LocalDate fecha, LocalTime hora, int duracionPrevista, Empleado organizador) {
        this.tipoReunion = tipoReunion;
        this.fecha = fecha;
        this.hora = hora;
        this.duracionPrevista = duracionPrevista;
        this.organizador = organizador;
        this.invitados = new ArrayList<>();
        this.asistentes = new ArrayList<>();
        this.notas = new ArrayList<>();
    }

    /**
     * Registra la hora actual como hora de inicio de la reunión.
     */
    public void iniciar() {
        horaInicio = LocalTime.now();
    }

    /**
     * Registra la hora actual como hora de finalización de la reunión.
     */
    public void finalizar() {
        horaFin = LocalTime.now();
    }

    /**
     * Calcula la duración real de la reunión en minutos.
     *
     * @return duración real entre la hora de inicio y la hora de fin
     */
    public float calcularTiempoReal(){
        return (float) Duration.between(horaInicio, horaFin).toMinutes();
    }

    /**
     * Obtiene la fecha programada de la reunión.
     *
     * @return fecha de la reunión
     */
    public LocalDate obtenerFecha(){
        return this.fecha;
    }

    /**
     * Obtiene la hora programada de la reunión.
     *
     * @return hora de la reunión
     */
    public LocalTime obtenerHora(){
        return this.hora;
    }

    /**
     * Obtiene la hora real de inicio de la reunión.
     *
     * @return hora de inicio
     */
    public LocalTime obtenerHoraInicio(){
        return this.horaInicio;
    }

    /**
     * Obtiene la hora real de finalización de la reunión.
     *
     * @return hora de fin
     */
    public LocalTime obtenerHoraFin(){
        return this.horaFin;
    }

    /**
     * Obtiene el tipo de reunión.
     *
     * @return tipo de reunión
     */
    public TipoReunion getTipoReunion() {
        return this.tipoReunion;
    }

    /**
     * Obtiene el organizador de la reunión.
     *
     * @return empleado organizador
     */
    public Empleado getOrganizador() {
        return this.organizador;
    }

    /**
     * Obtiene la duración prevista de la reunión.
     *
     * @return duración prevista en minutos
     */
    public int getDuracionPrevista() {
        return this.duracionPrevista;
    }

    /**
     * Obtiene la lista de invitaciones de la reunión.
     *
     * @return lista de invitados
     */
    public List<Invitacion> getInvitados() {
        return this.invitados;
    }

    /**
     * Obtiene la lista de asistentes de la reunión.
     *
     * @return lista de asistencias
     */
    public List<Asistencia> getAsistentes() {
        return this.asistentes;
    }

    /**
     * Obtiene la lista de notas de la reunión.
     *
     * @return lista de notas
     */
    public List<Nota> getNotas() {
        return this.notas;
    }

    /**
     * Modifica el tipo de reunión.
     *
     * @param tipoReunion nuevo tipo de reunión
     */
    public void setTipoReunion(TipoReunion tipoReunion) {
        this.tipoReunion = tipoReunion;
    }

    /**
     * Modifica la fecha programada de la reunión.
     *
     * @param fecha nueva fecha
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * Modifica la hora programada de la reunión.
     *
     * @param hora nueva hora
     */
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    /**
     * Modifica el organizador de la reunión.
     *
     * @param organizador nuevo organizador
     */
    public void setOrganizador(Empleado organizador) {
        this.organizador = organizador;
    }

    /**
     * Modifica la duración prevista de la reunión.
     *
     * @param duracionPrevista nueva duración prevista en minutos
     */
    public void setDuracionPrevista(int duracionPrevista) {
        this.duracionPrevista = duracionPrevista;
    }

    /**
     * Modifica la lista de invitados de la reunión.
     *
     * @param invitados nueva lista de invitaciones
     */
    public void setInvitados(List<Invitacion> invitados) {
        this.invitados = invitados;
    }

    /**
     * Modifica la lista de asistentes de la reunión.
     *
     * @param asistentes nueva lista de asistencias
     */
    public void setAsistentes(List<Asistencia> asistentes) {
        this.asistentes = asistentes;
    }

    /**
     * Modifica la lista de notas de la reunión.
     *
     * @param notas nueva lista de notas
     */
    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    /**
     * Obtiene la lista de asistentes de la reunión.
     *
     * @return lista de asistencias registradas
     */
    public List<Asistencia> obtenerAsistentes() {
        return asistentes;
    }

    /**
     * Obtiene la lista de participantes invitados que no asistieron.
     * <p>
     * Recorre las invitaciones y verifica si cada participante invitado
     * aparece en la lista de asistentes.
     *
     * @return lista de participantes ausentes
     */
    public List<Participante> obtenerAusencias() {
        List<Participante> ausentes = new ArrayList<>();

        for (Invitacion invitacion : invitados) {
            Participante invitado = invitacion.getParticipante();
            boolean estaPresente = false;

            for (Asistencia asistencia : asistentes) {
                if (asistencia.getParticipante().equals(invitado)) {
                    estaPresente = true;
                    break;
                }
            }

            if (!estaPresente) {
                ausentes.add(invitado);
            }
        }

        return ausentes;
    }

    /**
     * Obtiene las asistencias que tienen un retraso asociado.
     *
     * @return lista de asistencias con retraso
     */
    public List<Asistencia> obtenerRetrasos() {
        List<Asistencia> asistenciasConRetraso = new ArrayList<>();

        for (Asistencia asistencia : asistentes) {
            if (asistencia.getRetraso() != null) {
                asistenciasConRetraso.add(asistencia);
            }
        }

        return asistenciasConRetraso;
    }

    /**
     * Obtiene el total de asistentes registrados.
     *
     * @return cantidad total de asistentes
     */
    public int obtenerTotalAsistencia() {
        return asistentes.size();
    }

    /**
     * Calcula el porcentaje de asistencia de la reunión.
     *
     * @return porcentaje de asistencia respecto al total de invitados
     */
    public float obtenerPorcentajeAsistencia() {
        if (asistentes.isEmpty()) {
            return 0;
        }
        else
        {
            return (float) asistentes.size() / (float) invitados.size() * 100;
        }
    }

    /**
     * Retorna una representación en texto de la reunión.
     *
     * @return información principal de la reunión
     */
    @Override
    public String toString() {
        return "Reunión\n" +
                "Fecha: " + fecha + "\n" +
                "Hora: " + hora + "\n" +
                "Tipo: " + tipoReunion + "\n" +
                "Organizador: " + organizador.getNombreCompleto() + "\n" +
                "Duración prevista: " + duracionPrevista + " minutos";
    }
}