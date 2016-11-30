package fcu.iecs.oop.pokemon;

public class Pokemon {
	private String name;
	private int cp;
	
	public Pokemon(String name,int cp){
		this.name=name;
		this.cp=cp;
	}
	
	public String get_name(){
		return name;
	}
	
	public int get_cp(){
		return cp;
	}
	
	public void svae_cp(int cp){
		this.cp=cp;
	}

}
