package _5_prototype_pattern;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

public class OriginObject implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	// 浅复制
	public OriginObject clone() throws CloneNotSupportedException {
		OriginObject oo = (OriginObject) super.clone();
		return oo;
	}

	// 深复制
	public Object deepClone() throws IOException, ClassNotFoundException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);

		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}
}
