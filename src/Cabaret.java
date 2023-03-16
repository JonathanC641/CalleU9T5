import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cabaret {
    private String name;
    private ArrayList<Performer> performers;

    public Cabaret(String name){
        this.name = name;
        performers = new ArrayList<Performer>();
    }

    public String getName(){
        return name;
    }

    public ArrayList<Performer> getPerformers(){
        return performers;
    }

    public boolean addPerformer(Performer p ){
        if(performers.indexOf(p) == -1){
            performers.add(p);
            return true;
        }
        return false;
    }

    public boolean removePerformer(Performer p ){
        if(performers.contains(p)){
            performers.remove(performers.indexOf(p));
            return true;
        }
        return false;
    }

    public double averagePerformerAge(){
        double total = 0;
        for(Performer p : performers){
            total+=p.getAge();
        }
        return total / performers.size();
    }

    public ArrayList<Performer> performersOverAge(int age){
        ArrayList<Performer> temp = new ArrayList<Performer>();
        for(Performer p : performers){
            if(p.getAge() >= age){
                temp.add(p);
            }
        }
        return temp;
    }

    public void groupRehearsal(){
        for(Performer p : performers){
            System.out.println("REHEARSAL CALL! " + p.getName());
            boolean check = p instanceof Comedian;
            if(check){
                ((Comedian) p).rehearse(false);
            }else{
                p.rehearse();
            }
        }
    }

    public void cabaretShow(){
        for(Performer p : performers){
            System.out.println("Welcome to the cabaret! Next act up... " + p.getName());
            boolean check = p instanceof Dancer;
            if(check){
                ((Dancer) p).pirouette(2);
            }
            ((Performer) p).perform();
        }
    }
}
