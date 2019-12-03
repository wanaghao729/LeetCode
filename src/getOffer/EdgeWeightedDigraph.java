package src.getOffer;

public class EdgeWeightedDigraph {
    private final int V;    //顶点总数
    private int E;  //边的总数
    private Bag<DirectedEdge>[] adj;    //邻接表
    private static final String NEWLINE = System.getProperty("line.separator");

    public EdgeWeightedDigraph(int V) {
        this.V = V;
        this.E = 0;
        adj = (Bag<DirectedEdge>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<DirectedEdge>();
        }
    }
    public EdgeWeightedDigraph(int V, int E) {
        this(V);
        if (E < 0)  throw new IllegalArgumentException("边不能为负数！");
        for (int e = 0; e < E; e++) {
            int v = StdRandom.uniform(V);
            int w = StdRandom.uniform(V);
            double weight = 0.01 * StdRandom.uniform(100);
            DirectedEdge edge = new DirectedEdge(v, w, weight);
            addEdge(edge);
        }
    }
    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public void addEdge(DirectedEdge e) {
        adj[e.from()].add(e);
        E++;
    }

    public Iterable<DirectedEdge> adj(int v) {
        return adj[v];
    }

    public Iterable<DirectedEdge> edges() {
        Bag<DirectedEdge> bag = new Bag<>();
        for (int v = 0; v < V; v++) {
            for (DirectedEdge e : adj[v])
                bag.add(e);
        }
        return bag;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("The directed graph is: \n" + V + " " + E + NEWLINE);
        for (int v = 0; v < V; v++) {
            s.append(v + ": ");
            for (DirectedEdge e : adj[v]) {
                s.append(e + "  ");
            }
            s.append(NEWLINE);
        }
        return s.toString();
    }

    public static void main(String[] args) {
        EdgeWeightedDigraph G = new EdgeWeightedDigraph(8, 15);
        System.out.println(G.toString());
    }
}
