public class GenericClass<String, Integer> {
private String s;
private Integer i;
    public void setS(String k){
     this.s = k;
    }
    public void setI(Integer i){
        this.i = i;
    }
    public void getS(){
        System.out.println(s);
    }
    public void getI(){
        System.out.println(i);
    }
}
