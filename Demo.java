/**
 * @ClassName Demo
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/9/9  19:44
 * @Veresion 1.0
 */
import java.sql.SQLOutput;
import java.util.Collection;
import java.util.Arrays;
import java.util.ArrayList;
public class Demo {
    public static void main(String[] args) {
        Collection <String> list=new ArrayList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add("生");
        list.add("活");
        list.add("好");
        list.add("难");
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        Object[] array=list.toArray();
        System.out.println(Arrays.toString(array));
        for(String s:list){
            System.out.println(s);
        }
        list.remove("难");
        for(String s:list){
            System.out.println(s);
        }
        list.clear();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
