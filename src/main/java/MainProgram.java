public class MainProgram {
    public static void main(String[] args) {
       GenericClass stringInstance = new GenericClass<String, Integer>();
        Integer[] m = {1,2,3};
        String []n = {"This", "should","be","black"};
        stringInstance.printArrayContent(m,n);
    }
}
