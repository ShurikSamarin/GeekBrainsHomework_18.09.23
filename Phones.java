//package Task_1;
import java.util.HashMap;
import java.util.Map;

public class Phones {
    private Map<String, String> map = new HashMap<>();

    void add(String phone1, String phone2, String name){
        map.put(phone1 +", " + phone2, name);
    }

    String findByName(String userName){
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for (Map.Entry<String, String> entry: map.entrySet()){
            String phone = entry.getKey();
            String name = entry.getValue();
            if (name.equals(userName)){
                stringBuilder.append(count++);
                stringBuilder.append(". ");
                stringBuilder.append(name);
                stringBuilder.append(": ");
                stringBuilder.append(phone);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    String getList(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry: map.entrySet()){
            String phone = entry.getKey();
            String name = entry.getValue();
            stringBuilder.append(name);
            stringBuilder.append(": ");
            stringBuilder.append(phone);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }


}
