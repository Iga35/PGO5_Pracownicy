public class Tester extends Pracownik{
    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;

    public Tester(String id, String imie, String nazwisko, double stawka, boolean auto, int scenariusze){
        super(id, imie, nazwisko, stawka);
        this.czyAutomatyzujacy = auto;
        this.liczbaScenariuszy = scenariusze;
    }

    public boolean isCzyAutomatyzujacy() {
        return czyAutomatyzujacy;
    }

    public int getLiczbaScenariuszy() {
        return liczbaScenariuszy;
    }

    @Override
    public double obliczKosztMiesieczny(){
        return czyAutomatyzujacy ? getStawkaBazowa() + 1500 : getStawkaBazowa();   // warunek ? wartość_jeśli_prawda : wartość_jeśli_fałsz
    }

    @Override
    public String przedstawSie(){
        String typ = czyAutomatyzujacy ? "automatyzującym" : "manualnym";
        return "Jestem testerem " + typ + ". Przetestowałem już " + liczbaScenariuszy + " scenariuszy.";
    }

    public void uruchomRaportTestow() {
        System.out.println("Generowanie raportu dla " + liczbaScenariuszy + " przypadków testowych...");
    }
}