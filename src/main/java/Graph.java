
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yassir Arafat
 */
public class Graph {
    
    private LinkedList<Integer> adj[];// list where all vertex/edges wil be stored

    public Graph(int node) {
        
        adj = new LinkedList[node];
        
        // initilize each row
        for (int i = 0; i < node; i++){
            adj[i] = new LinkedList();
        }
    }
    
    public void addEdges(int edge1, int edge2){
        adj[edge1].add(edge2);
    }

    public LinkedList<Integer>[] getAdj() {
        return adj;
    }
}
