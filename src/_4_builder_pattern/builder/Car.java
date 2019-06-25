package _4_builder_pattern.builder;

import _4_builder_pattern.module.Part;

import java.util.ArrayList;
import java.util.List;

public class Car {

	private List<Part> parts = new ArrayList<>();

	public void add(Part p){
		parts.add(p);
	}

	public void show(){
		for (Part part: parts) {
			System.out.println(part.name());
		}
	}

}
