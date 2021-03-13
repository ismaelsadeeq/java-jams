package myRectangle;

import java.awt.Point;
import java.awt.Rectangle;
public class MyRectangle{
	/**
	*	Method that caluclates the euclidean distance between two points
	*	@param p1 is the first point
	*	@param p2 is the second point
	*	@return Euclidean distance
	*/
	public static double distance(Point p1, Point p2){
		int dx = p2.x - p1.x;
		int dy = p2.y - p1.y;
		return Math.sqrt(dx*dx + dy*dy);
	}
	
	/**
	*	Method finds the center of a rectangle
	*	@param box is the retangle object
	*	@return The middle point of the rectangle
	*/
	public static Point findCenter(Rectangle box){
		int x= box.x + box.width/2;
		int y= box.y + box.height/2;
		return new Point(x,y);
	}

	public static void main(String[] args){
		Point p = new Point(5,8);//create a point object and point to it with variable p
		Point q = new Point(9,15);//create a point object and point to it with variable q
		Point w = q;//create a variable w and point it to the object q is pointing to

		System.out.println("Point p:("+ p.x +","+p.y+")");//display coordinates of point p
		System.out.println("Point q:("+ q.x +","+q.y+")");//display coordinates of point q
		
		//invoke the distance method to calculate the distance between the two points and display the result
		System.out.println("Distance :"+distance(p,q));

		//Create a new rectangle at point (0,0) with width 300 and height 500
		//create a variable of type Rectangle and point it to the rectangle created
		Rectangle rect = new Rectangle(0, 0, 300, 500);

		/*
		invoke the findCenter method to find the center of the rectangle rect 
		and create a variable c to point to it.
		*/
		Point c = findCenter(rect);
		System.out.println("Center of Rectangle:("+ c.x +","+c.y+")");

	}
}