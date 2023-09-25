package arrayListPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class No13_Menu_Driven_ArrayList_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Menu-Driven Java Program to perform varies operations on arraylist");
        ArrayList<Integer> list = new ArrayList<>();
        boolean tobeContinued = true;
        while(tobeContinued){
            System.out.println("Please Enter the any one of the below option menu number: ");
            System.out.println("1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. Search for the Element");
            System.out.println("4. Stop the Game");
            int option = sc.nextInt();
            switch(option){
                case 1:
                    System.out.println("Please give me the new element to be added: ");
                    Integer element = Integer.valueOf(sc.nextInt());
                    list.add(element);
                    break;
                case 2:
                    System.out.println("Please select anyone of the option below: ");
                    System.out.println("1. Remove element by index: ");
                    System.out.println("2. Remove element by value: ");
                    int option2 = sc.nextInt();
                    if(option2 == 1)
                    {
                        System.out.println("Please give me the index: ");
                        int index = sc.nextInt();
                        if(index >= 0 && index <= list.size())
                            list.remove(index);
                        else
                            System.out.println("You have given a wrong index.");
                    }else if(option2 == 2){
                        System.out.println("Please give me the value to be removed:");
                        Integer value = Integer.valueOf(sc.nextInt());
                        if(list.contains(value)) {
                            list.remove(value);
                            System.out.println("The element has been removed.");
                        }
                        else
                            System.out.println("The given value is not present in the arraylist.");
                    }else
                        System.out.println("You have selected wrong option.");
                    break;
                case 3:
                    System.out.println("Please enter the element to be searched: ");
                    Integer value = Integer.valueOf(sc.nextInt());
                    int index = list.indexOf(value);
                    if(index == -1)
                        System.out.println("The given element is not present.");
                    else
                        System.out.println("The given element is present in index: " + index);
                    break;
                case 4:
                    tobeContinued = false;
                    break;

                default:
                    System.out.println("You have chosen the wrong option. Select the correct option.");
            }
        }
        System.out.println("************************\n         Thank you       \n ********************");

    }
}
