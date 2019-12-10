import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Domino testDomino = new Domino(3, 2);
        Todo newTodo = new Todo("Buy milk", "high", true);

        List<Domino> dominoes = new ArrayList<>();
        List<Todo> todos = new ArrayList<>();

        dominoes.add(testDomino);
        todos.add(newTodo);

        for (Domino d : dominoes) {
            d.printAllFields();
        }

        for (Todo t : todos) {
            t.printAllFields();
        }




    }
}

