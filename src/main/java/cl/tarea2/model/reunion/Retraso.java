package cl.tarea2.model.reunion;
import java.time.LocalTime;
public class Retraso {
    private LocalTime hora;

    public Retraso(LocalTime hora) {
        this.hora = hora;
    }
    public LocalTime getHora(){
        return this.hora;
    }
    public void setHora(LocalTime hora){
        this.hora = hora;
    }
    public String toString(){
        return "Retraso de "+this.hora.toString();
    }

}
