import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class Game {

    public void get(int acts, Shop shop){
        ArrayList<Integer> ids = new ArrayList<>();
        ArrayList<Integer> price_ids = new ArrayList<>();
        
        for (Toy toy : shop.getToys()){
            for (int i = 0; i < toy.getWeight(); i ++){
                ids.add(toy.getId());
            }
            
        }
        Random random = new Random();
        try(FileWriter writer = new FileWriter("prices.txt", true)){

            while(ids.size() > 0){
                int index = random.nextInt(ids.size());
                int price_id = ids.get(index);
                writer.write(Integer.toString(price_id) + " ");
                ids.remove(index);
            }
            
            
            writer.write("\n");


        } catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    
}}
