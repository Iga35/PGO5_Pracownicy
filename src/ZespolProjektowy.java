import java.util.ArrayList;

public class ZespolProjektowy{
    private String nazwaProjektu;
    private ArrayList<Pracownik> pracownicy;

    public ZespolProjektowy(String nazwaProjektu){
        this.nazwaProjektu = nazwaProjektu;
        this.pracownicy = new ArrayList<>();
    }

    public void dodajPracownika(Pracownik p){
        pracownicy.add(p);
    }

    public void wypiszSkladZespolu(){
        System.out.println("Skład zespołu projektu: " + nazwaProjektu + " ---");
        for (Pracownik p : pracownicy){   // Polimorfizm-sam wie co wywaołać ma
            System.out.println(p);
        }
    }

    public double policzLacznyKoszt(){
        double suma = 0;
        for (Pracownik p : pracownicy){
            suma += p.obliczKosztMiesieczny(); // Polimorfizm
        }
        return suma;
    }

    public void wypiszProgramistow(){
        System.out.println("--- Lista Programistów (użycie instanceof) ---");
        for (Pracownik p : pracownicy){

            if (p instanceof Programista){

                Programista prog = (Programista) p; // rzutowanie
                System.out.println(prog.getImie() + " pisze w " + prog.przedstawSie());

            }
        }
    }
}