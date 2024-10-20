import java.util.*;
public class BFSTraversal
{
    public static void main(String[] args) {
        System.out.println("Breadth first traversal ... ");

        Vertex []graph=Vertex.createGraph();
        Vertex.bfsTraversal(graph);

    }

}
class Vertex
{
    int vertexno;
    boolean discoverd;
    boolean visited;
    List<Vertex> vertices=new ArrayList<>();

    public static  Vertex[] createGraph()
    {

        //establish edges
        Vertex graph[]=new Vertex[5];
        graph[0].vertices.add(graph[1]);
        graph[0].vertices.add(graph[2]);
        graph[0].vertices.add(graph[3]);

        graph[1].vertices.add(graph[4]);
        graph[1].vertices.add(graph[0]);

        graph[2].vertices.add(graph[5]);
        graph[2].vertices.add(graph[0]);

        graph[3].vertices.add(graph[5]);
        graph[3].vertices.add(graph[0]);

        graph[4].vertices.add(graph[1]);
        graph[4].vertices.add(graph[5]);

        graph[5].vertices.add(graph[4]);
        graph[5].vertices.add(graph[2]);
        graph[3].vertices.add(graph[3]);


        return graph;

    }

    public static void bfsTraversal(Vertex[] graph)
    {
        boolean[] discovered=new boolean[graph.length];
        boolean[]processed=new boolean[graph.length];
        Queue<Vertex> queue=new ArrayDeque<>();
        queue.add(graph[0]);
        while (!queue.isEmpty())
        {
            Vertex current=queue.poll();
            ArrayList<Vertex> edgelist= (ArrayList<Vertex>) current.vertices;
        }



    }
}
