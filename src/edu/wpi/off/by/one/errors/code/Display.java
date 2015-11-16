package edu.wpi.off.by.one.errors.code;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public class Display extends Pane{
	
	Map currentMap;
	Graph currentGraph;

	/**
	 * Display Constructor
	 * @param currentMap
	 * @param currentGraph
	 */
	public Display(Map currentMap, Graph currentGraph){
		this.currentMap = currentMap == null ? new Map() : currentMap;
		this.currentGraph = currentGraph == null ? new Graph() : currentGraph;
	}
	
	/**
	 * Default constructor
	 * 
	 */
	public Display(){
		this.currentMap = new Map();
		this.currentGraph = new Graph();
	}
	
	public void setMap(Map m){ this.currentMap = m; }
	public void setGraph(Graph g) { this.currentGraph = g; }
	public Map getMap() { return currentMap; }
	public Graph getGraph() { return currentGraph; }
	/**
	 * Draws a graphical path between two nodes on the map
	 * @param a First node
	 * @param b Second node
	 */
	public void drawPath(Node a, Node b) {
		Coordinate aLoc = a.getCoordinate();
		Coordinate bLoc = b.getCoordinate();
		
		Line l = new Line(aLoc.getX(), aLoc.getY(), bLoc.getX(), bLoc.getY());
		
		//TODO: Add code to actually draw the line on the map
	}
	
	
}
