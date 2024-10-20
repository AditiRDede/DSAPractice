import java.util.*;
class Graph
{
    private Map<Integer,List<Integer>> adjlist;

    Graph()
    {
        this.adjlist=new HashMap<>();
    }
    public void addEdges(int u , int v)
    {
        adjlist.putIfAbsent(u,new ArrayList<>());
        adjlist.putIfAbsent(v,new ArrayList<>());

        adjlist.get(u).add(v);
        adjlist.get(v).add(u);
    }
    public void displayGraph()
    {
        for(Integer u : adjlist.keySet())
        {

            System.out.println("vertex :"+u);
            for(Integer neighbour:adjlist.get(u))
            {
                System.out.print(neighbour +" ");
            }
            System.out.println();
        }
    }

    public void bfsTraversal(Graph graph,int startvertex)
    {
        boolean [] discovered=new boolean[graph.adjlist.size()];
        Queue<Integer> queue=new LinkedList<>();
        queue.add(startvertex);
        while (!queue.isEmpty())
        {
            int parentnode=queue.poll();
            discovered[parentnode]=true;
            System.out.print("Parent vertex :"+parentnode);
            System.out.print(" :childnodes {");
            for(Integer childnode : graph.adjlist.get(parentnode))
            {
                if(discovered[childnode]!=true)
                {
                    discovered[childnode]=true;
                    queue.add(childnode);
                    System.out.print(+childnode + ",");
                }

            }
            System.out.print("}");

            System.out.println("");

        }

    }//traversal :bfs
}

public class MapAdjacencyList
{
    public static void main(String [] args)
    {
        System.out.println("Graph creation and traversal ");
        Graph graph=new Graph();
        graph.addEdges(0,1);
        graph.addEdges(0,3);
        graph.addEdges(1,2);
        graph.addEdges(1,3);
        graph.addEdges(2,3);
       // graph.displayGraph();
        graph.bfsTraversal(graph,0);

    }
}