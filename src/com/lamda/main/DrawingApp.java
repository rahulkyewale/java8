/**
 * 
 */
package com.lamda.main;

/**
 * @author rahulyewale
 *
 */
public class DrawingApp {
	
	public static void drawShape(Shape shape)
	{
		shape.draw();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Shape shape = new Cricle();
		drawShape(shape);
		
		ShapeLambda shapeLambda =  () -> System.out.println("Triangle is Drawn using Lambda Expression");
		shapeLambda.draw();
		
		drawShape( () -> System.out.println("Rectangle is Drawn using Lambda Expression") );
		
	}

}

interface ShapeLambda
{
	public void draw();
}
