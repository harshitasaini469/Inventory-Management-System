import java.util.*;
import java.io.*;

public  class User extends Inventory{
	Scanner sc=new Scanner(System.in);

	static ArrayList<String>item=new ArrayList<>();
	static ArrayList<Integer>quantity=new ArrayList<>();
	static ArrayList<Double>price=new ArrayList<>();


	User(){

		System.out.println("WELCOME TO THE INVENTORY SHOP!!!");
		System.out.println("items available in the shop are:");
		super.display();
		purchase();

		file();

	}

	public static void purchase(){

		Scanner sc=new Scanner(System.in);

		char ch='y';

		try{
			while(ch=='y')
			{
				System.out.println("\nEnter the no of items you want to buy\n");
				int n=sc.nextInt();

				for(int i=0;i<n;i++){

					System.out.println("Enter the name of the item");
					String name=sc.next();

					System.out.println("Enter the quantity");
					int q=sc.nextInt();


					

					boolean flag=true;
					for(int j=0;j<d.size();j++){
						if(d.get(j).name.equals(name)){
							flag=false;
							double p=d.get(j).price;
							price.add(p);

							item.add(name);
							quantity.add(q);

						}

					}
					if(flag==true){
						System.out.println("this item is  not available in stock \npls check again");
						n=n+1;
					}


				}


				System.out.println("would you like to buy something else\nif yes press y\nif not press n ");
				ch=sc.next().charAt(0);

				if(ch=='n')
					break;
				else
					continue;
			}
			bill();
		}

		catch(Exception e){
			System.out.println("something went wrong :(");
			System.out.println("pls enter the data in specified form only");
		}
	}


	public static void bill(){
		double sum=0;

		System.out.println("\n**********************BILL**********************");
		System.out.println("item\t\tquantity\tprice\n");
		try{
			for(int i=0;i<item.size();i++){
				System.out.printf("%-20s %-10d %5.2f \n",item.get(i),quantity.get(i),quantity.get(i)*price.get(i));

			}

			for(int j=0;j<item.size();j++){

				sum+=quantity.get(j)*price.get(j);

			}

			System.out.println("\n");
			System.out.println("The total for your purchase is  Rs. "+sum);
			System.out.println("\n");
			System.out.println("Thank you for shopping in our store :)");
			System.out.println("HAVE A NICE DAY!! (^_^)");

		}
		catch(Exception e){
			System.out.println("something went wrong :(\nThe bill can't get printed\nsorry for the inconvinience");

		}


	}



	public static void file(String n){
		double sum=0;
		try{
			File f=new File("InfoUser.txt");
			FileWriter w=new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(w);

			bw.write("A user named  "+ n +" logged in\n");
			for(int i=0;i<item.size();i++){
				bw.write("\n");
				bw.write("Item purchased :- "+item.get(i)+"\n");
				bw.write("quantity :- "+quantity.get(i)+"\n");
				bw.write("price :-"+price.get(i)+"\n");
				bw.write("\n");
			}

			for(int j=0;j<item.size();j++){

				sum+=quantity.get(j)*price.get(j);

			}
			bw.write("The total for the purchase is Rs."+sum);


			

			bw.close();

		}

		catch(IOException e){
			System.out.println("some error occured can't store the info in the file ");
		}
	}


}

