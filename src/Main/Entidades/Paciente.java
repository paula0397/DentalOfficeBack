package Main.Entidades;

import java.util.Date;

public class Paciente extends Usuario {

    private String DNI;
    private String domicilio;
    private Date fechaAlta;

    public Paciente(Integer ID, String nombre, String apellido, String mail, String contrasenia, String DNI, String domicilio, Date fechaAlta) {
        super(ID, nombre, apellido, mail, contrasenia);
        this.DNI = DNI;
        this.domicilio = domicilio;
        this.fechaAlta = fechaAlta;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "DNI='" + DNI + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", fechaAlta=" + fechaAlta +
                '}';
    }
}
