import java.lang.reflect.Array;

public class GenericClass<String, Integer> {
    private String s;
    private Integer i;

    public void setS(String s){this.s = s; }
    public void setI(Integer i) {
        this.i = i;
    }
    public String getS() {
       return s;
    }
    public Integer getI() {
       return i;
    }
public GenericClass <String,Integer> printArrayContent(Integer[] a, String[]b){
        for(int p = 0; p<a.length; p++) {
            setI(a[p]);
            if (getI() != null) {
                    System.out.println(getI());
            }
        }
    for(int q = 0; q<b.length; q++) {
        setS(b[q]);
        if (getS() != null) {
                System.out.println(getS());
        }
    }
    return null;
}
}