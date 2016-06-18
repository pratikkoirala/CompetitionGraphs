package graph2;
import java.util.ArrayList;

import graph.Vertex;
/**
 * 
 * @author Pratik Koirala
 * Abstract class Graph which will be used to model food webs (directed graphs)
 * and implement corresponding competition graphs (undirected graphs)
 */

public abstract class Graph {
	
	// Graph has two fields, number of vertices and edges
	private int verticesNum;
	protected int edgesNum;
	
	// A graph object stores all the vertices in an ArrayList
	protected ArrayList<Vertex> vertexSet;
	
	// Constructor that instantiates an empty graph
	public Graph() {
		verticesNum = 0;
		edgesNum = 0;
		vertexSet = new ArrayList<Vertex>();
		
	}
	
	// Getter methods to get number of vertices and edges
	public int getVerticesNum(){ 
		return verticesNum;
	}
	
	public int getEdgesNum(){
		return edgesNum;
	}
	
	// Method to add new vertices
	public void addVertices(Vertex v){
		implementAddVertex(v);
		verticesNum++;
		vertexSet.add(v);
	}
    
	// Abstract methods which will be implemented by the subclasses
    public abstract void implementAddVertex(Vertex v);
    
    public abstract void addEdge(Vertex v, Vertex w);
    
}
