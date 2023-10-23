package Mypkg;

public class MyCalc {
	public int sum(int a , int b) {
	return(a+b);
}
    public int sum2(int a , int b){
    int c = a+b;
    return c;
    
    }
    
	public static void main(String[] args){
		MyCalc ob = new MyCalc();
		System.out.println(ob.sum(10,20));
		System.out.println(ob.sum2(10,20));

	}

}
