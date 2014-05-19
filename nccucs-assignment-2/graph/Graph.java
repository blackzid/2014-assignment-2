package ps3.graph;
import java.util.*;
import java.util.Map;

public class Graph<N> extends AbstractGraph<N> {
	
	private HashMap<N, HashSet<N>> map;

	public Graph() {	
		map = new HashMap<N, HashSet<N>>();
	}
	public boolean isEmpty(){
		if(map.isEmpty())
			return true;
		else
			return false;
	}
	@Override
	public HashSet<N> listChildren(N node) {
		if (!map.containsKey(node))
			throw new IllegalArgumentException();
		HashSet<N> children = new HashSet<N>();
		children.addAll(map.get(node));
		return children;
	}

	@Override
	public HashSet<N> listNodes() {
		HashSet<N> nodes = new HashSet<N>();
		nodes.addAll(map.keySet());
		return nodes;
	}

	@Override
	public void addNode(N node) {
		// TODO Auto-generated method stub
		if (node == null)
			throw new IllegalArgumentException();
		if (!map.containsKey(node)) {
			map.put(node, new HashSet<N>());
		}
	}

	@Override
	public void addEdge(N parentNode, N childNode) {
		// TODO Auto-generated method stub
		N parent = parentNode;
		N child = parentNode;
		if (parent == null || child == null || !map.containsKey(parent)
				|| !map.containsKey(child))
			throw new IllegalArgumentException();
		map.get(parentNode).add(childNode);		
	}
	@Override
	public Collection<N> children(N node) {
		ArrayList<N> childrenList = new ArrayList<N>();
		childrenList.addAll(map.get(node));
		return childrenList;
	}
	@Override
	public Collection<N> nodes() {
		return null;
	}
	
}
