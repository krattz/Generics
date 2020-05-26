public class GenericClass<String, Integer> {
    private String s;
    private Integer i;

    public void setS(String k) {
        this.s = k;
    }
    public void setI(Integer i) {
        this.i = i;
    }
    public String getS() {
       return s;
    }
    public Integer getI() {
       return i;
    }
    public void printArrayContent() {
        if (getI() != null){
            System.out.println(getI());
        }
       if (getS() != null) {
           System.out.println(getS());
       }
    }
}