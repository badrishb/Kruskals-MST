package Gotham;

import java.util.ArrayList;
public class Node<E> {
	private E element; 
	private int id;
	//private Map<Node,Integer> neighbors = new HashMap<Node,Integer>();
	private ArrayList<Node> neighbors = new ArrayList<Node>();
	 ArrayList<Edge> edgeList = new ArrayList<Edge>();	
	public boolean visited= false;
	public int clus;
	int in=0;
	
	public Node(int id1){
		id = id1;
		
	}
	
	public int getId(){
		return id;
	}
	public E getElement(){
		return element;
	}
	public void setElement(E val){
		element = val;
	}
	public ArrayList<Node> getNeighbors(){
		return neighbors;
	}
	
	public void addedge(Edge e)
	{
		edgeList.add(edgeList.size(), e);
	}

	
	public int getDegree(){
		return neighbors.size();
	}
	
	public void printNeighbors(){
		for (int i=0;i<neighbors.size();i++){
			System.out.print(neighbors.get(i).getId()+": ");
		}
	}
	public Edge getedge(int i)
	{
		return edgeList.get(i);
	}
	
}

