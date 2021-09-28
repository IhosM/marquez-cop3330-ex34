/*
 *  UCF COP3330 Fall 2021 Assignment 34 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package Exercise34;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class Solution34
{
    private static void printList(ArrayList<String> employees)
    {
        System.out.println("There are " + employees.size() + " employees:");
        for (String employee : employees)
        {
            System.out.println(employee);
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> employees = new ArrayList<>(
                Arrays.asList("John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"));
        printList(employees);

        System.out.print("\nEnter an employee name to remove: ");
        String employee = scan.nextLine();
        employees.remove(employee);
        System.out.print("\n");
        printList(employees);
        scan.close();
    }

}
