package icam;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
/**
 * 
 * Please do not modify this Class. David
 * 
 * @author david fasani
 *
 */
public class ImageTools {

	//read an image file and show it a window
	public static void showImg(String filename) throws Exception {
		File f = new File(filename);
		BufferedImage img = ImageIO.read(f);

		showImg(img);
	}

	
	//show an image in a window
	public static void showImg(BufferedImage img) throws Exception {
		ImageZoom.showImageInFrame(img);
	}

	

	public static void setPixel(BufferedImage img, int x, int y, int grayLevel) {
		setPixel(img, x, y, grayLevel, grayLevel, grayLevel);
	}


	public static void setPixel(BufferedImage img, int x, int y, int redLevel, int greenLevel, int blueLevel) {

		int rgb = new Color(redLevel, greenLevel, blueLevel).getRGB();

		// change the pixel value
		img.setRGB(x, y, rgb);
	}

	/**
	 * 
	 * @param rows the numbers of rows in the image (the height)
	 * @param cols the numbers of cols in the image (the width)
	 * @return a blank image
	 */
	public static BufferedImage createImage(int rows, int cols) {
		BufferedImage image = new BufferedImage(cols, rows, BufferedImage.TYPE_USHORT_555_RGB);

		// x for absciss
		for (int x = 0; x < cols; x++)
		{

			// y for ordinate
			for (int y = 0; y < rows; y++)
			{

				//all pixels to white (255,255,255) !
				ImageTools.setPixel(image, x, y, 255, 255, 255);

			}

		}

		return image;
	}

}
