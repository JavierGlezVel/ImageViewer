package software.ulpgc.imageViewer.io;

public interface ImageDeserializer {
    Object deserialize(byte[] image);
}