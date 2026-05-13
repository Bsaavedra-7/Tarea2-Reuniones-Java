package cl.tarea2.model.reunion;
import java.time.LocalDate;
import java.time.LocalTime;
import cl.tarea2.model.persona.Empleado;
public class ReunionPresencial extends Reunion {
    private String sala;
    public ReunionPresencial(TipoReunion tipoReunion, LocalDate fecha, LocalTime hora,
                             int duracionPrevista, Empleado organizador, String sala) {
        super(tipoReunion, fecha, hora, duracionPrevista, organizador);
        this.sala = sala;
    }
}