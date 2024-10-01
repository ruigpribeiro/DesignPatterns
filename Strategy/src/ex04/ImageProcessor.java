package ex04;

import java.awt.*;

public class ImageProcessor {
    private ImageFilterStrategy imageFilterStrategy;

    public ImageProcessor(ImageFilterStrategy imageFilterStrategy) {
        this.imageFilterStrategy = imageFilterStrategy;
    }

    public void applyFilter(String image) {
        imageFilterStrategy.apply(image);
    }
}
