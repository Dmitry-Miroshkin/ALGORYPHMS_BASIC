package HomeWork.Lesson7;

public class MainClass {
    public static void main(String[] args) {
        Graph graph = new Graph(10);

        graph.addEdge(1,2);
        graph.addEdge(0,4);
        graph.addEdge(1,4);
        graph.addEdge(3,6);
        graph.addEdge(7,8);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(4,3);
        graph.addEdge(5,2);
        graph.addEdge(6,7);
        graph.addEdge(9,3);


        System.out.println(graph.getAdjList(2));
        System.out.println(graph.getEdgeCount());
        System.out.println(graph.getVertexCount());

        BreadthFirstPath bfp = new BreadthFirstPath(graph, 2);
        System.out.println(bfp.hasPathTo(4));
        System.out.println(bfp.hasPathTo(8));
        System.out.println(bfp.pathTo(8));



    }
}
