package domain;

public class Persona {

    private int id_Persona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public Persona() {
    }

    //Delete Person
    public Persona(int id_Persona) {
        this.id_Persona = id_Persona;
    }

    //Add Person
    public Persona(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    // Update Person
    public Persona(int id_Persona, String nombre, String apellido, String email, String telefono) {
        this.id_Persona = id_Persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    //Getters and Setters
    public int getId_Persona() {
        return this.id_Persona;
    }

    public void setId_Persona(int id_Persona) {
        this.id_Persona = id_Persona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{id: ").append(id_Persona);
        sb.append(", Nombre: ").append(nombre);
        sb.append(", Apellido: ").append(apellido);
        sb.append(", Email: ").append(email);
        sb.append(", Telefono: ").append(telefono);
        sb.append('}');
        sb.append('\n');
        return sb.toString();
    }

}
