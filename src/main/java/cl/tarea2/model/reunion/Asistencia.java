package cl.tarea2.model.reunion;

import cl.tarea2.model.persona.Participante;

public class Asistencia {
    private Participante participante;
    private Retraso retraso;
    public Asistencia(Participante participante, Retraso retraso) {
        this.participante = participante;
        this.retraso = retraso;
    }
    public Participante getParticipante(){
        return this.participante;
    }
    public Retraso getRetraso(){
        return this.retraso;
    }
    public void setRetraso(Retraso retraso){
        this.retraso = retraso;
    }
    public void setParticipante(Participante participante){
        this.participante = participante;
    }
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
