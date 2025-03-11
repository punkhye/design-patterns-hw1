import command.GetUpCommand;
import command.ICommand;
import command.Trainer;

public class FitnessInstructor {
    private String name;

    public FitnessInstructor() {

    }

    public void GiveInstructions(Trainer trainer, ICommand exercise){
        System.out.println("Giving instructions for " + trainer.getName());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
