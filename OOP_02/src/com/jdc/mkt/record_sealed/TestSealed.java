package com.jdc.mkt.record_sealed;

public class TestSealed {

	void main() {
		
	}
}
sealed class Driver permits TaxiDriver,MotorBikeDriver,Pilot{}
sealed interface Worker permits Person,TaxiDriver{}

final class TaxiDriver extends Driver implements Worker{}

non-sealed class MotorBikeDriver extends Driver{}
sealed class Pilot  extends Driver permits A{}

final class A extends Pilot{}

record  Person(String name,int age) implements Worker {}
