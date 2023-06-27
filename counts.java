import java.util.ArrayList;

public class counts{

    public static int count_num(int elem, ArrayList<Integer> list){
        int count = 0;
        for (int element : list){
            if(element == elem){
                count += 1;
            }
        }
        return count;
    }
}