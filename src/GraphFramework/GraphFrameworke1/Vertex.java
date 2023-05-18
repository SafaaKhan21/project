package GraphFramework;

import java.util.ArrayList;

public class Vertex {
  private String label;
  private ArrayList<Edge> edges;
  private boolean isVisited;


//-------------------------------------------------------------

  public Vertex(String inputData) {
    this.label = inputData;
    this.edges = new ArrayList<Edge>();
  }
//-------------------------------------------------------------
  public void addEdge(Vertex endVertex, Integer weight) {
    this.edges.add(new Edge(this, endVertex, weight));
  }

//-------------------------------------------------------------

  public void removeEdge(Vertex endVertex) {
    this.edges.removeIf(edge -> edge.getEnd().equals(endVertex));
  }

  public ArrayList<Edge> getEdges(){
    return this.edges;
  }

  //-------------------------------------------------------------
  public boolean isIsVisited() {
    return isVisited;
}
//-------------------------------------------------------------
public void setIsVisited(boolean isVisited) {
    this.isVisited = isVisited;
}
//-------------------------------------------------------------
  //not completed 
  public static void display(){
        
  }
}