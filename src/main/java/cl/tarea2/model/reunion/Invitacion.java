package cl.tarea2.model.reunion;

import cl.tarea2.model.persona.Participante;
import java.time.LocalTime;

/**
 * Representa una invitación realizada a un participante para asistir a una reunión.
 * <p>
 * Cada invitación contiene el participante invitado y la hora asociada a dicha invitación.
 */
public class Invitacion {
    private Participante participante;
    private LocalTime hora;

    /**
     * Crea una nueva invitación para un participante en una hora determinada.
     *
     * @param participante participante invitado a la reunión
     * @param hora hora de la invitación
     */
    public Invitacion(Participante participante, LocalTime hora) {
        this.participante = participante;
        this.hora = hora;
    }

    /**
     * Obtiene el participante invitado.
     *
     * @return participante asociado a la invitación
     */
    public Participante getParticipante(){
        return this.participante;
    }

    /**
     * Obtiene la hora de la invitación.
     *
     * @return hora asociada a la invitación
     */
    public LocalTime getHora(){
        return this.hora;
    }

    /**
     * Modifica la hora de la invitación.
     *
     * @param hora nueva hora de la invitación
     */
    public void setHora(LocalTime hora){
        this.hora = hora;
    }

    /**
     * Modifica el participante asociado a la invitación.
     *
     * @param participante nuevo participante invitado
     */
    public void setParticipante(Participante participante){
        this.participante = participante;
    }

    /**
     * Retorna una representación en texto de la invitación.
     *
     * @return descripción de la invitación
     */
    @Override
    public String toString(){
        return "Invitacion de "+this.participante.getNombreCompleto()+" a las "+this.hora.toString();
    }
}
