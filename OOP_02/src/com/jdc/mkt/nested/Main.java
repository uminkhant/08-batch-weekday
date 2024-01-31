package com.jdc.mkt.nested;

public class Main {

	public static void main(String[] args) {

		// static
		OuterClass.StaticNested sn = new OuterClass.StaticNested();
		sn.show();
		OuterClass.StaticNested.hide();

		// non-static inner
		OuterClass oc = new OuterClass();
		OuterClass.NonStaticNested sns = oc.new NonStaticNested();
		sns.hide();
		OuterClass.NonStaticNested.show();
	}

}

@SuppressWarnings("unused")
class OuterClass {

	private String name;
	private static int age;

	static void doSomething() {
		
		StaticNested  s = new StaticNested();
		s.show();
		
		//effecitve final
		String message = "doing someting !";
		class Worker {
			void doing() {
				System.out.println(message);
			}
		}
		// message = "other";
		
		Test t = new Test() {

			@Override
			public void test() {
				System.out.println(message);
			}
		};
		//message = "test";
	}

	interface Test {
		void test();
	}

	 static class StaticNested {
		private static String staticName;

		void show() {
			// System.out.println(name);
			System.out.println(age);
		}

		static void hide() {

		}
	}

	 class NonStaticNested {
		private String instanceName;

		static void show() {
			// System.out.println(name);
		}

		void hide() {
			System.out.println(name);
		}
	}
}
