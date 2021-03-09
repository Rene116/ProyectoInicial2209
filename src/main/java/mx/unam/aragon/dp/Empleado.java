package mx.unam.aragon.dp;

public class Empleado extends Persona{
    private int numEmpleado;
    private String departamento;
    private float sueldo;
    private int horasExtra;

    public Empleado() {
    }

    public Empleado(int numEmpleado, String departamento, float sueldo, int horasExtra) {
        this.numEmpleado = numEmpleado;
        this.departamento = departamento;
        this.sueldo = sueldo;
        this.horasExtra = horasExtra;
    }

    public Empleado(int numEmpleado, String departamento, float sueldo, int horasExtra, String nombre, String apPaterno, String apMaterno, int edad, String curp) {
        super(nombre, apPaterno, apMaterno, edad, curp);
        this.numEmpleado = numEmpleado;
        this.departamento = departamento;
        this.sueldo = sueldo;
        this.horasExtra = horasExtra;
    }
    
    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "numEmpleado=" + numEmpleado + ", departamento=" + departamento + ", sueldo=" + sueldo + ", horasExtra=" + horasExtra + '}';
    }
    
            
}
