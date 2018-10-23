package pragma;

import java.util.ArrayList;
import java.util.Arrays;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class App {
	 public static class Node {

	        int key;
	        List<Node> nodes;
	        Node n = new Node(3);

	        public Node(int key) {
	            this.key = key;
	            this.nodes = new ArrayList<>();
	        }

	        public void addNode(Node n) {
	            nodes.add(n);
	        }

	        public int getKey() {
	            return key;
	        }

	        public List<Node> getNodes() {
	            return nodes;
	        }
	    }


	    public static int[] solution(int[] H) {

	        Node root = createGraph(H);

	        int N = H.length;

	        int[] result = createSameLevel(root, N);

	        System.out.println(Arrays.toString(result));

	        return result;
	    }

	    private static Node createGraph(int[] F) {

	        int N = F.length;

	        Node[] nodes = new Node[N];

	        Node root = null;

	        for (int i = 0; i < N; i++) {
	            nodes[i] = new Node(i);
	        }

	        for (int i = 0; i < N; i++) {

	            if (A[i] == i) {
	                root = nodes[i];
	            } else {
	                nodes[A[i]].addNode(nodes[i]);
	            }
	        }

	        return root;
	    }


	    public static int[] createSameLevel(Node node, int N) {

	        int[] result = new int[N - 1];

	        ArrayList<ArrayList<Node>> nodes = createSameLevel(new ArrayList<ArrayList<Node>>(), node, 0);
	        nodes.remove(0);

	        int i = 0;
	        for (List<Node> n : nodes) {
	            result[i++] = n.size();
	        }

	        return result;
	    }


	    public static ArrayList<ArrayList<Node>> createSameLevel(ArrayList<ArrayList<Node>> nodes, Node node, int level) {

	        ArrayList<Node> current = null;

	        if (nodes.size() == level) {

	            current = new ArrayList<>();
	            nodes.add(level, current);
	        } else {
	            current = nodes.get(level);
	        }

	        current.add(node);

	        for (Node n : node.getNodes()) {
	            return createSameLevel(nodes, n, level + 1);
	        }

	        return nodes;
	    }


	    public static void main(String[] args) {

	        int[] T = new int[10];

	        T[0] = 9;
	        T[1] = 1;
	        T[2] = 4;
	        T[3] = 9;
	        T[4] = 0;
	        T[5] = 4;
	        T[6] = 8;
	        T[7] = 9;
	        T[8] = 0;
	        T[9] = 1;

	        solution(T);
	    }
}
