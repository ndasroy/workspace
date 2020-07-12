package Practice;

class A{

	public static int x;//class variable
	public int y;//instance variable
}
class InstanceVariable{

	public static void main(String args[]){
		A.x=15;//  class variable used without object
		System.out.println(A.x);// will work
		//System.out.println(A.y);//will throw an error
		A  stat= new A();
		stat.y=15;//for instance variable
		System.out.println(stat.y);//it will work now
	}
}
