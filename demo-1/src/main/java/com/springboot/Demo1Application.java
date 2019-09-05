package com.springboot;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;
import com.springboot.model.Student;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Demo1Application.class, args);
		
		/*TestInter a=(int c,int b) -> System.out.println((c+b));
		a.add(10,30);
		
		SqareInter s=a1-> System.out.println(a1*a1);
		s.sq(20);
		
	
		// 1 Using Runable implemtaion
		
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("By using Thard ");
				for(int i=1;i<=5;i++)
				{
					System.out.println("Hiii "+i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
				
			}
		};
		
		
		Thread t1=new Thread(r);
		t1.start();
		
		
		
		// 2 Using Runable implemtaion in Thread Constotor
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("by using pass Runnablr impl in Thard constructor");
				
				for(int i=1;i<=5;i++)
				{
					System.out.println("By "+i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
			}
		});
		
		t2.start();
		
		//  3 Using Runable implemtaion with Lambda Exp
		
		Runnable r1=() -> {
			System.out.println("Using Runable implemtaion Using Lambda Exp ");
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hiii "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
		};
		
		Thread t4=new Thread(r1);
		t4.start();
		

		// 4 Using Runable implemtaion in Thread Constotor usinf Lmbda Exp
		
			Thread t5=new Thread(() -> {
				System.out.println("by using pass Runnablr impl in Thard constructor");
				
				for(int i=1;i<=5;i++)
				{
					System.out.println("By "+i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			});
			
			t5.start();
	}
	
	
}

@FunctionalInterface
interface TestInter
{
	public void add(int s1,int s2);
	public default void m1()
	{
		
	}
	public static void m2()
	{
		
	}
}

@FunctionalInterface
interface SqareInter
{
	public void sq(int a);
	
	
}*/
		
	}
}