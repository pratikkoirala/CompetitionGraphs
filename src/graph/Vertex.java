package graph;

/**
 * 
 * @author Pratik
 * Vertex class that represents a single species in the food web.
 *
 */

public class Vertex {
	
	//Vertex class has a name property, name of the species in food web.
	private String vertexName;
	
	// Each vertex object has an index field, which is given by the Graph class
	private int index;
	
	//Number of edges coming into the vertex.
	private int inDegree;
	
	//Number of edges going out from the vertex.
	private int outDegree;
	
	//Constructor method to create a vertex.
	public Vertex(String name){
		this.vertexName = name;
		
	}
	
	//Setter methods for inDegree, outDegree and index
	public void setInDegree(int number){
		this.inDegree = number;
	}
	
	public void setOutDegree(int number){
		this.outDegree = number;
	}
	
	public void setIndex(int number){
		// Throw an error message if index is negative
		if (number < 0){
			System.out.println("Error: Negative index!");
			return;	
		}
		this.index = number;
	}
	
	
	//Getter methods for the vertex properties.
	public String getVertexName(){
		return vertexName;		
	}
	
	public int getInDegree(){
		return inDegree;		
	}
	public int getOutDegree(){
		return outDegree;		
	}
	public int getIndex(){
		return index;
	}
}
