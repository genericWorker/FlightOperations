package edu.dccc.flightops;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import edu.dccc.utils.CSVReaderWriter;


public class ReadCSVWithScannerEmployee {

    //  This implementation using Split

    public void testEmployeeSplit() throws IOException {
        // open file input stream
        BufferedReader reader = new BufferedReader(new FileReader(
                "./resources/employees.csv"));

        // read file line by line
        String line = null;
        List<Employee> empList = new ArrayList<>();
       // reader.readLine();
        while ((line = reader.readLine()) != null) {
            Employee emp = new Employee();
            // Split delimited line of data into an array
            String[] data =  line.split(",");
            emp.setId(data[0]);
            emp.setName(data[1]);
            emp.setRole(data[2]);
            emp.setSalary(data[3]);
            empList.add(emp);
        }

        //close reader
        reader.close();

        System.out.println(empList);

    }

    //////////////////////////////////////////////
    //  This ld implementation using Scanner
    // Obsolete don't use
    /////////////////////////////////////////////
    public void testEmployeeScanner() throws IOException {
        // open file input stream
        BufferedReader reader = new BufferedReader(new FileReader(
                "./resources/employees.csv"));

        // read file line by line
        String line = null;
        Scanner scanner = null;
        int index = 0;
        List<Employee> empList = new LinkedList<>();

        while ((line = reader.readLine()) != null) {
            Employee emp = new Employee();
            scanner = new Scanner(line);
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                String data = scanner.next();
                if (index == 0)
                    emp.setId(data);
                else if (index == 1)
                    emp.setName(data);
                else if (index == 2)
                    emp.setRole(data);
                else if (index == 3)
                    emp.setSalary(data);
                else
                    System.out.println("invalid data::" + data);
                index++;
            }
            index = 0;
            empList.add(emp);
        }

        //close reader
        reader.close();

        System.out.println(empList);

    }




    //   Use Generic CSVReadWriter instead of the one this class file.
    public static void main(String[] args) throws IOException {
        List<Employee> storage = new ArrayList<Employee>();
        CSVReaderWriter csv = new CSVReaderWriter("./resources/employees.csv",storage, Employee.class );
        csv.loadFromCSV(false);
        for (Employee e: storage) {
            System.out.println(e);
        }
        storage.add(new Employee("5","Svensen","Treasurer","25000"));
        csv.saveToCSVDefaultSort("id,name,role,salary");
    }

}