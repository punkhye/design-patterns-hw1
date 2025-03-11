package command;

public class LieDownCommand implements ICommand{
    private final Trainer trainer;

    public LieDownCommand(Trainer trainer) {
        this.trainer = trainer;
    }

    @Override
    public void execute() {
        trainer.LieDown();
    }
}
