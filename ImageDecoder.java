package student;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;

import icam.ImageTools;

public class ImageDecoder {

	private static BufferedImage readImageFromTextFile(String filename) throws Exception {

		// 1 - open the file provided with filename parameter
		// Scanner reader = ...(filename)

		// 2 - read the number of rows
		// int rows = ...

		// 3 - read the number of cols
		// int cols = ..

		// 4 - create a 2D array of the appropriate size
		// int[][] matrix = ...


		// 5 - read the content of the file and store it in the 2D array
		
		// 6 - grab the maximum value
		// float max = ...

		// 7 - grab the minimum value
		// float min = ...

		// 6 - close the file

		// 7 - create an image
		//		BufferedImage img = ImageTools.createImage(rows, cols);

		// 8 - compute the equation parameters (see
		// https://www.google.com/search?q=Calculates+the+linear+equation+given+two+points)
		//float a = (float) ( 255.0   / ........
		//float b = ...

		// 9 - for each cell, transpose the 2D array content to 0-255 domain and draw a
		// grayscale pixel with this value

		// 10 - return the image
		//		return img;
		
		//remove this line
		return null;
	}

	public static void main(String[] args) throws Exception {

		// read the image from the text file
		BufferedImage carte = readImageFromTextFile("last_image.txt");

		// show the image in a window
		ImageTools.showImg(carte);
	}

}
