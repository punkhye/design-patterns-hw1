import command.Trainer;
import command.Viewer;

public class Main {
    public static void main(String[] args) {
        Trainer trainer = new Trainer("gosho");
        Viewer viewer = new Viewer("viewer1");
        Viewer viewer2 = new Viewer("viewer2");
        Viewer viewer3 = new Viewer("viewer3");

        trainer.addViewer(viewer);
        trainer.addViewer(viewer2);
        trainer.addViewer(viewer3);

        trainer.GetUp();

        trainer.LieDown();

    }
}