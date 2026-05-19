package cl.tarea2.model.reunion;

import cl.tarea2.model.persona.Participante;

/**
 * Representa la asistencia de un participante a una reunión.
 * <p>
 * Una asistencia puede tener asociado un retraso si el participante llegó
 * después de la hora establecida.
 */
public class Asistencia {
    private Participante participante;
    private Retraso retraso;

    /**
     * Crea una nueva asistencia asociada a un participante y, opcionalmente,
     * a un retraso.
     *
     * @param participante participante que asistió a la reunión
     * @param retraso retraso asociado a la asistencia, o {@code null} si no hubo retraso
     */
    public Asistencia(Participante participante, Retraso retraso) {
        this.participante = participante;
        this.retraso = retraso;
    }

    /**
     * Obtiene el participante asociado a esta asistencia.
     *
     * @return participante que asistió
     */
    public Participante getParticipante(){
        return this.participante;
    }

    /**
     * Obtiene el retraso asociado a esta asistencia.
     *
     * @return retraso del participante, o {@code null} si no tuvo retraso
     */
    public Retraso getRetraso(){
        return this.retraso;
    }

    /**
     * Modifica el retraso asociado a esta asistencia.
     *
     * @param retraso nuevo retraso, o {@code null} si no existe retraso
     */
    public void setRetraso(Retraso retraso){
        this.retraso = retraso;
    }

    /**
     * Modifica el participante asociado a esta asistencia.
     *
     * @param participante nuevo participante asistente
     */
    public void setParticipante(Participante participante){
        this.participante = participante;
    }

    /**
     * Retorna una representación en texto de la asistencia.
     *
     * @return descripción de la asistencia, incluyendo el retraso si corresponde
     */
    @Override
    public String toString(){
        if(this.retraso == null) {
            return "Asistencia de "+this.participante.getNombreCompleto();
        }
        else{
            return "Asistencia de "+this.participante.getNombreCompleto()+" con retraso de "+this.retraso.getHora().toString();
        }
    }
}
