package observer;

import command.Viewer;

public interface IObservable {
    public void addViewer(Viewer viewer);
    public void removeViewer(Viewer viewer);
    public void notifyObserver();
}
