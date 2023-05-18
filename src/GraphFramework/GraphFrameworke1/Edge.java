package GraphFramework;

public class Edge {
    private Vertex source;
    private Vertex target;
    private Integer weight;
      
    public Edge(Vertex source, Vertex target, Integer inputWeight) {
      this.source = source;
      this.target = target;
      this.weight = inputWeight;
    }
      
    public Vertex getStart() {
      return this.source;
    }
      
    public Vertex getEnd() {
      return this.target;
    }
      
    public Integer getWeight() {
      return this.weight;
    }
     //not completed 
    public static void display(){

    }
      
  }