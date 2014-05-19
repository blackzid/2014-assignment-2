package ps3.graph;
import java.util.ArrayList;
import java.util.Collection;

public abstract class AbstractGraph<N> {
	
	    /**
	     * Returns a collection  of the children of the specified node.
	     *
	     * @param node the node whose children will be returned
	     * @return a array list of the children of the specified node
	     * @modifies none
	     */
		 
	abstract public Collection<N> listChildren(N node);

	    /**
	     * Returns a collection  of all nodes in this graph.
	     *
	     * @return a collection of all nodes in this graph
	     * @modifies none
	     */
	    
	abstract public Collection<N> listNodes();
	    /**
	     * Adds a node to this graph. If the node is already in the graph, this
	     * method has no effect.
	     *
	     * @param node
	     *            the node that will be added to this graph
	     * @modifies this
	     */
	   
	abstract public void addNode(N node);

	    /**
	     * Adds an edge from the specified parent node to the specified child node.
	     * If the edge to be added is already in the graph, this method has no
	     * effect.
	     *
	     * @param parent
	     *            the node from which the edge will be directed
	     * @param child
	     *            the node to which the edge will be directed
	     * @modifies this
	     */
	    
	  
	abstract public void addEdge(N parent, N child);
	/**
     * Returns a collection of the children of the specified node.
     *
     * @param node the node whose children will be returned
     * @return a collection of the children of the specified node
     * @throws IllegalArgumentException if the specified node is null or is not in the graph
     * @modifies none
     */
    abstract public Collection<N> children(N node);

    /**
     * Returns a collection of all nodes in this graph.
     *
     * @return a collection of all nodes in this graph
     * @modifies none
     */
    abstract public Collection<N> nodes();

}
