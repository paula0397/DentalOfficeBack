package Main.Entidades;

import java.util.Date;

public class Turno {

    private Integer ID;
    private Date fechaHora;
    private Paciente paciente;
    private Odontologo odontologo;

    public Turno(){}

    public Turno(Integer ID, Date fechaHora, Paciente paciente, Odontologo odontologo) {
        this.ID = ID;
        this.fechaHora = fechaHora;
        this.paciente = paciente;
        this.odontologo = odontologo;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }
}
