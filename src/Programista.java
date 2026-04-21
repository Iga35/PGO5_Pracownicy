public class Programista extends Pracownik{
    private String glownyJezyk;
    private int liczbaRepozytoriow;

    public Programista(String id, String imie, String nazwisko, double stawka, String jezyk, int repo){
        super(id, imie, nazwisko, stawka);
        this.glownyJezyk = jezyk;
        this.liczbaRepozytoriow = repo;
    }

    @Override
    public double obliczKosztMiesieczny(){
        return getStawkaBazowa() + (liczbaRepozytoriow * 50);
    }

    @Override
    public String przedstawSie(){
        return "Jestem programistą języka:" + glownyJezyk + ", mam " + liczbaRepozytoriow + " projektów.";
    }

    public void wypiszTechnologie(){
        System.out.println("Technologie: " + glownyJezyk + ", Git, Docker.");
    }
}