package software.ulpgc.imageViewer.mvc.control;

import software.ulpgc.imageViewer.mvc.control.Command;

public class NextCommand implements Command {
    private final ImagePresenter presenter;

    public NextCommand(ImagePresenter presenter) {
        this.presenter = presenter;
    }

    public void execute() {
        presenter.showNextImage();
    }
}