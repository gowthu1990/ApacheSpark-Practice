import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MatryoshkaDoll
{
    private MatryoshkaDoll containedDoll;

    public MatryoshkaDoll() { }

    public MatryoshkaDoll(MatryoshkaDoll containedDoll)
    {
        this.containedDoll = containedDoll;
    }

    public int getNumberOfSmallerDolls()
    {
       int counter = 0;
       MatryoshkaDoll currentDoll = this.containedDoll;
       while(currentDoll != null)
       {
           counter = counter +1;
           currentDoll = currentDoll.containedDoll;
       }
       return counter;
    }

    public static void main(String[] args)
    {
        List<String> a = new ArrayList<String>();
        a.add("H");
        a.add("W");

        String x = a.stream().map(ss -> ss.toLowerCase())
                .collect(Collectors.joining("AND"));

        System.out.println(x);


        System.out.println(new MatryoshkaDoll().getNumberOfSmallerDolls());
    }
}