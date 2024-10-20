import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdjacencyList
{
    public static void main(String [] args)
    {
        ArrayList<Integer> graph[]=graphListInput();
        int i=0;
        for(ArrayList<Integer> list : graph)
        {
            System.out.println(i +"->"+list);
            i++;
        }
    }
    public static ArrayList<Integer> [] graphListInput()
    {
        ArrayList<Integer> array[]=new ArrayList[4];
        array[0]=new ArrayList<Integer>(Arrays.asList(1,2));
        array[1]=new ArrayList<Integer>(Arrays.asList(0,2,3));
        array[2]=new ArrayList<Integer>(Arrays.asList(0,1,3));
        array[3]=new ArrayList<Integer>(Arrays.asList(1,2));


        return array;

    }
}
