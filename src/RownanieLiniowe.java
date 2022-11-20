class RownanieLiniowe extends Rownanie
{
    RownanieLiniowe()
    {
        super(2, 1);
    }

    public int rozwiazanie()
    {
        if(d[0]==0) return 0;
        else return 1;
    }
}