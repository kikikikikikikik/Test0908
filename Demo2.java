/**
 * @ClassName Demo2
 * @Desc TODO
 * @Auther 28893
 * @Date 2019/9/9  19:58
 * @Veresion 1.0
 */
import java.util.Map;
import java.util.HashMap;
public class Demo2 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.get("作者"));
        System.out.println(map.getOrDefault("作者","佚名"));
        System.out.println(map.containsKey("作者"));
        System.out.println(map.containsValue("佚名"));
        map.put("作者","鲁迅");
        map.put("书名","狂人日记");
        map.put("发行时间","1918年");
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.get("作者"));
        System.out.println(map.getOrDefault("作者","佚名"));
        System.out.println(map.containsKey("作者"));
        System.out.println(map.containsValue("佚名"));
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
