package hw15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListProgram {
    private String type;

    public ListProgram(){}

    public void getName() {
        String name = "ArrayList Program";
        System.out.println("Application name: " + name);
    }

    public void getDescription() {
        String description = "Create ArrayLists and manipulate the data";
        System.out.println("Description: " + description);
    }

    public void getVersion() {
        String version = "1.0.0";
        System.out.println("Version: " + version);
    }

    public void start(){
        selectTypeMenu();
    }
    private void selectTypeMenu() {
        Scanner input = new Scanner(System.in);
        String value;
        boolean loop = true;

        System.out.println("\n\033[34;1mARRAY LIST DEMO\033[0m\nThis program is case sensitive");
        System.out.println("You can enter [Int], [Dbl], [Str] as a valid ArrayList Type");
        System.out.println("To exit a program at any given time type [q]\n");
        System.out.println("\033[34;1m[SELECT TYPE]\033[0m\n");

        while (loop) {
            System.out.print("Please enter the ArrayList Type: ");
            value = input.nextLine();
            if (value.equals("q")) {
                loop = false;
                terminate();
            }
            if (!value.equals("Int") && !value.equals("Dbl") && !value.equals("Str")) {
                System.out.println("\033[34;1m" + "'" + value + "'" + " is not a valid input\033[0m");
            }
            else {
                switch (value) {
                    case "Int":
                        System.out.println("\n\033[34;1mYou selected Integer Type\033[0m");
                        List<Integer> intLst = new ArrayList<>();
                        this.type = "Int";
                        selectActionMenu(intLst, input, value, type);
                    case "Dbl":
                        System.out.println("\n\033[34;1mYou selected Double Type\033[0m");
                        List<Double> dblLst = new ArrayList<>();
                        type = "Dbl";
                        selectActionMenu(dblLst, input, value, type);
                    case "Str":
                        System.out.println("\n\033[34;1mYou selected String Type\033[0m");
                        List<String> strLst = new ArrayList<>();
                        type = "Str";
                        selectActionMenu(strLst, input, value, type);
                }
            }
        }
    }

    private void selectActionMenu(List<?> list, Scanner input, String value, String type) {
        boolean action = true;
        System.out.println("\n\033[34;1m[ACTION MENU]\033[0m\n\nSelect a valid Action\nValid inputs are: [add], [set], [remove], [get]");
        System.out.println("Enter [up] to to go back to selecting ArrayList Types");
        while(action){
            System.out.print("Please select your action: ");
            value = input.nextLine();
            if (value.equals("q")) {
                action = false;
                terminate();
            }
            else if (value.equals("up")) {
                selectTypeMenu();
            }
            if (!value.equals("add") && !value.equals("set") && !value.equals("remove") && !value.equals("get")) {
                System.out.println("\033[31;1m" + "'" + value + "'" + " is not a valid input\033[0m");
            }
            else {
                switch(value) {
                    case "add":
                        add(list, input, value);
                    case "remove":
                        remove(list, input, value);
                    case "set":
                        set(list, input, value);
                    case "get":
                        get(list, input, value);
                    default:
                        System.out.println("\n\n\033[31;1m" + "'" + value + "'" + " is an invalid input\nValid inputs [add], [remove], [set], [get]\033[0m\n");
                }
            }
        }
    }

    private void add (List list, Scanner input, String value) {
        boolean add = true;
        System.out.println('\n' + "\033[34;1m[ADD]  Method\033[0m" + "\n\n" + "Here you can add elements to this ArrayList" + '\n');
        System.out.println("Enter [up] to go one level up");
        while(add) {
            System.out.print("Enter a value to add: ");
            value = input.nextLine();
            if (value.equals("up"))     // Check for exit criteria
            {
                selectActionMenu(list, input, value, type);
            }
            else if (value.equals("q")){
                add = false;
                terminate();
            }
            else {
                try
                {
                    if (type.equals("Int")) {
                        list.add(Integer.parseInt(value));
                    }
                    else if (type.equals("Dbl")) {
                        list.add(Double.parseDouble(value));
                    }
                    else {
                        list.add(value);
                    }
                    System.out.println(list);
                }
                catch (NumberFormatException e)
                {
                    System.out.println("\033[31;1m" + value + " is not a valid input\033[0m");
                }
            }
        }
    }

    private void remove (List list, Scanner input, String value) {
        boolean remove = true;
        boolean innerLoop = true;
        emptyList(list, input, value);
        System.out.println('\n' + "\033[34;1m[REMOVE] Method\033[0m" + "\n\n" + "Here you can remove elements from this ArrayList" + '\n');
        System.out.println("Enter [up] to go one level up");
        System.out.println("You can choose to remove by index or value");
        while (remove) {
            System.out.print("Type [index] or [value]: ");
            value = input.nextLine();
            if (value.equals("q")) {
                remove = false;
                terminate();
            }
            if (!value.equals("index") && !value.equals("value")) {
                System.out.println("\033[31;1m" + value + " is not a valid input\033[0m");
            }
            else {
                if (value.equals("index")) {
                    System.out.println("\n\033[34;1m[REMOVE BY INDEX] Method\033[0m\n");
                    while (innerLoop) {
                        if (list.isEmpty()) {
                            while(!value.equals("up")) {
                                System.out.print("\n\033[31;1mList is empty, please enter [up] and select [add]: \033[0m");
                                value = input.nextLine();
                            }
                            innerLoop = false;
                            selectActionMenu(list, input, value, type);
                        }
                        System.out.println("Valid index value range: " + "0 - " + (list.size() - 1));
                        System.out.println("Current state of an ArrayList: " + "\n" + list + "\n");
                        System.out.print("Please enter a valid index: ");
                        value = input.nextLine();
                        if (value.equals("up")) { selectActionMenu(list, input, value, type); }
                        try {
                            System.out.println("\n\033[31;1m " + "Value: " + list.get(Integer.parseInt(value)) + " at index: " + value + " was removed\033[0m\n");
                            list.remove(Integer.parseInt(value));
                            System.out.println("Before: " + list);
                            System.out.println("After : " + list + "\n");
                        } catch (NumberFormatException | IndexOutOfBoundsException a) {
                            System.out.println("\033[31;1m" + value + " is not a valid input\033[0m");
                        }
                    }
                }
                else {
                    System.out.println("\n\033[34;1m[REMOVE BY VALUE] Method\033[0m\n");
                    System.out.println("You selected remove by Value (if duplicate values exist \n" +
                            "then a first occurrence of a value will be removed\n");
                    while (innerLoop) {
                        if (list.isEmpty()) {
                            while(!value.equals("up")) {
                                System.out.print("\n\033[31;1mList is empty, please enter [up] and select [add]: \033[0m");
                                value = input.nextLine();
                            }
                            innerLoop = false;
                            selectActionMenu(list, input, value, type);
                        }
                        System.out.println("Current state of an ArrayList: " + "\n" + list);
                        System.out.print("Please enter a value: ");
                        value = input.nextLine();
                        if (value.equals("up")) { selectActionMenu(list, input, value, type); }
                        if (type.equals("Int")){
                            if (!list.contains(Integer.parseInt(value))) {
                                System.out.println("\033[31;1m" + "'" + value + "'" + " does not exist in the context of this list\033[0m");
                            } else {
                                try {
                                    Integer intObj = Integer.parseInt(value);
                                    System.out.println("Before: " + list);
                                    list.remove(intObj);
                                    System.out.println("After : " + list + "\n" + "\033[31;1m " + value + " was removed\033[0m");
                                } catch (NumberFormatException | IndexOutOfBoundsException a) {
                                    System.out.println("\033[31;1m" + value + " is not a valid input\033[0m");
                                }
                            }
                        }
                        else if (type.equals("Dbl")){
                            if (!list.contains(Double.parseDouble(value))) {
                                System.out.println("\033[31;1m" + "'" + value + "'" + " does not exist in the context of this list\033[0m");
                            } else {
                                try {
                                    Double dblObj = Double.parseDouble(value);
                                    System.out.println("Before: " + list);
                                    list.remove(dblObj);
                                    System.out.println("After : " + list + "\n" + "\033[31;1m " + value + " was removed\033[0m");
                                } catch (NumberFormatException | IndexOutOfBoundsException a) {
                                    System.out.println("\033[31;1m" + value + " is not a valid input\033[0m");
                                }
                            }
                        }
                        else {
                            if (!list.contains(value)) {
                                System.out.println("\033[31;1m" + "'" + value + "'" + " does not exist in the context of this list\033[0m");
                            } else {
                                try {
                                    System.out.println("Before: " + list);
                                    list.remove(value);
                                    System.out.println("After : " + list + "\n" + "\033[31;1m " + value + " was removed\033[0m");
                                } catch (NumberFormatException | IndexOutOfBoundsException a) {
                                    System.out.println("\033[31;1m" + value + " is not a valid input\033[0m");
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void set (List list, Scanner input, String value){
        int index = 0;
        boolean loop = true;
        emptyList(list, input, value);
        System.out.println('\n' + "\033[34;1m[SET] Method\033[0m" + '\n');
        System.out.println("You can replace existing values by providing index and value");
        System.out.println("Current ArrayList state");
        System.out.println(list);
        while (loop) {
            boolean set = true;
            System.out.print("Enter desired index value: ");
            try {
                value = input.nextLine();
                if (value.equals("up")) {
                    selectActionMenu(list, input, value, type);
                }
                else if (value.equals("q")) {
                    terminate();
                    loop = false;
                }
                Integer.parseInt(value);
                if (Integer.parseInt(value) > (list.size() - 1) || Integer.parseInt(value) < 0){
                    throw new IndexOutOfBoundsException();
                } else {
                    index = Integer.parseInt(value);
                    currentIndex(list, value);
                }
            } catch (NumberFormatException | IndexOutOfBoundsException a) {
                System.out.println("\033[31;1m" + "'" + value + "'" + " is not a valid input\033[0m");
                set = false;
            }
            while (set) {
                System.out.print("Would you like to set a value? y/n: ");
                value = input.nextLine();
                if (value.equals("up")) {
                    selectActionMenu(list, input, value, type);
                } else if (value.equals("q")) {
                    terminate();
                }
                if (value.equals("y")) {
                    System.out.print("Please enter a value: ");
                    value = input.nextLine();
                    try {
                        if (type.equals("Int")) {
                            System.out.print("\nBefore: " + list + "\n");
                            list.set(index, Integer.parseInt(value));
                            System.out.print("After : " + list + "\n");
                            set = false;
                        }
                        else if (type.equals("Dbl")) {
                            System.out.print("\nBefore: " + list + "\n");
                            list.set(index, Double.parseDouble(value));
                            System.out.print("After : " + list + "\n");
                            set = false;
                        }
                        else {
                            System.out.print("\nBefore: " + list + "\n");
                            list.set(index, value);
                            System.out.print("After : " + list + "\n");
                            set = false;
                        }
                    } catch (NumberFormatException | IndexOutOfBoundsException a) {
                        System.out.println("\033[31;1m" + "'" + value + "'" + " is not a valid input\033[0m");
                    }
                }
                else if (value.equals("n")) {
                    set = false;
                }
                else {
                    System.out.println("\033[31;1m" + "'" + value + "'" + " is not a valid input\033[0m");
                }
            }
        }
    }

    private void get(List list, Scanner input, String value){
        boolean get = true;
        emptyList(list, input, value);
        System.out.println('\n' + "\033[34;1m[GET] Method\033[0m" + "\n\n" + "Here you can retrieve elements from this ArrayList" + '\n');
        while (get) {
            System.out.print("Enter [all] or [index]: ");
            value = input.nextLine();
            if (value.equals("up")) {
                selectActionMenu(list, input, value, type);
            } else if (value.equals("q")) {
                terminate();
                get = false;
            } else {
                if (value.equals("all")) {
                    System.out.println("Displaying current ArrayList:\n" + list);
                }
                else if (value.equals("index")) {
                    try {
                        System.out.println("Valid index value range: " + "0 - " + (list.size() - 1));
                        System.out.print("Please enter a valid index value: ");
                        value = input.nextLine();
                        System.out.println(list.get(Integer.parseInt(value)));
                    } catch (NumberFormatException | IndexOutOfBoundsException a) {
                        System.out.println("\033[31;1m" + "'" + value + "'" + " is not a valid input\033[0m");
                    }
                }
                else {
                    System.out.println("\033[31;1m" + "'" + value + "'" + " is not a valid input\033[0m");
                }
            }
        }
    }

    private void currentIndex(List list, String value){
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == Integer.parseInt(value)) {
                if (i == (list.size() - 1)) {
                    System.out.print("\033[34;1m" + list.get(i) + "\033[0m" + "]\n");
                }
                else {
                    System.out.print("\033[34;1m" + list.get(i) + "\033[0m, ");
                }
            }
            else {
                if (i == (list.size() - 1)){
                    if (i == Integer.parseInt(value) && i == (list.size() - 1)) {
                        System.out.println("]\n");
                    }
                    else {
                        System.out.print(list.get(i) + "]\n");
                    }
                }
                else {
                    System.out.print(list.get(i) + ", ");
                }
            }
        }
    }

    private void emptyList(List list, Scanner input, String value) {
        if (list.isEmpty()) {
            while(!value.equals("up")) {
                System.out.print("\n\033[31;1mList is empty, please enter [up] and select [add]: \033[0m");
                value = input.nextLine();
            }
            selectActionMenu(list, input, value, type);
        }
    }

    private void terminate(){
        System.out.print("Terminating");
        for (int i = 0; i < 5; i++) {
            System.out.print(" . ");
            try{
                Thread.sleep(250);
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
        System.out.print("\n\033[34;1mProcess terminated successfully");
        System.exit(0);
    }
}