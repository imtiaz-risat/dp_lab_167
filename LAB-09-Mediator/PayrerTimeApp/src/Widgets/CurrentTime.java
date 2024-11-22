package Widgets;

import Mediator.Mediator;

public class CurrentTime implements IWidget {
    Mediator mediator;
    
    public CurrentTime(Mediator md){
        this.mediator = md;
    }
    
    @Override
    public void Update() {
        System.out.println("CurrentTime is updated");
        mediator.notifyy(this);
    }
    
}
