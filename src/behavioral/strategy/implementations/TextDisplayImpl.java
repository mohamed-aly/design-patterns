package behavioral.strategy.implementations;

import behavioral.strategy.interfaces.IDisplay;

public class TextDisplayImpl implements IDisplay {

    @Override
    public void Display() {
        System.out.println("Text Display");
    }
}
