package jobsheet3;

public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga(int a, int t)
    {
        alas = a;
        tinggi = t;
    }
    public int hitungVolume()
    {
        return alas * tinggi;
    }
    public int hitungKeliling()
    {
        return (alas * alas) + (tinggi * tinggi);
    }
}
