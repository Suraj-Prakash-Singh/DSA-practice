import java.util.HashMap;

public class hashmaps {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
                //key,value

        map.put("navi",10);
        map.put("fnc",20);
        map.put("faze",30);

        System.out.println("Size of map is "+map.size());
        System.out.println(map);

        System.out.println(map.get("navi"));

        if(map.containsKey("fnc"))
            System.out.println("Contains");
        else
            System.out.println("Not contains");
    }
}
