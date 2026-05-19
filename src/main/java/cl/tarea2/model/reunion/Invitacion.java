package cl.tarea2.model.reunion;

import cl.tarea2.model.persona.Participante;
import java.time.LocalTime;
public class Invitacion {
    private Participante participante;
    private LocalTime hora;

    public Invitacion(Participante participante, LocalTime hora) {
        this.participante = participante;
        this.hora = hora;
    }
    public Participante getParticipante(){
        return this.participante;
    }

    public LocalTime getHora(){
        return this.hora;
    }

    public void setHora(LocalTime hora){
        this.hora = hora;
    }

    public void setParticipante(Participante participante){
        this.participante = participante;
    }

    public String toString(){
        return "Invitacion de "+this.participante.getNombreCompleto()+" a las "+this.hora.toString();
    }
}
