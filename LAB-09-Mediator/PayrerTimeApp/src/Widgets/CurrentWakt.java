package Widgets;

import Mediator.Mediator;

public class CurrentWakt implements IWidget{
    Mediator mediator;

    public CurrentWakt(Mediator md){
        this.mediator = md;
    }

    @Override
    public void Update() {
        System.out.println("CurrentWakt is updated");
        mediator.notifyy(this);
    }
    
}
