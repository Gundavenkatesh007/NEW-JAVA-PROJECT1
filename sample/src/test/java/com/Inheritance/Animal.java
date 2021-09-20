package com.Inheritance;

 class Mammal {
			void eat(){
			System.out.println("RUNNING");
			}
			void walk() {
				System.out.println("FEED");
			}
				void feel() {
					System.out.println("EATING");
					
				}
 }
 
		
			
	 class Dog extends Mammal{
		void bark() {
			System.out.println("BARKING");
		}
		void smell() {
			System.out.println("SMELLING");
		}
		void feel() {
			System.out.println("EATING");
		}
	 }
	 		
						
		 class Cat extends Dog {
		void meow(){
			System.out.println("MEOWING");
					}
		void cuddle() {
			System.out.println("CUDDLING");
		}
			void feel() {
				System.out.println("EATING");
			}
		}
				
			
		
	
	
	
	public class Animal {
		public static void main(String args[]) {
			Cat c = new Cat();
			c.eat();
			c.feel();
			  			   		   
			     				}
		}
		

	



