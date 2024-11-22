package Widgets;

import Mediator.Mediator;

public class WaktTimeTable implements IWidget{
    Mediator mediator;

    public WaktTimeTable(Mediator md){
        this.mediator = md;
    }

    @Override
    public void Update() {
        System.out.println("WaktTimeTable is updated");
        mediator.notifyy(this);
    }
    
}
