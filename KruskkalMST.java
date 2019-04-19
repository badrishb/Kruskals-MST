package Gotham;
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.io.*;



public class KruskkalMST {

    static class Graph {
        int vertices;
        int edges;
        ArrayList<Edge> allEdges = new ArrayList<>();
        ArrayList<Node> nodelist = new ArrayList<>();

        Graph(int vertices,int edges) {
            this.vertices = vertices;
            this.edges=edges;
            for(int i=1;i<=vertices;i++)
            {
            	Node n=new Node(i);
            	nodelist.add(n);
            }
        }
        

        public Edge addEdge(int source, int destination, int weight) {
            Edge edge = new Edge(source, destination, weight);
            allEdges.add(edge); //add to total edges
            return edge;
        }
        
        public void kruskalMST() throws ArrayIndexOutOfBoundsException{
            PriorityQueue<Edge> pq = new PriorityQueue<>(allEdges.size(), Comparator.comparingInt(lol -> lol.weight));

            //add all the edges to priority queue, //sort the edges on weights
            for (int i = 0; i <allEdges.size() ; i++) {
                pq.add(allEdges.get(i));
            }

            //create a parent []
            int [] parent = new int[10000];

            //makeset
            makeSet(parent);

            ArrayList<Edge> mst = new ArrayList<>();

            //process vertices - 1 edges
            int index = 0;
            while(index<vertices-1){
                Edge edge = pq.remove();
               // System.out.println(edge.weight);
                //check if adding this edge creates a cycle
                int x_set = find(parent, edge.source);
                int y_set = find(parent, edge.destination);

                if(x_set==y_set){
                    //ignore, will create cycle
                }else {
                    //add it to our final result
                   
                    //printGraph(mst);
                    mst.add(edge);
                    System.out.println(edge.weight);
                    index++;
                    union(parent,x_set,y_set);
                   
                }
            }
            //print MST
            System.out.println("Minimum Spanning Tree: ");
            printGraph(mst);
        }

        public void makeSet(int [] parent){
            //Make set- creating a new element with a parent pointer to itself.
            for (int i = 0; i <vertices ; i++) {
            	Node n=new Node( i);
            	nodelist.add(n);
                parent[i] = i;
                
            }
        }

        public int find(int [] parent, int vertex)throws ArrayIndexOutOfBoundsException{
            //chain of parent pointers from x upwards through the tree
            // until an element is reached whose parent is itself
            if(parent[vertex]!=vertex)
                return find(parent, parent[vertex]);;
            return vertex;
        }

        public void union(int [] parent, int x, int y){
            int x_set_parent = find(parent, x);
            int y_set_parent = find(parent, y);
            //make x as parent of y
            parent[y_set_parent] = x_set_parent;
        }

        public void printGraph(ArrayList<Edge> edgeList){
            for (int i = 0; i <edgeList.size() ; i++) {
Edge edge = edgeList.get(
i);
                System.out.println("Edge-" + i + " source: " + edge.source +
                        " destination: " + edge.destination +
                        " weight: " + edge.weight);
            }
        }
        
        public void dfs(Node node) {
        	
        		for(int i=0;i<node.edgeList.size();i++)
        		{
        			if(node.getedge(i).destination!=(int)0)
        			{
        				
        			}
        		}
        	
        }
        
        public void busy(ArrayList<Edge> edgelist) {
        	
        	
        }
    }
 
             
    		
           
           
    }

/* 	int vertices = 6;
        Graph graph = new Graph(vertices);
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 2);
        graph.addEdge(2, 3, 4);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 5, 6);
        graph.kruskalMST();
      
            *
            *	
            *
            */
