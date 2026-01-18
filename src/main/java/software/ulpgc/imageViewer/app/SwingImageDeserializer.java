package software.ulpgc.imageViewer.app;

import software.ulpgc.imageViewer.io.ImageDeserializer;

import javax.imageio.ImageIO;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class SwingImageDeserializer implements ImageDeserializer {
    public SwingImageDeserializer() {
    }

    public Object deserialize(byte[] bytes) {
        try {
            return ImageIO.read(new ByteArrayInputStream(bytes));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}