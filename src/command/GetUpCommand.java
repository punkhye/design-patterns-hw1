package command;

public class GetUpCommand implements ICommand {
    private final Trainer trainer;

    public GetUpCommand(Trainer trainer) {
        this.trainer = trainer;
    }

    @Override
    public void execute() {
        trainer.GetUp();
    }
}
