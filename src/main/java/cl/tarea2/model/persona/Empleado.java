package cl.tarea2.model.persona;


//usamos implements para poder tener una sola lista con Participantes e InvitadosExternos
public class Empleado implements Participante {

    private int id;
    private String nombre;
    private String apellido;
    private String correo;

    public Empleado(int id, String nombre, String apellido, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    //GETTERS

    @Override
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public int getId() {
        return id;
    }

    @Override
    public String getCorreo() {
        return correo;
    }


    //SETTERS

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }


    //toString es la funcion principal que se llamara cuando se llame la instacia de empleado
    @Override
    public String toString() {
        return getNombreCompleto() + " (" + correo + ")";
    }
}