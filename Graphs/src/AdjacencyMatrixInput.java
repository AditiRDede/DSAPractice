import java.util.Arrays;

public class AdjacencyMatrixInput
{
    public static void main(String [] args)
    {
        int input [][]=graphInput();
        for(int [] row : input)
        {
            System.out.println(Arrays.toString(row));
        }

    }
    public static int[][] graphInput()
    {
        int [][] graph={{0,1,1},
                        {1,0,1},
                        {1,1,0}
                        };
        return graph;
    }
}
