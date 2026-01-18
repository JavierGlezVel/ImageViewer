package software.ulpgc.imageViewer.app;

import software.ulpgc.imageViewer.io.FileImageLoader;
import software.ulpgc.imageViewer.io.ImageLoader;
import software.ulpgc.imageViewer.mvc.control.ImagePresenter;
import software.ulpgc.imageViewer.mvc.control.NextCommand;
import software.ulpgc.imageViewer.mvc.control.PreviousCommand;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File folder = new File("C:\\Users\\javier\\fotos\\IS2");
        ImageLoader loader = new FileImageLoader(folder);
        MainFrame mainFrame = new MainFrame();
        ImagePresenter presenter = new ImagePresenter(mainFrame.getDisplay(), loader);
        mainFrame
                .put("previous", new PreviousCommand(presenter))
                .put("next", new NextCommand(presenter))
                .setVisible(true);
    }
}
