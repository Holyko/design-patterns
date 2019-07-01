package _12_fly_weight_pattern;

import java.util.ArrayList;
import java.util.List;

public class UmbrellaBox {

	private List<Umbrella> umbrellas = new ArrayList<>();

	public UmbrellaBox() {
		for (int i = 0; i < 10; i++) {
			this.umbrellas.add(new Umbrella("雨伞" + i));
		}
	}

	public Umbrella get() {
		if (this.umbrellas.size() == 0)
			return  null;

		Umbrella umbrella = this.umbrellas.get(0);
		this.umbrellas.remove(umbrella);
		System.out.println("剩余雨伞：" + this.umbrellas.size());
		return umbrella;
	}

	public void back(Umbrella umbrella) {
		this.umbrellas.add(umbrella);
		System.out.println("剩余雨伞：" + this.umbrellas.size());
	}

}
