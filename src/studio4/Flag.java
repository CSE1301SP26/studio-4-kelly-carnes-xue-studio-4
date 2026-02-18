package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.filledRectangle(0.5, 0.5, 6, 3);
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledCircle(0.5, 0.7, 0.2);
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.filledCircle(0.4, 0.7, 0.02);
		StdDraw.filledCircle(0.6, 0.7, 0.02);
		StdDraw.setPenRadius(0.005);
		StdDraw.arc(0.45, 0.4, 0.01, 0, 90);
		StdDraw.setPenRadius(0.05);
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.line(0.2, 0.2, 0.8, 0.5);
		StdDraw.line(0.2, 0.5, 0.8, 0.2);

	}
}