package HomeWorks.ClassTasks.Class_Test_02_Decorator;

class Hat extends ClothingDecorator {
    public Hat(Clothing clothing) {
        super(clothing);
    }

    public void wear() {
        super.wear();
        System.out.println("Wearing a hat");
    }
}
