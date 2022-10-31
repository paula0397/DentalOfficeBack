package Main.Entidades;

public class Odontologo extends Usuario {


    private String matricula;

    public Odontologo(Integer ID, String nombre, String apellido, String mail, String contrasenia, String matricula) {
        super(ID, nombre, apellido, mail, contrasenia);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
