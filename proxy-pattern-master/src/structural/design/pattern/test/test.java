package structural.design.pattern.test;

import structural.design.pattern.proxy.Proxy;
import structural.design.pattern.realSubject.RealSubject;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Proxy proxy = new Proxy(new RealSubject());
		 
		 System.out.println(proxy.operation());
	}

}
