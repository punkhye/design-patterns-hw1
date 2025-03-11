package command;

import observer.IObservable;

import java.util.ArrayList;
import java.util.List;

public class Trainer implements IObservable {
    private String name;
    private List<Viewer> viewerList ;

    public Trainer (){
        this.viewerList = new ArrayList<>();
    }

    public Trainer(String name) {
        this.name = name;
        this.viewerList = new ArrayList<>();
    }


    public void GetUp(){
        System.out.println(name + " got up.");
        notifyObserver();
    }

    public void LieDown(){
        System.out.println(name + " got down.");
        notifyObserver();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Viewer> getViewerList() {
        return viewerList;
    }

    public void setViewerList(List<Viewer> viewerList) {
        this.viewerList = viewerList;
    }

    @Override
    public void addViewer(Viewer viewer) {
        if(viewerList.size() >= 3){
            System.out.println(name + "'s channel is full!");
        }else{
            viewerList.add(viewer);
            System.out.println(viewer.getName() + " has been added to " + name + "'s channel!");
        }
    }

    @Override
    public void removeViewer(Viewer viewer) {
        if(!viewerList.isEmpty()){
            System.out.println(viewer.getName() + " has been removed from " + name + "'s channel!");
            viewerList.remove(viewer);
        }else{
            System.out.println("ERROR! There is no viewer to remove!");
        }

    }


    @Override
    public void notifyObserver() {
        for(Viewer viewer : viewerList){
            viewer.exercise();
        }
    }
}
