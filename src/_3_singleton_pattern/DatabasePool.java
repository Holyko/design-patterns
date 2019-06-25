package _3_singleton_pattern;

public class DatabasePool {

	private volatile static DatabasePool pool;

	private String url = "";
	private String username = "";
	private String password = "";
	private String des = "";

	private DatabasePool() {
		System.out.println("数据库连接池 执行 构造函数");
		this.des = "数据库连接池采用的设计模式为：单例模式";
	}

	private static synchronized void init() {
		if (pool == null)
			pool = new DatabasePool();
	}

	public static DatabasePool instance(){
		if (pool == null)
			init();
		return pool;
	}

	public String des(){
		return this.des;
	}

}
