package cl.tarea2.model.reunion;
import java.time.LocalDate;
import java.time.LocalTime;
import cl.tarea2.model.persona.Empleado;
public class ReunionVirtual extends Reunion {
    private String enlace;
    public ReunionVirtual(TipoReunion tipoReunion, LocalDate fecha, LocalTime hora,
                             int duracionPrevista, Empleado organizador, String sala) {
        super(tipoReunion, fecha, hora, duracionPrevista, organizador);
        this.enlace = enlace;
    }
}