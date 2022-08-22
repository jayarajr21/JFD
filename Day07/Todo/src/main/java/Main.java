import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public void main() {
        System.out.println("1.Add\n 2.View\n 3.Remove\n 4.Exit");
        ArrayList<Files> todo = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        while(true) {
            switch(choice) {
                case 1:
                    System.out.println("Enter the Id");
                    int id = sc.nextInt();
                    System.out.println("Enter the Notes");
                    String notes = sc.next();
                    todo.add(new Files(todo.size()+1 , notes ));
                    System.out.println("Notes successfully Added");
                    break;
                case 2:
                    if(todo.size() > 0)
                    {
                        todo.forEach( addedtodo -> System.out.println(id.getId() , notes.));
                    }
            }
        }
    }
}
