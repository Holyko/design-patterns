package _7_bridge_pattern.bridge;

import _7_bridge_pattern.driver.Driver;

public interface Bridge {

	void load();

	void set(Driver driver);

}
