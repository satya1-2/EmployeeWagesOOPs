package employeeWageOops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AddressBook extends NewContact {
    public static void main(String[] args) {
        int flag = 0;
        int choice = 0;
        AddressBook newPerson = new AddressBook();
        List<AddressBook> person = new ArrayList<AddressBook>();


        Scanner scanner = new Scanner(System.in);
        while (flag != 1) {
            System.out.println(" enter add for 1");
            System.out.println(" enter edit for 2");
            System.out.println(" enter delete for 3");
            System.out.println(" enter exit for 4");
            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                System.out.println("enter first contact details : ");
                System.out.println("enter first name : ");
                newPerson.setFirstName(scanner.nextLine());
                System.out.println("enter last name : ");
                newPerson.setLastName(scanner.nextLine());
                System.out.println("enter State name : ");
                newPerson.setState(scanner.nextLine());
                System.out.println("Zip code : ");
                newPerson.setZip(scanner.nextLine());
                System.out.println("phone number : ");
                newPerson.setPhoneNumber(scanner.nextLine());
                System.out.println("enter the email : ");
                newPerson.setEmail(scanner.nextLine());

                NewContact contact = new NewContact(newPerson.getFirstName(), newPerson.getLastName(), newPerson.getState(), newPerson.getZip(), newPerson.getPhoneNumber(), newPerson.getEmail());
                System.out.println(contact);
                person.add(newPerson);
                System.out.println("enter second person contact");

                System.out.println(person);


            } else if (choice == 2) {
                System.out.println("which name you want edited : ");
                String name = scanner.nextLine();
                if (name.equals(newPerson.getFirstName())) {
                    System.out.println("edit first name : ");
                    newPerson.setFirstName(scanner.nextLine());
                    System.out.println("edit last name : ");
                    newPerson.setLastName(scanner.nextLine());
                    System.out.println("edit State name : ");
                    newPerson.setState(scanner.nextLine());
                    System.out.println("Zip code : ");
                    newPerson.setZip(scanner.nextLine());
                    System.out.println("edit number : ");
                    newPerson.setPhoneNumber(scanner.nextLine());
                    System.out.println("edit the email : ");
                    newPerson.setEmail(scanner.nextLine());

                    person.add(newPerson);

                    System.out.println(person);
                } else {
                    System.out.println("this name is not available");
                }
            } else if (choice == 3) {
                System.out.println("delete firstname");
                String nameDelete;
                nameDelete = scanner.nextLine();

                if (nameDelete.equals(newPerson.firstName)) {
                    if (newPerson.getFirstName().equals(nameDelete)) {
                        person.remove(newPerson);
                    }
                    System.out.println(person);
                } else if (choice == 4) {
                    flag = 1;
                }
            }
        }
    }}








