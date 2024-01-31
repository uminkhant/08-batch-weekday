package com.jdc.mkt.enum_test;

public class EnumDemo {

	public static void main(String[] args) {
		show();
		String message = checkDay(DayEnum.FRI);
		System.out.println(message);
		
		//using with index
		System.out.println(DayEnum.values()[3]);
				
		//using abstract method
		System.out.println(DayEnum.TUE.doSomething());
		
		//using with constructor
		System.out.println(DayEnum.SAT.getLife());
		
		//using eqauility operator
		DayEnum d = DayEnum.FRI;
		System.out.println(d == DayEnum.FRI);
		
	}

	static void show() {
		for (DayEnum day : DayEnum.values()) {
			System.out.println(day.ordinal() + "\t" + day.name());
		}
	}

	static String checkDay(DayEnum day) {
		return switch (day) {
		case MON, TUE, WED, THUR, FRI -> "Work Day";
		case SUN, SAT -> "Off Day";
		default -> null;
		};
	}
}
interface Hello{}
record StudentRecord(String name) implements Hello {}
record Member(String type) {}

enum DayEnum  implements Hello{
	
	SUN(6) {
		@Override
		String doSomething() {
			return "Sunday";
		}
	}, MON(15) {
		@Override
		String doSomething() {
			return "Monday";
			
		}
	}, TUE(8) {
		@Override
		String doSomething() {
			return "Tuesday";		
		}
	}, WED(17) {
		@Override
		String doSomething() {
			return "Wednesday";
		}
	}, THUR(19) {
		@Override
		String doSomething() {
			return "Thursday";
		}
	}, FRI (21){
		@Override
		String doSomething() {
			return "Friday";
		}
	}, SAT(12) {
		@Override
		String doSomething() {
			return "Saturday";
		}
	} ;
	
	 private int life;
	// DayEnum(){}
	 DayEnum(int life){
		 this.life = life;
	 }
	 
	  
	 abstract String doSomething();
	  
	  int getLife() {
		  return life;
	  }
	  void show() {}
	   void hide() {}
}

interface Day {
	public static final int Sun = 1, Mon = 2, Tue = 3, Wed = 4, Thur = 5, Fri = 6, Sat = 7;
}








