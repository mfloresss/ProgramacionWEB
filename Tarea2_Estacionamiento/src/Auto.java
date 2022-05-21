public class Auto {
    static final String MERCEDEZ_BENZ = "Mercedes Benz";
    static final String FIAT = "FIAT";
    static final String BMW = "BMW";
    static final String AUDI = "Audi";
    static final String TOYOTA = "TOYOTA";
    static final String PEUGEOT = "PEUGEOT";

    private String marca;
    private String matricula;
    private Persona persona;

    public Auto(String marca, String matricula, Persona persona) {
        this.marca = marca;
        this.matricula = matricula;
        this.persona = persona;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

}