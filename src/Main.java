public class Main {
    public static void main(String[] args)
    {

        RownanieLiniowe row1 = new RownanieLiniowe();
        row1.rozwiaz();

        RownanieKwadratowe row2 = new RownanieKwadratowe();
        row2.rozwiaz();
    }

}

abstract class Rownanie
{
    //
    protected double[] d;
    protected double[] rozwiazania;
    protected int iloscRozwiazan; // 0, 1, nieskończenie
    //

    Rownanie(int ilosc_wej, int ilosc_wyj)
    {
        d = new double[ilosc_wej];
        rozwiazania = new double[ilosc_wyj];
    }

    private void wprowadzDane()
    {
        int a = 0; // do szybkiej zmiany ilości wejść
        d[0] = 4;
        d[1] = 2;
        if(a!=0)
        {
            d[2] = 4;
            d[3] = 2;
        }
    }

    private void wypiszWynik(int iloscRozwiazan)
    {
        if(iloscRozwiazan==0)
        System.out.println("Rownanie nie ma rozwiazań!");
        else if(iloscRozwiazan==1)
            System.out.println("Rozwiązaniem równania " + d[0] + "x + " + d[1] + " = 0; jest: " + -d[1]/d[0]);
        else if(iloscRozwiazan==2)
            System.out.println("dozrobienia");
        else System.out.println("coś poszło nie tak");
    }

    abstract protected int rozwiazanie();

    final void rozwiaz()
    {
        wprowadzDane();
        iloscRozwiazan = rozwiazanie();
        wypiszWynik(iloscRozwiazan);
    }
}
