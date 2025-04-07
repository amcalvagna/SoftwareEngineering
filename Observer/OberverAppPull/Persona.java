public class Persona {

    private String nome;
    private String cognome;
    private String telefono;

    public Persona(String nome, String cognome, String telefono, String città) {
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
        this.città = città;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    private String città;

    

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

}
