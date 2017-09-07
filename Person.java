
class Person {
	String name;
	int age;
	String gender;
	PersonAddress add;
	
	Person(String name, int age, String gender, PersonAddress add){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.add = add;
	}
}

class PersonAddress{
	String city;
	String state;
	
	PersonAddress(String city, String state){
		this.city = city;
		this.state = state;
	}
}

class ExamplesPerson{
	PersonAddress timAdd = new PersonAddress("Warwick", "RI");
	PersonAddress patAdd = new PersonAddress("Boston", "MA");
	PersonAddress kimAdd = new PersonAddress("Boston", "MA");
	PersonAddress danAdd = new PersonAddress("Nashua", "NH");
	Person tim = new Person("Tim", 20, "M", this.timAdd);
	Person pat = new Person("Pat", 19, "F", this.patAdd);
	Person kim = new Person("Kim", 17, "F", this.kimAdd);
	Person dan = new Person("Dan", 22, "M", this.danAdd);
}