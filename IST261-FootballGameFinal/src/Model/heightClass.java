package Model;

public class heightClass
{
    int feet;
    int inches;

    public heightClass(int f, int i)
    {
        feet = f;
        inches = i;
    }

    @Override
    public String toString()
    {
        return feet + "'" + inches + '"';
    }

}
