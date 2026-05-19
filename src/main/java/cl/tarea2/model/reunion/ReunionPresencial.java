package cl.tarea2.model.reunion;
import java.time.LocalDate;
import java.time.LocalTime;
import cl.tarea2.model.persona.Empleado;

/**
 * Representa una reunión presencial.
 * <p>
 * Además de los datos generales de una reunión, almacena la sala donde
 * se realizará.
 */
public class ReunionPresencial extends Reunion {
    private String sala;

    /**
     * Crea una nueva reunión presencial.
     *
     * @param tipoReunion tipo de reunión
     * @param fecha fecha programada de la reunión
     * @param hora hora programada de la reunión
     * @param duracionPrevista duración prevista en minutos
     * @param organizador empleado organizador de la reunión
     * @param sala sala donde se realizará la reunión
     */
    public ReunionPresencial(TipoReunion tipoReunion, LocalDate fecha, LocalTime hora,
                             int duracionPrevista, Empleado organizador, String sala) {
        super(tipoReunion, fecha, hora, duracionPrevista, organizador);
        this.sala = sala;
    }

    /**
     * Obtiene la sala de la reunión presencial.
     *
     * @return sala asignada
     */
    public String getSala() {
        return this.sala;
    }

    /**
     * Modifica la sala de la reunión presencial.
     *
     * @param sala nueva sala asignada
     */
    public void setSala(String sala) {
        this.sala = sala;
    }

    /**
     * Retorna una representación en texto de la reunión presencial.
     *
     * @return información de la reunión incluyendo la sala
     */
    @Override
    public String toString() {
        return super.toString() + "\nSala: " + this.sala;
    }
}