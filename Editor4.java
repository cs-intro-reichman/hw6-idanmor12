import java.awt.Color;

public class Editor4 {
	public static void main (String[] args) {
		String image = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] colorImage = Runigram.read(image);
        Color[][] greyScaleImage = Runigram.grayScaled(colorImage);
		Runigram.setCanvas(colorImage);
		Runigram.morph(colorImage, greyScaleImage, n);
	}
}
