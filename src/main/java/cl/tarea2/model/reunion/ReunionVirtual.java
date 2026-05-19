package cl.tarea2.model.reunion;
import java.time.LocalDate;
import java.time.LocalTime;
import cl.tarea2.model.persona.Empleado;

/**
 * Representa una reunión virtual.
 * <p>
 * Además de los datos generales de una reunión, almacena el enlace de acceso
 * a la reunión virtual.
 */
public class ReunionVirtual extends Reunion {
    private String enlace;

    /**
     * Crea una nueva reunión virtual.
     *
     * @param tipoReunion tipo de reunión
     * @param fecha fecha programada de la reunión
     * @param hora hora programada de la reunión
     * @param duracionPrevista duración prevista en minutos
     * @param organizador empleado organizador de la reunión
     * @param enlace enlace de acceso a la reunión virtual
     */
    public ReunionVirtual(TipoReunion tipoReunion, LocalDate fecha, LocalTime hora,
                          int duracionPrevista, Empleado organizador, String enlace) {
        super(tipoReunion, fecha, hora, duracionPrevista, organizador);
        this.enlace = enlace;
    }

    /**
     * Obtiene el enlace de la reunión virtual.
     *
     * @return enlace de acceso
     */
    public String getEnlace() {
        return this.enlace;
    }

    /**
     * Modifica el enlace de la reunión virtual.
     *
     * @param enlace nuevo enlace de acceso
     */
    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    /**
     * Retorna una representación en texto de la reunión virtual.
     *
     * @return información de la reunión incluyendo el enlace
     */
    @Override
    public String toString() {
        return super.toString() + "\nEnlace: " + this.enlace;
    }
}