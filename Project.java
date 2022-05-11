// 6. Inventory Management System : Create a Java Application to store manage an inventory store.
// Create appropriate class to denote an item and user.
// Store all the items in an array
// Definition of done:
// i. The system should ask user name and password. If user is an admin open admin portal otherwise open user portal
// ii.  The system should given user the option to purchase multiple items from all the available items.
// iii. The system should given admin the option to addItem, delete and update an item.
// iv.  Store the information in file named inventory.txt


import java.util.*;
import java.io.*;

public class Project{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int count=0;

    Login l=new Login();

    Inventory in =new Inventory();


    Inventory in1=new Inventory("mobile",15,9000.00);
    Inventory in2=new Inventory("charger",50,100.00);
    Inventory in3=new Inventory("pendrive",45,200.00);
    Inventory in4=new Inventory("laptop",20,43000.00);
    Inventory in5=new Inventory("tab",25,23000.00);
    Inventory in6=new Inventory("cooler",30,5500.00);
    Inventory in7=new Inventory("dishwasher",20,6000.00);
    Inventory in8=new Inventory("television",15,17000.00);
    Inventory in9=new Inventory("camera",50,8000.00);
    Inventory in10=new Inventory("speakers",12,4000.00);
    Inventory in11=new Inventory("Iron",32,780.00);
    Inventory in12=new Inventory("earphones",32,100.00);

    in.addItem(in1);
    in.addItem(in2);
    in.addItem(in3);
    in.addItem(in4);
    in.addItem(in5);
    in.addItem(in6);
    in.addItem(in7);
    in.addItem(in8);
    in.addItem(in9);
    in.addItem(in10);
    in.addItem(in11);
    in.addItem(in12);





    in.file();

    System.out.println("****************WELCOME********************");

    while(count<3){

      System.out.println("Enter 1 if admin\nEnter 2 if user");
      int n=sc.nextInt();

      if(n==1){

        l.adminLogin();
        break;

      }
      else if(n==2){

        l.userLogin();
        break;
      }
      else{

        System.out.println("enter the number specified");
        count++;
      }
    }
    if(count==3){

      System.out.println("you have completed max attempts\ttry later");
    }


  }
}

