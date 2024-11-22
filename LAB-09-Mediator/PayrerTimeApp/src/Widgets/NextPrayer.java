package Widgets;

import Mediator.Mediator;

public class NextPrayer implements IWidget{
    Mediator mediator;

    public NextPrayer(Mediator md){
        this.mediator = md;
    }


    @Override
    public void Update() {
        System.out.println("NextPrayer is updated");
        mediator.notifyy(this);
    }
    
}
