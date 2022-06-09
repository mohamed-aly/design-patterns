package behavioral.strategy.implementations;

import behavioral.strategy.interfaces.IDisplay;

public class GraphicsDisplayImpl implements IDisplay {
    
    @Override
    public void Display() {
        System.out.println("Graphics Display behaviour");
    }
}
