package HomeWorks.ClassTasks.Class_Test_02_Decorator;

abstract class ClothingDecorator implements Clothing {
    protected Clothing clothing;

    public ClothingDecorator(Clothing clothing) {
        this.clothing = clothing;
    }

    public void wear() {
        clothing.wear();
    }
}

