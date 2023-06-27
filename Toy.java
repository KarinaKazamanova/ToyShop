public class Toy implements Comparable<Toy>{

    private int id;
    private String name;
    private double weight;


    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Toy(int id, String name, double weight){
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Toy t) {
        return new Double(weight).compareTo(t.getWeight());
        
    }

    @Override 
    public String toString() {
        // TODO Auto-generated method stub
        return Integer.toString(this.id);
    }
}