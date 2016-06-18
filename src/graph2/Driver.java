package graph2;
import graph.Vertex;

/**
 * 
 * @author Pratik Koirala
 * Driver class that tests all the functionalities of Graph class and its subclasses.
 *
 */

public class Driver {
	public static void main(String[] args){
		Graph myGraph = new GraphAdjMatrix(5);
		
		// Manually adding vertices and edges
		Vertex vertexObject0 = new Vertex("grass");
		Vertex vertexObject1 = new Vertex("rabbit");
		Vertex vertexObject2 = new Vertex("tiger");
		Vertex vertexObject3 = new Vertex("deer");
		Vertex vertexObject4 = new Vertex("hawk");
		myGraph.addVertices(vertexObject0);
		myGraph.addVertices(vertexObject1);
		myGraph.addVertices(vertexObject2);
		myGraph.addVertices(vertexObject3);
		myGraph.addVertices(vertexObject4);
		
		myGraph.addEdge(vertexObject0, vertexObject1);
		myGraph.addEdge(vertexObject0, vertexObject3);
		myGraph.addEdge(vertexObject1, vertexObject2);
		myGraph.addEdge(vertexObject3, vertexObject2);
		myGraph.addEdge(vertexObject3, vertexObject4);

		System.out.println("");
		
		System.out.println("Number of edges: " + myGraph.getEdgesNum());
		System.out.println("Number of vertices: " + myGraph.getVerticesNum());
		System.out.println("");
		
		// Print the adjacency matrix of the graph
		System.out.println("Food web:");
		((GraphAdjMatrix) myGraph).printAdjMatrix();	
		System.out.println("");
		
		CompetitionGraph myCompetitionGraph = new CompetitionGraph((GraphAdjMatrix) myGraph);
		System.out.println("Corresponding competition graph:");
		myCompetitionGraph.getCompetitionMatrix().printAdjMatrix();
	}
}
