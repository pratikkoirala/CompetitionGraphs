package graph2;

import graph.Vertex;

/**
 * 
 * @author Pratik Koirala
 * Class that represents a graph as an adjacency matrix
 */

public class GraphAdjMatrix extends Graph{
	
	// Two dimensional array which stores information about 
	// the presence of an edge between two vertices.
	// Value 0 implies no edge, 1 implies there is an edge
	private int[][] adjMatrix;
	
	
	// Constructor method for adjacency matrix
	// Instantiates an n*n matrix,
	// @param    n (assumed number of vertices in graph initially)
	public GraphAdjMatrix(int n){
		adjMatrix = new int[n][n];
		
	}
	
	// Method to add an edge to the graph
	// using the index of the vertices.
	public void addEdge(Vertex v, Vertex w){
		adjMatrix[v.getIndex()][w.getIndex()] = 1;
		edgesNum++;
		
	}
	
	// Method to add a vertex 'n' to the graph
	public void implementAddVertex(Vertex n){
		int v = getVerticesNum();
		
		// Set index of the new vertex as the number of existing vertices
		n.setIndex(v);
		
		// if vertex exceeds the dimension of matrix
		// first, a new matrix is created with twice the dimension
		// and the values are copied
		if (v >= adjMatrix.length){
			int[][] newMatrix = new int[v*2][v*2];
			for (int i = 0; i < adjMatrix.length; i++){
				for (int j = 0; j < adjMatrix.length; j++){
					newMatrix[i][j] = adjMatrix[i][j];						
				}	
			}
			adjMatrix = newMatrix;	
		}
		
		// Insert 0 in all the entries for the new isolated vertex 
		for (int i = 0; i < adjMatrix.length; i++){
		    adjMatrix[v][i] = 0;
		    adjMatrix[i][v] = 0;
		}
	}

	
	//Prints the adjacency matrix to the console
	public void printAdjMatrix(){
		System.out.println("Printing the adjacency matrix... ");
		System.out.println("");
	
		for (int i = 0; i < adjMatrix.length; i++){
			for (int j = 0; j < adjMatrix.length; j++){
				System.out.print(adjMatrix[i][j] + " ");
				
			}	
			System.out.println("");
		} 
		
	}
	
	// Getter method for the adjacency matrix
	public int[][] getAdjMatrix(){
		return adjMatrix;
	}

}
