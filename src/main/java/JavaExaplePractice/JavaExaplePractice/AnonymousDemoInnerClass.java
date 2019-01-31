package JavaExaplePractice.JavaExaplePractice;
/*
 * It is an inner class without a name and for which only a single object is created. An anonymous inner class
 *  can be useful when making an instance of an object with certain “extras” such as overloading methods of a
 *   class or interface, without having to actually 
 * subclass a class.
 * 
interface Age 
{ 
    int x = 21; 
    void getAge(); 
} 

// Myclass implement the methods of Age Interface 
class MyClass implements Age 
{ 
    @Override
    public void getAge()  
    { 
        // printing the age 
        System.out.print("Age is "+x); 
    } 
} 

class AnonymousDemo 
{ 
    public static void main(String[] args)  
    { 
        // Myclass is implementation class of Age interface 
        MyClass obj=new MyClass(); 
  
        // calling getage() method implemented at Myclass 
        obj.getAge();      
    } 
} 
  
 */

interface Age {
	int x = 21;

	void getAge();
}

class AnonymousDemoInnerClass {
	public static void main(String[] args) {

		// Myclass is hidden inner class of Age interface
		// whose name is not written but an object to it
		// is created.
		Age oj1 = new Age() {
			@Override
			public void getAge() {
				// printing age
				System.out.print("Age is " + x);
			}
		};
		oj1.getAge();
	}
}
