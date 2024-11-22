package Widgets;

import Mediator.Mediator;

public class Location implements IWidget{
    Mediator mediator;

    public Location(Mediator md){
        this.mediator = md;
    }


    @Override
    public void Update() {
        System.out.println("Location is updated");
        mediator.notifyy(this);
    }
    
}
