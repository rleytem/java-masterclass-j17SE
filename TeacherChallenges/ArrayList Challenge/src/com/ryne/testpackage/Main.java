package com.ryne.testpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    //create interactive console program
    //give user menu of options shown here:
    //==================================================
    //available actions:
    //0 - to shutdown
    //1 - to add item(s) to grocery list (comma delimted list)
    //2 - to remove any items (comma delimited list)
    //Enter a number for which action you want to do:
    //===================================================
    //use Scanner class to solicit a menu item, 0, 1, 2 and process the item accordingly
    //
    //grocery list should be an ArrayList
    //use methods on ArrayList to add items, remove, check if item is already on list and print a sorted list.
    //should print list sorted alphabetically after each operation
    //no duplicate items allowed on list

    public static void main(String[] args) {

        //create new user input object
        Scanner input = new Scanner(System.in);
        //create grocerylist ArrayList
        ArrayList<String> groceryList = new ArrayList<>();
        //create while loop running flag, if false, we exit program
        boolean runningFlag = true;

        //while loop, prints the menu, runs as long as we haven't selected 0.
        //calls a method to print the menu
        //asks user for a selection using a switch statement
        //case 1 calls addItems method to add items to shopping list
            //when addItems returns a String array into a list, we check each item against our current shopping list
            //as long as its not a duplicate we add it, we also trim whitespace off
            //we sort after each add to grocery lists and print it out
        //case 2 calls removeItems method to remove items
            //removeItems also returns a String array and we turn it into a list
            //we can just use the remove all method to take it off our curren grocery list
            //we then sort again and reprint
        //case 0 sets the while loop flag to false and breaks from the switch statement
        //default catches anything thats not those three choices
        while (runningFlag) {
            printMenu();
            System.out.println("PLEASE MAKE A SELECTION: ");
            String userChoice = input.nextLine();

            switch (userChoice) {
                case "1":
                    String[] addItem = addItems();
                    List<String> addList = List.of(addItem);
                    for (String element : addList) {
                        if (!groceryList.contains(element)) {
                            String temp = element.trim();
                            groceryList.add(temp);
                        }
                    }
                    groceryList.sort(Comparator.naturalOrder());
                    System.out.println(groceryList);
                    break;
                case "2":
                    String[] removeItem = removeItems();
                    List<String> removeList = List.of(removeItem);
                    groceryList.removeAll(removeList);
                    groceryList.sort(Comparator.naturalOrder());
                    System.out.println(groceryList);
                    break;
                case "0":
                    runningFlag = false;
                    break;
                default:
                    System.out.println("INVALID SELECTION PLEASE TRY AGAIN!");
            }
        }

        //outside of while loop, we check quickly if the grocery list is empty, if it is, print a statement saying so
        //otherwise print the entire grocery list
        if (groceryList.isEmpty()) {
            System.out.println("GROCERY LIST IS EMPTY...");
        } else {
            System.out.println("GROCERY LIST CONTAINS:" + groceryList);
        }
    }

    //printMenu() prints our menu to remind the user everytime what their choices are
    //stylized and looks nice
    public static void printMenu() {
        System.out.println("=".repeat(50));
        System.out.println(" AVAILABLE ACTIONS:");
        System.out.println(" 0 - SHUT DOWN");
        System.out.println(" 1 - ADD GROCERY ITEMS TO SHOPPING LIST");
        System.out.println(" 2 - REMOVE GROCERY ITEMS FROM SHOPPING LIST");
        System.out.println("=".repeat(50));
    }

    //addItems method takes in user input to add items to  a shopping list
    //user enters using a comma delimited String
    //we then take that string and split it and return the split Array of strings
    public static String[] addItems() {
        Scanner addInput = new Scanner(System.in);
        System.out.println("PLEASE ENTER ITEM(S) TO ADD TO SHOPPING LIST:");
        String items = addInput.nextLine();
        String[] itemsSplit = items.split(",");

        return itemsSplit;
    }

    //removeItems takes in user input to remove items from a shopping list
    //user enters using a comma delimited String
    //we then take that string and split it and return the split Array of strings
    public static String[] removeItems() {
        Scanner addInput = new Scanner(System.in);
        System.out.println("PLEASE ENTER ITEM(S) TO REMOVE FROM SHOPPING LIST:");
        String items = addInput.nextLine();
        String[] itemsSplit = items.split(",");

        return itemsSplit;
    }
}