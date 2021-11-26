package generics;


public class Pair<T> {
private T a; // Can declare T variables
private T b;

public Pair(T a, T b) {
this.a = a;
this.b = b;
}
public T getA() {
return a;
}
public T getB() {
return b;
}
public void swap() {
T temp = a; // NOTE T temporary variable
a = b;
b = temp;
}
// True if a and b are the same
public boolean isSame() {
return a.equals(b);
// NOTE Can only do things on T vars that work on any Object
}
// True if a or b is the given object
// NOTE: use of T as a parameter
public boolean contains(T elem) {
return (a.equals(elem) || b.equals(elem));

}
public static void main(String[] args) {
// ** Make a Pair of Integer
Pair<Integer> ipair = new Pair<Integer>(1, 2);
Integer a = ipair.getA();
int b = ipair.getB(); // unboxing
// ** Also make a Pair of String
Pair<String> spair = new Pair<String>("hi", "there");
String s = spair.getA();
String d = spair.getB();

System.out.println("string "+ d);
}
// Show things that do not work with T
private void doesNotWork(Object x) {
// T var = new T(); // NO, T not real at runtime -- erasure
// T[] array = new T[10]; // NO, same reason
// T temp = (T) x; // NO, same reason (like (Object) cast)
}
}



//output
//string there
// generics is single method declarartion or single class declaration with type parameter denoted by angular bracket<>.
