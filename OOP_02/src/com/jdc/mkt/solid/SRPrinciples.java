package com.jdc.mkt.solid;

public class SRPrinciples {

		public static void main(String[] args) {
			Book b = new Book();
			Database db = new Database();
			Printer p = new Printer();
			
			b.setName("Agile Software in 2001");
			b.setAuthor("Robert C.martin");
			b.setText("About solid principles");
			
			b.replaceToText("Design Patterns");
			db.saveText(b.getText());
			p.printText(b.getText());
		}
}

class Book{
	private String name;
	private String author;
	private String text;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public String replaceToText(String replace) {
		 setText(replace);
		 return getText();
	}
	
	
}

class Database{
	public void saveText(String text) {
		System.out.println("Save "+text+"\t to Db.");
	}
}

class Printer{
	public void printText(String text) {
		System.out.println(text);
	}
}






