import java.util.ArrayList;
import java.util.Scanner;


public class start {

    public void start(){

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите имя магазина: ");
        String shop_answer = iScanner.nextLine();
        Shop shop  = new Shop(shop_answer);
        System.out.println("Хотите создать игрушку? ");
        String answer = iScanner.nextLine();
        Boolean flag = true;
        while (flag){
            if(answer.equals("")){
                flag = false;
            } else{
            view view = new view();
            presenter p = new presenter();
            ArrayList<String> input_list = view.getData();
            Toy toy = p.newToy(input_list);
            shop.put(toy);
            System.out.println("Хотите создать еще игрушку? ");
            answer =  iScanner.nextLine();
            flag = true;
            
        }}
        
        Game g = new Game();
        System.out.println("Сколько раз хотите разыграть игршку?: ");
        int number_of_games = Integer.parseInt(iScanner.nextLine());
        g.get(number_of_games, shop);
        iScanner.close();

    }
}


