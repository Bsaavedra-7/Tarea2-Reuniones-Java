package cl.tarea2.model.reunion;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

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
}