import command.Trainer;
import command.Viewer;

public class Main {
    public static void main(String[] args) {
        Trainer trainer = new Trainer("gosho");
        Viewer viewer = new Viewer("ediniq");
        Viewer viewer2 = new Viewer("drugiq");
        Viewer viewer3 = new Viewer("nqkoi");
        Viewer viewer4 = new Viewer("toz ne trqq e tam");

        trainer.addViewer(viewer);
        trainer.addViewer(viewer2);
        trainer.addViewer(viewer3);

        trainer.GetUp();

    }
}