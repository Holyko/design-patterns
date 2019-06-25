package _1_factory_pattern.factory;

import MyException.BrandNotFoundException;
import _1_factory_pattern.model.AppleMouse;
import _1_factory_pattern.model.MicrosoftMouse;
import _1_factory_pattern.model.Mouse;

public class MouseFactory implements Factory {

	public Mouse build(String brand) {
		Mouse mouse = null;
		if ("Microsoft".equals(brand)){
			mouse = new MicrosoftMouse();
		} else if ("Apple".equals(brand)){
			mouse = new AppleMouse();
		} else {
			throw new BrandNotFoundException("品牌不存在或者为空");
		}
		return mouse;
	}

}
