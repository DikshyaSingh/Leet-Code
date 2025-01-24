import java.util.HashMap;
import java.util.Map;

public class romanToInt {
    public static int rom(String s){
        Map<Character,Integer> map= new HashMap<>();

            map.put('I',1);
            map.put('V',5);
            map.put('X',10);
            map.put('L',50);
            map.put('C',100);
            map.put('D',500);
            map.put('M',1000);

            int a =0;
            for (int i=0; i<s.length();i++){
                if(i<s.length()-1 && map.get(s.charAt(i))< map.get(s.charAt(i + 1))){
                    a -= map.get(s.charAt(i));
                }
                else{
                    a += map.get(s.charAt(i));
                }
        }
        
        return a;
    }

    public static void main(String[] args) {
        System.out.println(rom("LX"));
    }
}
