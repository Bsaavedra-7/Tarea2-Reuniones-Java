package cl.tarea2.model.departamento;

import java.util.ArrayList;
import java.util.List;
import cl.tarea2.model.persona.Empleado;

public class Departamento {
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public int getCantidadEmpleados() {
        return empleados.size();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Departamento{nombre='" + nombre + "', cantidadEmpleados=" + getCantidadEmpleados() + '}';
    }
}