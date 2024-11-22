package Widgets;

import Mediator.Mediator;

public class Timezone implements IWidget{
    Mediator mediator;

    public Timezone(Mediator md){
        this.mediator = md;
    }

    @Override
    public void Update() {
        System.out.println("TimeZone is updated");
        mediator.notifyy(this);
    }
    
}
