package cl.tarea2.model.reunion;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;

import cl.tarea2.model.persona.Empleado;
import cl.tarea2.model.persona.Participante;
import cl.tarea2.util.Nota;

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

    public void iniciar() {
        horaInicio = LocalTime.now();
    }

    public void finalizar() {
        horaFin = LocalTime.now();
    }

    public float calcularTiempoReal(){
        return (float) Duration.between(horaInicio, horaFin).toMinutes();
    }

    public LocalDate obtenerFecha(){
        return this.fecha;
    }

    public LocalTime obtenerHora(){
        return this.hora;
    }
    
    public LocalTime obtenerHoraInicio(){
        return this.horaInicio;
    }

    public LocalTime obtenerHoraFin(){
        return this.horaFin;
    }

    public List<Asistencia> obtenerAsistentes() {
        return asistentes;
    }

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

    public List<Asistencia> obtenerRetrasos() {
        List<Asistencia> asistenciasConRetraso = new ArrayList<>();

        for (Asistencia asistencia : asistentes) {
            if (asistencia.getRetraso() != null) {
                asistenciasConRetraso.add(asistencia);
            }
        }

        return asistenciasConRetraso;
    }

    public int obtenerTotalAsistencia() {
        return asistentes.size();
    }

    public float obtenerPorcentajeAsistencia() {
        return (float) asistentes.size() / (float) invitados.size() * 100;
    }

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