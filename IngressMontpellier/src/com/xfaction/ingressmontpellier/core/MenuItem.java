package com.xfaction.ingressmontpellier.core;

public enum MenuItem {
	  //Objets directement construits
	  Map		("Map", "Carte des portails");

	  private String name = "";
	  private String description = "";
	    
	  //Constructeur
	  MenuItem(String name, String description){
	    this.name = name;
	    this.description = description;
	  }
	  
	  public String getName(){
		  return name;
	  }
	    
	  public String getDescription(){
		  return description;
	  }
	    
	  public String toString(){
	    return name;
	  }
	}
