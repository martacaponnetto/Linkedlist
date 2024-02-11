import java.util.LinkedList;

/*Creare una classe Fruit che accenti nel costruttore
 il parametro name (String)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un LinkedList con elementi e stamparlo in console.
Aggiungere un elemento al primo posto della lista e uno all'ultimo
Stampare la collezione aggiornata*/
public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> fruitList = new LinkedList<>();
        fruitList.add(new Fruit("banana"));
        fruitList.add(new Fruit("kiwi"));
        fruitList.add(new Fruit("uva"));

        System.out.println("stampa frutta: ");
        printFruit(fruitList);
        //aggiungiamo al primo posto e all'ultimo posto nuova frutta
        fruitList.addFirst(new Fruit("mela"));
        fruitList.addLast(new Fruit("melograno"));
        System.out.println("\nstampa frutta aggiornata:");
        printFruit(fruitList);



    }
    public static void printFruit(LinkedList<Fruit> fruitList){
        for(Fruit fruit : fruitList){
            System.out.println("nome: " + fruit.getName());
        }
    }
}