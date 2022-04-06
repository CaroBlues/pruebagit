package Model;

import java.util.List;

public class UsuarioVO {

    String direccion,email,nombre,contraseña,foto,rutafav;

    public UsuarioVO(String nombre, String contraseña) {
        this.direccion = "casa";
        this.email = "email@email";
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.foto = "foto";
        this.rutafav = "rutafav";
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getRutafav() {
        return rutafav;
    }

    public void setRutafav(String rutafav) {
        this.rutafav = rutafav;
    }

    @Override
    public String toString() {
        return "UsuarioVO{" +
                "direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", nombre='" + nombre + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", foto='" + foto + '\'' +
                ", rutafav='" + rutafav + '\'' +
                '}';
    }
}
