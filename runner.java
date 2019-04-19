package Gotham;

import java.util.Scanner;

import Gotham.KruskkalMST.Graph;

public class runner {

	   public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
	    	
	    	Scanner sc =new Scanner(System.in);
	    	int v=sc.nextInt();
	    	int e=sc.nextInt();
	    	Graph graph = new Graph(v,e);
	    	
	    	for(int i=1;i<=e;i++)
	    	{
	    		int s=sc.nextInt();
	    		int d=sc.nextInt();
	    		int w=sc.nextInt();
	    		graph.nodelist.get(s-1).addedge(graph.addEdge(s, d, w));
	    		graph.nodelist.get(d-1).addedge(graph.addEdge(s, d, w));
	    		graph.addEdge(s, d, w);
	    		
	    		
	    		
	    		
	    	}
	    	//graph.printGraph(graph.allEdges);
	    	
	        graph.kruskalMST();
	        
	    	
	    		
	    		}
}
