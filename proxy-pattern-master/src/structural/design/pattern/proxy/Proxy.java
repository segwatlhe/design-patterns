package structural.design.pattern.proxy;

import structural.design.pattern.realSubject.RealSubject;
import structural.design.pattern.subject.Subject;

//Proxy controlls access to RealSubject
public class Proxy  extends Subject {

	 private RealSubject realSubject; 
	 
	 
	 public Proxy(RealSubject subject) { 
		 this.realSubject = subject;
	 }
	 
	 
	 public String operation() { 
		 return "Hello world from Proxy and " + realSubject.operation(); 
	 }
}
