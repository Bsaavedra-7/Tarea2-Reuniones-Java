package cl.tarea2.model.persona;

//usamos implements para poder tener una sola lista con Participantes e InvitadosExternos
public class InvitadoExterno implements Participante {
    private String nombreCompleto;
    private String correo;

    public InvitadoExterno(String nombreCompleto, String correo) {
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
    }

    @Override
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    @Override
    public String getCorreo() {
        return correo;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return nombreCompleto + " (" + correo + ")";
    }

}