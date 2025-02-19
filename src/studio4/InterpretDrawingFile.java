package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean isFilled = in.nextBoolean();
		StdDraw.setPenColor(red, green, blue);
		if (isFilled) {
			if ("ellipse".equals(shape)) {
				double x1 = in.nextDouble();
				double y1 = in.nextDouble();
				double x2 = in.nextDouble();
				double y2 = in.nextDouble();
				StdDraw.filledEllipse(x1, y1, x2, y2);
			}
			
			if ("rectangle".equals(shape)) {
				double x1 = in.nextDouble();
				double y1 = in.nextDouble();
				double x2 = in.nextDouble();
				double y2 = in.nextDouble();
				StdDraw.filledRectangle(x1, y1, x2, y2);
			}
			
			if ("triangle".equals(shape)) {
				double x1 = in.nextDouble();
				double y1 = in.nextDouble();
				double x2 = in.nextDouble();
				double y2 = in.nextDouble();
				double x3 = in.nextDouble();
				double y3 = in.nextDouble();
				double[] x = {x1, x2, x3};
				double[] y = {y1, y2, y3};
				StdDraw.filledPolygon(x, y);
			}
		}
		else {
			if ("ellipse".equals(shape)) {
				double x1 = in.nextDouble();
				double y1 = in.nextDouble();
				double x2 = in.nextDouble();
				double y2 = in.nextDouble();
				StdDraw.ellipse(x1, y1, x2, y2);
			}
			
			if ("rectangle".equals(shape)) {
				double x1 = in.nextDouble();
				double y1 = in.nextDouble();
				double x2 = in.nextDouble();
				double y2 = in.nextDouble();
				StdDraw.rectangle(x1, y1, x2, y2);
			}
			
			if ("triangle".equals(shape)) {
				double x1 = in.nextDouble();
				double y1 = in.nextDouble();
				double x2 = in.nextDouble();
				double y2 = in.nextDouble();
				double x3 = in.nextDouble();
				double y3 = in.nextDouble();
				double[] x = {x1, x2, x3};
				double[] y = {y1, y2, y3};
				StdDraw.polygon(x, y);
			}
		}
		
		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;
		StdDraw.rectangle(0, 0, 0, 0);
	}
}