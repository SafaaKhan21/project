package GraphFramework;

public class LLnode {
    private int vertex;
    private int wieght;
    private LLnode next;
 
    // Constructor 1
    public LLnode(int v) {
       this(v, null,0);
    }
 
    // Constructor 2
    public LLnode(int v, LLnode n,int w) {
     vertex= v;
     wieght=w;
     next = n;
    }
 }
 