package command;


import observer.IObserver;

public class Viewer implements IObserver {
    private String name;

    public Viewer(){

    }

    public Viewer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void exercise() {
        System.out.println(this.getName() + " did the exercise");
    }
}
