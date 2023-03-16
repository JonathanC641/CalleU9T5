import java.util.*;
public class Vet {
    private String name;
    private ArrayList<Animal> clients;

    public Vet(String name){
        this.name = name;
        clients = new ArrayList<Animal>();
    }

    public void addClient(Animal a){
        if(clients.contains(a)){
            System.out.println( a.getName() +  " is already a client of " + name +"!");
        }else{
            clients.add(a);
            System.out.println("Welcome to " + name + " office, " + a.getName() + "!");
        }
    }
}
