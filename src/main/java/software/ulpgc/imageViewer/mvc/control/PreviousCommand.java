package software.ulpgc.imageViewer.mvc.control;

import software.ulpgc.imageViewer.mvc.control.Command;

public class PreviousCommand implements Command {
    private final ImagePresenter presenter;

    public PreviousCommand(ImagePresenter presenter) {
        this.presenter = presenter;
    }

    public void execute() {
        presenter.showPreviousImage();
    }
}
