public class MainProgram {
    public static void main(String[] args) {
       GenericClass stringInstance = new GenericClass<String, Integer>();
        stringInstance.setS("Test");
        stringInstance.printArrayContent();

        GenericClass integerInstance = new GenericClass<String, Integer>();
        integerInstance.setI(1000);
        integerInstance.printArrayContent();
    }
}
