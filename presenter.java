import java.util.ArrayList;

public class presenter {
    

    public Toy newToy(ArrayList<String> input_data){
        return new Toy(Integer.parseInt(input_data.get(0)), input_data.get(1), Double.parseDouble(input_data.get(2)));

    }
}
