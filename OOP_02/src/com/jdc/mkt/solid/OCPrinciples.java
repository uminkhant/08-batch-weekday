package com.jdc.mkt.solid;

public class OCPrinciples {

	public static void main(String[] args) {
		
		RoomType roomType = new FamilyRoom();
		//Room  room = new Room();
		double price = roomType.getCharges();
		System.out.println(price);
	}
}

class SingleRoom extends RoomType{
	@Override
	double getCharges() {
		return super.getCharges();
	}
}
class DoubleRoom extends RoomType{
	@Override
	double getCharges() {
		return super.getCharges()*2;
	}
}
class FamilyRoom extends RoomType{
	@Override
	double getCharges() {
		return super.getCharges()*2.5;
	}
}

class RoomType{
	private double charges = 15000;
	
	double getCharges() {
		return charges;
	}	
}

//don't
class Room{
	double getCharges(RoomType type) {
		
		if(type instanceof SingleRoom) {
			return  type.getCharges();
		}else if(type instanceof DoubleRoom) {
			return type.getCharges()*2;
		}else if(type instanceof FamilyRoom) {
			return type.getCharges()*2.5;
		}
		return 0;
	}
	
}
