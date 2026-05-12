package cl.tarea2.model.reunion;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import cl.tarea2.model.persona.Participante;

public abstract class Reunion {
    protected LocalDate fecha;
    protected LocalTime hora;
    protected int duracionPrevista;
    protected List<Participante> invitados;
}