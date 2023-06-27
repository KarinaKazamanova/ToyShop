import java.util.ArrayList;
import java.util.Scanner;


public class view {
    

    public ArrayList<String> getData(){
        ArrayList<String> result = new ArrayList<>();
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите индекс: ");
        String id_input = iScanner.nextLine();
        System.out.println("Введите название игрушки: ");
        String name_input = iScanner.nextLine();
        System.out.println("Введите вероятность выпадения: ");
        String weight_input = iScanner.nextLine();
        
        result.add(id_input);
        result.add(name_input);
        result.add(weight_input);
        return result;
        
           

    }
}
