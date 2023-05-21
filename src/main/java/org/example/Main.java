package org.example;
//package org.arpit.java2blog;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.




public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        ArrayList<Employee> listofemployee = new ArrayList<>();


        listofemployee.add(new Employee("Yomna Mohamed", 1,24,"Software Engineer", 20000));
        listofemployee.add(new Employee("Mohamed Ahmed", 2,30,"Data Engineer", 10000));
        listofemployee.add(new Employee("sara Mohamed", 3,23,"QA Engineer", 13000));
        listofemployee.add(new Employee("Ali Ahmed", 4,29,"front end developer", 16000));


        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("employee.txt"));
        out.writeObject(listofemployee);

        FileInputStream  Fs = new FileInputStream("employee.txt");
        ObjectInputStream Os = new ObjectInputStream(Fs);
        ArrayList<Employee> object3 = (ArrayList<Employee>)Os.readObject();

        Iterator itr = object3.iterator();

        while(itr.hasNext()) {
            Employee element = (Employee) itr.next();
            if(element.getName().equals("Mohamed Ahmed") && element.getId().equals(2))
            {
                itr.remove();
                System.out.println("Removing Employee Successfully from file");

                break;
            }
        }





        // Catch block to handle if exceptions occurs

        }

    }
