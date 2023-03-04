package org.susan.models;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = " SusanEmpire.company.com";


    // constructor to receive the first name and the last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;



        // call a method asking for the department - return the department
        this.department = setDepartment();


        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + password);


        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;

    }


    // Ask for department

    private String setDepartment() {
        System.out.println("New worker: " + firstName + ". Departments code:\n1.For Sales\n2.For Developer\n3.For Accounting\n0.For none\nEnter Department code: ");
        Scanner s = new Scanner(System.in);
        int depChoice = s.nextInt();
        switch (depChoice) {
            case 1:
                department = "Sales";
                break;
            case 2:
                department = "Developer ";
                break;
            case 3:
                department = "Accounting";
                break;
            case 0:
                department = "none";
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        return department;

    }

    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@#%&";
        char[] password = new char[length];

        for (int i = 0; i < length; i++) ;
        int rand = (int) (Math.random() * passwordSet.length());
        // password[i] = passwordSet.charAt(rand);

        String passwordSet1 = passwordSet;
        return passwordSet;
    }

    // set mailbox capacity
    public void setMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }

    // the alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    // Change password
    public void changePassword(String newPassword) {
        this.password = newPassword;
    }
    public int getMailBoxCapacity() {return mailBoxCapacity; }
    public String getAlternateEmail() {return alternateEmail;  }
    public String getPassword() {return password; }

    public String showInfo() {
return  "DISPLAY NAME: " + firstName + " " + lastName +
        "\nCOMPANY EMAIL: " + email +
        "\nMAILBOX CAPACITY : " + mailBoxCapacity  +  "mb";
    }


}