package icam;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * 
 * Please do not modify this Class. David
 * 
 * @author david fasani
 *
 */

class ImageZoom {
	
	ImagePanel imagePanel;

	
	static void showImageInFrame(BufferedImage img) throws Exception {
		
		JFrame f = new JFrame();
		ImagePanel panel = new ImagePanel(img);
		ImageZoom zoom = new ImageZoom(panel);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(zoom.getUIPanel(), "North");
		f.getContentPane().add(new JScrollPane(panel));
		f.setSize(800, 600);
		f.setLocation(200, 200);
		f.setVisible(true);
	}
	
	
	
	public ImageZoom(ImagePanel ip) {
		imagePanel = ip;
	}

	public JPanel getUIPanel() {
		
		SpinnerNumberModel model = new SpinnerNumberModel(1.0, 0.1, 50, .1);
		
		final JSpinner spinner = new JSpinner(model);
		spinner.setPreferredSize(new Dimension(45, spinner.getPreferredSize().height));
		
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				float scale = ((Double) spinner.getValue()).floatValue();
				imagePanel.setScale(scale);
			}
		});
		
		JPanel panel = new JPanel();
		panel.add(new JLabel("scale"));
		panel.add(spinner);
		
		return panel;
	}
}


class ImagePanel extends JPanel {
	

	private static final long serialVersionUID = 7893890762649967107L;

	private BufferedImage image;
	private double scale;

	public ImagePanel(Image img) throws Exception {

		image = (BufferedImage) img;

		scale = 1.0;
		setBackground(Color.black);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
		double x = (getWidth() - scale * image.getWidth()) / 2;
		double y = (getHeight() - scale * image.getHeight()) / 2;
		
		//image transformation
		AffineTransform at = AffineTransform.getTranslateInstance(x, y);
		at.scale(scale, scale);
		g2.drawRenderedImage(image, at);
	}

	public Dimension getPreferredSize() {
		int w = (int) (scale * image.getWidth());
		int h = (int) (scale * image.getHeight());
		return new Dimension(w, h);
	}

	public void setScale(double s) {
		scale = s;
		revalidate(); // update the scroll pane
		repaint();
	}

}

