import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Homework {
    public static void main(String[] args) {
        List<String> example=new ArrayList<>();
        example.add("Hello");
        example.add("Hello");
        example.add("my");
        example.add("my");
        example.add("name");
        example.add("is");
        example.add("Danil");
        System.out.println(uniqueWithSet(example));
        System.out.println(uniqueWithList(example));
    }
    public static List uniqueWithSet(List<String>example){
        Set<String> hashSet = new HashSet<>();
        for(int i=example.size()-1;i>=0;i--) {
            hashSet.add(example.get(i));
        }
        List<String> result = new ArrayList<>(hashSet);
        return result;
    }
    public static List uniqueWithList(List<String>example){
        List<String> result = new ArrayList<>(example);
        for(int i=0;i<result.size();++i){
            int iterator=0;
            for (String s : result) {
                if (result.get(i).equals(s)) {
                    iterator++;
                }
            }
            if(iterator>1){
                result.remove(i);
            }
        }
        return result;
    }
}
