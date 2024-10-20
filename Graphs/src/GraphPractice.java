import java.util.*;

class UGraph
{
    //DS that represents graph
    //map representing adjancency list : map {integer,integerlist}
    private Map<Integer,List<Integer>> adjlistmap;

    //Constructor
    UGraph()
    {
        adjlistmap=new HashMap<>();
    }

    //create vertices and addEdges

    public void addEdges(int u,int v)
    {
        adjlistmap.putIfAbsent(u,new ArrayList<Integer>());
        adjlistmap.putIfAbsent(v,new ArrayList<Integer>());

        //conncet edges
        adjlistmap.get(u).add(v);
        adjlistmap.get(v).add(u);
    }
    public void displayGraph()
    {
        for(Map.Entry<Integer,List<Integer>> entry :adjlistmap.entrySet())
        {
            System.out.println(entry.getKey() + " "+entry.getValue());
        }
    }//displaygraph by entryset

    public void displayByKeySet()
    {
        for(int vertex: adjlistmap.keySet())
        {
            System.out.print(vertex+ " :");
            for(int neighbour:adjlistmap.get(vertex))
            {
                System.out.print(neighbour+ " ");
            }
            System.out.println();
        }
    }//display by key set

    public void bfsTraversal(int startvertex)
    {
        //complete processed vertex
        boolean discovery[]=new boolean[adjlistmap.size()];
        Queue<Integer> queue=new LinkedList<>();
        queue.add(startvertex);
        discovery[startvertex]=true;
        while (!queue.isEmpty())
        {
            int parentnode= queue.poll();

            for(int node : adjlistmap.get(parentnode))
            {
                if(discovery[node]!=true)
                {
                    discovery[node]=true;
                    queue.add(node);
                }
            }
            System.out.println("vertex "+parentnode +" is fully processed");
        }

    }


}
public class GraphPractice
{
    public static void main(String [] args)
    {
        System.out.println("Graph practice : graph class and BFS traversal");
        UGraph graph=new UGraph();
        graph.addEdges(0,1);
        graph.addEdges(0,2);
        graph.addEdges(0,3);
        graph.addEdges(3,2);
        graph.addEdges(1,2);
        graph.addEdges(1,3);
        graph.displayGraph();
        graph.displayByKeySet();
        graph.bfsTraversal(0);
    }
}

