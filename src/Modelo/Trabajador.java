package Modelo;

public class Trabajador {
    private String usuario;
    private String correo;
    private String contraseña;

    public Trabajador(){}
    public Trabajador(String usuario, String correo, String contraseña)
    {
        this.usuario = usuario;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }
}
