import java.util.*;
import java.io.*;

class Admin extends Inventory{
    char ch='y';
    Scanner sc=new Scanner(System.in);
    Admin(){
        System.out.println("****************WELCOME********************");
        System.out.println("The stock in the shop is");
        super.display();
        try{
            while(ch=='y') {
                System.out.println("enter 1 to add  item in stock");
                System.out.println("ente  2 to delete item from the stock");
                System.out.println("enter 3 to update item in stock");
                int n=sc.nextInt();

                switch(n){
                    case 1:
                    addItem();
                    break;

                    case 2:
                    delete();
                    break;

                    case 3:
                    update();
                    break;

                }

                System.out.println("wanna do something else");
                System.out.println("if yes press y\nif no press n");
                ch=sc.next().charAt(0);

                if(ch=='n')
                    break;
                else if(ch=='y')
                    continue;

            }
             file();
            newList();
        }
            catch(Exception e){
                System.out.println("something went wrong \ncheck the input again");
            }
           
        }

        void addItem(){

            char ch='y';
            try{
                while(ch=='y')
                {
                    System.out.println("enter the no of items to added");
                    int n=sc.nextInt();

                    for(int i=0;i<n;i++){

                        System.out.println("enter the name of the item");
                        String name=sc.next();

                        System.out.println("enter the quantity");
                        int q=sc.nextInt();

                        System.out.println("enter the price ");
                        double price=sc.nextDouble();

                        Inventory in=new Inventory(name,q,price);
                        super.addItem(in);



                    }
                    System.out.println("would you like to add something else\nif yes press y\n if not press n ");
                    ch=sc.next().charAt(0);

                    if(ch=='n')
                        break;
                    else
                        continue;
                }
            }
            catch(Exception e){
                System.out.println("oops!! somthing wrong occured :(");
                System.out.println("check your input again");
            }


        }
        void delete(){

            char ch='y';
            try{
                while(ch=='y'){

                    System.out.println("enter the no of items to be removed");
                    int n=sc.nextInt();
                    for(int j=0;j<n;j++){

                        System.out.println("enter the item to remove");

                        String name=sc.next();

                        boolean flag=true;


                        for(int i=0;i<d.size();i++){
                            if(d.get(i).name.equals(name)){
                                flag=false;
                                d.remove(i);

                            }

                        }
                        if(flag==true){
                            System.out.println("not in stock\ncheck again");
                            n=n+1;

                        }
                    }
                    System.out.println("would like to remove something else\nif yes press y\nif no press n ");
                    ch=sc.next().charAt(0);

                    if(ch=='n')
                        break;
                    else
                        continue;
                }}
                catch(Exception e){
                    System.out.println("oops!! something went wrong :(\ncheck your input again");

                }
            }

            void update(){

                char ch='y';
                try{
                    while(ch=='y'){

                        System.out.println("enter the no of items to be updated");
                        int n=sc.nextInt();
                        for(int j=0;j<n;j++){
                            System.out.println("enter the item to updated");

                            String name=sc.next();

                            System.out.println("enter the quantity ");
                            int q=sc.nextInt();

                            System.out.println("enter the price");
                            double p=sc.nextDouble();

                            boolean flag=true;

                            for(int i=0;i<d.size();i++){
                                if(d.get(i).name.equals(name)){
                                    flag=false;
                                    d.set(i,new Inventory(name,q,p));

                                }

                            }
                            if(flag==true){
                                System.out.println("not in stock\ncheck again");
                                n=n+1;
                            }

                        }
                        System.out.println("would like to update something else\nif yes press y\nif no press n ");
                        ch=sc.next().charAt(0);

                        if(ch=='n')
                            break;
                        else
                            continue;
                    }}
                    catch(Exception e){
                        System.out.println("oops!! something went wrong :(\ncheck your input again");

                    }

                }

                void newList(){

                    System.out.println("\n*******************New List*********************\n");

                    super.display();

                    System.out.println("\n");
                    System.out.println("The List is updated succesfully\n");
                    System.out.println("HAVE A NICE DAY!! (^_^)");
                }

                void file(){
                    try{

                        File f=new File("InfoAdmin.txt");
                        FileWriter w=new FileWriter(f);
                        BufferedWriter bw = new BufferedWriter(w);

                        bw.write("Admin  logged in\n");
                        bw.write(" The updated list is:\n");
                        bw.write("************Inventory Shop******************\n");
                        for(int i=0;i<d.size();i++){
                            bw.write("Item name :- "+d.get(i).name+"\n");
                            bw.write("quantity :- "+d.get(i).quantity+"\n");
                            bw.write("price :-"+d.get(i).price+"\n");
                            bw.write("\n");
                        }
                        bw.close();
                    }
                    catch(IOException e){

                        System.out.println("some error occured can't store the info in the file ");

                    }

                }
            }


