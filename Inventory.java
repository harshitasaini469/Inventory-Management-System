import java.util.*;
import java.io.*;

public class Inventory{

	Scanner sc=new Scanner(System.in);

	static ArrayList<Inventory>d=new ArrayList<Inventory>();

	String name;
	int quantity;
	double price;

	Inventory(){

	}

	Inventory(String name,int quantity,double price){
		this.name=name;
		this.quantity=quantity;
		this.price=price;

	}

	void addItem(Inventory in){
		d.add(in);
	}

	void display(){
		System.out.println("************Inventory Shop******************");
		System.out.println("item\t\tquantity\tprice");
		for(int i=0;i<d.size();i++){

			System.out.printf("%-20s %-10d %5.2f \n",d.get(i).name,d.get(i).quantity,d.get(i).price);
		}


	}

	void file(){

		try{

			File f=new File("stock.txt");
			FileWriter w=new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(w);

			bw.write(" The items in stock are :\n");
			for(int i=0;i<d.size();i++){
				 bw.write("Item name :- "+d.get(i).name+"\n");
    		     bw.write("quantity :- "+d.get(i).quantity+"\n");
                 bw.write("price :-"+d.get(i).price+"\n");
                 bw.write("\n");

			}

			bw.close();
		}
		catch(IOException e){
			System.out.println("some error occured can't store the info in the file :(");
		}

	}


}
