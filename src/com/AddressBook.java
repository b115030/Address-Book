
import java.util.*;

class AddressBook {
	
	String Personname, PersonhouseNumber, Personcity,Personstate, Personcountry, PersonuniqId;
	long Personzipcode;
	Scanner readIn=new Scanner(System.in);
	AddressBook(String n,String hN, String c, String s, long z, String ct, String uId){
		Personname=n;
		PersonhouseNumber=hN;
		Personcity=c;
		Personstate=s;
		Personzipcode=z;
		Personcountry=ct;
		PersonuniqId=uId;
	}
	 String getName(){
//		Person p=new Person();
		
		 return Personname;
	}
	 public void setName(String name) {
		 this.Personname=name;
	 }
	String getHN() {
		return PersonhouseNumber;
	}
	public void setHN(String houseNo) {
		 this.PersonhouseNumber=houseNo;
	 }
	String getCity() {
		return Personcity;
	}
	public void setCity(String city) {
		 this.Personcity=city;
	 }
	String getState() {
		return Personstate;
	}
	public void setState(String state) {
		 this.Personstate=state;
	 }
	long getZip() {
		return Personzipcode;
	}
	public void setZip(long zip) {
		 this.Personzipcode=zip;
	 }
	String getCountry() {
		return Personcountry;
	}
	public void setCountry(String country) {
		 this.Personcountry=country;
	 }
	String getUniqId() {
		return PersonuniqId;
	}
	public void setUniqID(String uniq) {
		 
	 }
	

	public static void main(String[] args) {
		List<AddressBook> addrBook=new ArrayList<>();
		boolean flag=true;
		AddressBook AB=new AddressBook("0","0","0","0",0,"0","0");
		Scanner readIn=new Scanner(System.in);
		System.out.println("Welcome to the address book");
		while(flag){
		System.out.println("What do you want to do. Choose an Option: ");
		System.out.println("1 :Add a Person. 2 :Edit a Person 3. Delete a Person 4.Sort 5. Print All Entries6.Exit");// 7. Create a new address book 8. ");
		int n=readIn.nextInt();
		switch(n) {
		case 1:String uniId="0";
			System.out.println("Enter the Name of the Person");
			String name=readIn.next();
		
			System.out.println("Enter the House Number");
			String houseNumber=readIn.next();
		
			System.out.println("Enter the Nameo of the City");
			String city=readIn.next();
		
			System.out.println("Enter the State");
			String state=readIn.next();
		
			System.out.println("Enter the ZIP code");
			long zipcode=readIn.nextLong();
		
			System.out.println("enter the  country ");
			String country=readIn.next();
			//addrBook.forEach(Ab->{
			//	String seq=Ab.getUniqId();
					System.out.println("enter a Unique ID ");
					uniId=readIn.next();
			//		if (uniId!=seq) {
			//			flag2=false;
					
			//	}
			//});
			
			
			System.out.println("The person : "+name+" address: "+houseNumber+" "+city+" "+state+" "+zipcode+" "+country+" "+uniId+" Has been added");
		
			addrBook.add(new AddressBook(name,houseNumber,city,state,zipcode,country,uniId)); 
				break;
		case 2: System.out.println("Give the index of Person to edit."); 
				int a=readIn.nextInt();
				System.out.println("Choose to edit \n1. Name \n2. House Number \n3. city \n4. state \n5. zipcode \n6. country"); 
				switch(readIn.nextInt()) {
					case 1: System.out.println("Enter the Name of the Person");
					String new_name=readIn.next();
					addrBook.get(a).setName(new_name);
					
					System.out.println("Enter the House Number");
					String new_houseNumber=readIn.next();
					addrBook.get(a).setHN(new_houseNumber);
				
					System.out.println("Enter the Nameo of the City");
					String new_city=readIn.next();
					addrBook.get(a).setCity(new_city);
				
					System.out.println("Enter the State");
					String new_state=readIn.next();
					addrBook.get(a).setState(new_state);
				
					System.out.println("Enter the ZIP code");
					long new_zipcode=readIn.nextLong();
					addrBook.get(a).setZip(new_zipcode);
				
					System.out.println("enter the  country ");
					String new_country=readIn.next();
					addrBook.get(a).setCountry(new_country);
				}
				break;
		case 3: System.out.println("Give the index of Person to edit."); 
				int b=readIn.nextInt();
				addrBook.remove(b);
		case 4: System.out.println("What do you want to do. Choose an Option: \n1. Sort by Last Name \n2. Sort by Zip Code");
				int ch=readIn.nextInt();
				switch(ch) {
				case 1: addrBook.sort(Comparator.comparingLong(AddressBook::getZip));
					addrBook.forEach(Ab->{System.out.println("Name: " + Ab.getName() +" House Number: "+Ab.getHN()+" City: "+Ab.getCity()+" State: "+Ab.getState()+" Zip Code: "+Ab.getZip()+" Country: "+Ab.getCountry());});
					break;
				case 2: Collections.sort(addrBook, Comparator.comparing(AddressBook::getName));
					addrBook.forEach(Ab->{System.out.println("Name: " + Ab.getName() +" House Number: "+Ab.getHN()+" City: "+Ab.getCity()+" State: "+Ab.getState()+" Zip Code: "+Ab.getZip()+" Country: "+Ab.getCountry());});
					break;
				default: System.out.println("Invalid");
						}
				break;
		case 5: addrBook.forEach(Ab->{System.out.println(" Name: " + Ab.getName() +" House Number: "+Ab.getHN()+" City: "+Ab.getCity()+" State: "+Ab.getState()+" Zip Code: "+Ab.getZip()+" Country: "+Ab.getCountry());});
				break;
		case 6: flag=false;
				break;
		default: System.out.println("Invalid");
	}
		}
	}

}
