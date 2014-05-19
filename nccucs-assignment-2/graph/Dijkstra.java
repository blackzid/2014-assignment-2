package ps3.graph;

public class Dijkstra <N> implements PathFinderSpecializer<N> {

    private AbstractGraph<N> graph;
    
    public Dijkstra(AbstractGraph<N> graph) {
        this.graph = graph;
    }
    public Iterable<N> expandNode(N node) {
        return graph.children(node);
    }
    public int compare(Path<N> p1, Path<N> p2) {
        if (p1.cost() > p2.cost())
            return 1;
        else if (p1.cost() < p2.cost())
            return -1;
        else
        	return 0;
    }

}
