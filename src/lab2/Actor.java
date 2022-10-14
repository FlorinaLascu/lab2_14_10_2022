package lab2;

public class Actor {
    private String prenume;

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getAnNastere() {
        return anNastere;
    }

    public void setAnNastere(int anNastere) {
        this.anNastere = anNastere;
    }

    public String getScoala() {
        return scoala;
    }

    public void setScoala(String scoala) {
        this.scoala = scoala;
    }

    public String getPrenume() {
        return prenume;
    }

    private String nume;
    int anNastere;
    public String scoala="Fara Scoala";
    public Actor(){}
    public Actor(String nume, String prenume, int anNastere)
    {
        this.nume=nume;
        this.prenume=prenume;
        this.anNastere=anNastere;
    }
    public Actor(String nume, String prenume, int anNastere, String scoala)
    {
        this.nume=nume;
        this.prenume=prenume;
        this.anNastere=anNastere;
        this.scoala=scoala;
    }
    @Override
    public String toString() {
        return "Actor{" +
                "prenume='" + prenume + '\'' +
                ", nume='" + nume + '\'' +
                ", anNastere=" + anNastere +
                ", scoala='" + scoala + '\'' +
                '}';
    }


}
