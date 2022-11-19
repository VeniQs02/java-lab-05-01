public class Main {
    public static void main(String[] args)
    {

        RownanieLiniowe row = new RownanieLiniowe();

    }

}

abstract class Rownanie
{
    protected double[] dane;
    protected double[] rozwiazania;
    protected int iloscRozwiazan; // 0, 1, nieskończenie
    Rownanie(int ilosc_wej,int ilosc_wyj)
    {
        dane = new double[ilosc_wej];
    }
    private void wprowadzDane()
    {
        dane[0] = 4;
        dane[1] = 2;
    }
    private void wypiszWynik()
    {
        System.out.println();
    }
    abstract protected int rozwiazanie();
    final void rozwiaz()
    {
        wprowadzDane();
        iloscRozwiazan = rozwiazanie();
        wypiszWynik();
    }
}

class RownanieLiniowe extends Rownanie
{
    RownanieLiniowe()
    {
        super(2, 1);
    }


    public int rozwiazanie()
    {
        return 0;
    }
}

class RownanieKwadratowe extends Rownanie
{
    RownanieKwadratowe()
    {
        super(6, 2);
    }


    public int rozwiazanie()
    {
        return 0;
    }
}
