
import java.util.Iterator;
import java.util.LinkedList;
import static javafx.scene.input.KeyCode.V;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yassir Arafat
 */
public class BFSIterative {
    
    static void bfs(Graph graph, int s) 
    { 
        // Mark all the vertices as not visited(By default 
        // set as false) 
        boolean visited[] = new boolean[V]; 
  
        // Create a queue for BFS 
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
  
        // Mark the current node as visited and enqueue it 
        visited[s]=true; 
        queue.add(s); 
  
        while (queue.size() != 0) 
        { 
            // Dequeue a vertex from queue and print it 
            s = queue.poll(); 
            System.out.print(s+" "); 
  
            // Get all adjacent vertices of the dequeued vertex s 
            // If a adjacent has not been visited, then mark it 
            // visited and enqueue it 
            Iterator<Integer> i = graph.adj[s].listIterator(); 
            while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!visited[n]) 
                { 
                    visited[n] = true; 
                    queue.add(n); 
                } 
            } 
        } 
    } 
    
    public static void main(String[] args) {
        Graph graph = new Graph(4);
        
        
        graph.addEdges(0, 1); 
        graph.addEdges(0, 2); 
        graph.addEdges(1, 2); 
        graph.addEdges(2, 0); 
        graph.addEdges(2, 3); 
        graph.addEdges(3, 3);
        
        System.out.println("Following is Breadth First Traversal "+ 
                           "(starting from vertex 2)"); 
  
        bfs(graph, 2); 
    }
}
