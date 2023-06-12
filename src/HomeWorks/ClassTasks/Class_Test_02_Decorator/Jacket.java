package HomeWorks.ClassTasks.Class_Test_02_Decorator;

class Jacket extends ClothingDecorator {
    public Jacket(Clothing clothing) {
        super(clothing);
    }

    public void wear() {
        super.wear();
        System.out.println("Wearing a jacket");
    }
}