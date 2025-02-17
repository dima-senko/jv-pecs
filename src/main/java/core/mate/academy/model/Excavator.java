package core.mate.academy.model;

public class Excavator extends Machine {
    private int drillingDepth;

    public Excavator() {
    }

    public Excavator(String name, String color, int drillingDepth) {
        super(name, color);
        this.drillingDepth = drillingDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
