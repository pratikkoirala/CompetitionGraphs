package graph2;
import java.util.ArrayList;




/**
 * 
 * @author Pratik Koirala
 * CompetitionGraph class that models the competition graph (undirected) of the food web
 * Definition: If two species in the food web share a common prey, there is an edge between
 * the species in the competition graph. Note: Competition Graph and the food web graph both
 * have same number of vertices.
 *
 */
public class CompetitionGraph {
	
	// Competition graph has its own adjacency matrix
	private GraphAdjMatrix competitionMatrix;
    
	// Constructor method that creates a new adjacency matrix object
	// for the competition graph according to the number of vertices
	// in the food web.
	// @param   g   adjacency matrix object of the food web
	public CompetitionGraph(GraphAdjMatrix g) {
		competitionMatrix = new GraphAdjMatrix(g.getVerticesNum());
		implementCompetitionGraph(g);
	}
	
	// Getter method for the competition adjacency matrix
    public GraphAdjMatrix getCompetitionMatrix(){
    	return competitionMatrix;
    	
    } 
    
    // Method that implements competition graph of a given food web graph
    // Loop through the entire matrix rowwise to check for repeated 1s
    private void implementCompetitionGraph(GraphAdjMatrix g){
    	int[][] givenMatrix = g.getAdjMatrix();
    	for (int i = 0; i < g.getVerticesNum(); i++){
    		ArrayList<Integer> tempArray = new ArrayList<Integer>();
    		for (int j = 0; j < g.getVerticesNum(); j++){
    			if (givenMatrix[i][j] == 1){
    				tempArray.add(j);
    			}
    		}
    		if (tempArray.size() > 1){
    			for (int k = 0; k < tempArray.size() - 1; k++){
    				for (int l = k + 1; l < tempArray.size(); l++){
    					competitionMatrix.getAdjMatrix()[tempArray.get(k)][tempArray.get(l)] = 1;
    					competitionMatrix.getAdjMatrix()[tempArray.get(l)][tempArray.get(k)] = 1;
    				}	
    			}
    		}		
    	}
    }
}
