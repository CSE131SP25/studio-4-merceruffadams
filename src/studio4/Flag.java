package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		 StdDraw.setXscale(0, 1);
	     StdDraw.setYscale(0, 1);
		
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledRectangle(1.0/6, 0.5, 1.0/6, 0.5);
		
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledRectangle(0.5, 0.5, 1.0/6, 0.5);
		
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledRectangle(5.0/6, 0.5, 1.0/6, 0.5);
	}
}