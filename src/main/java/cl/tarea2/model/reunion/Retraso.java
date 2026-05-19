package cl.tarea2.model.reunion;

import java.time.LocalTime;

/**
 * Representa el retraso de un participante al asistir a una reunión.
 * <p>
 * El retraso almacena la hora en que el participante llegó.
 */
public class Retraso {
    private LocalTime hora;

    /**
     * Crea un nuevo retraso con la hora indicada.
     *
     * @param hora hora de llegada del participante
     */
    public Retraso(LocalTime hora) {
        this.hora = hora;
    }

    /**
     * Obtiene la hora asociada al retraso.
     *
     * @return hora de llegada del participante
     */
    public LocalTime getHora(){
        return this.hora;
    }

    /**
     * Modifica la hora asociada al retraso.
     *
     * @param hora nueva hora de llegada
     */
    public void setHora(LocalTime hora){
        this.hora = hora;
    }

    /**
     * Retorna una representación en texto del retraso.
     *
     * @return descripción del retraso
     */
    @Override
    public String toString(){
        return "Retraso de "+this.hora.toString();
    }
}
