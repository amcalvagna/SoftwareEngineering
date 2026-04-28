public class Persona {

    private String nome;
    private String cognome;
    private String data;
    private String luogo;

    public Persona(String nome, String cognome, String data, String luogo) {
        this.nome = nome;
        this.cognome = cognome;
        this.data = data;
        this.luogo = luogo;

    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

}
