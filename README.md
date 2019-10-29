# xkbeancomparator-samples 是xkbeancomparator（ https://github.com/xkzhangsan/xkbeancomparator ）的一个使用举例

（1）添加pom依赖  

    <dependency>  
      <groupId>com.github.xkzhangsan</groupId>    
      <artifactId>xkbeancomparator</artifactId>       
      <version>0.0.1</version>    
    </dependency>    
    
（2）java bean类 User

import java.math.BigDecimal;

public class User {
	Integer id;
	String name;
	private BigDecimal point;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPoint() {
		return point;
	}
	public void setPoint(BigDecimal point) {
		this.point = point;
	}
	

}

（3）增加辅助日志类  UserLog


import java.util.HashMap;  
import java.util.Map;  

import com.xkzhangsan.xkbeancomparator.BeanComparator;  
import com.xkzhangsan.xkbeancomparator.CompareResult;  

public class UserLog{

	private static final Map<String, String> propertyTranslationMap = new HashMap<>();

	static {
		propertyTranslationMap.put("name", "用户名");
		propertyTranslationMap.put("point", "积分");
	}
	
	public static CompareResult getCompareResult(Object source, Object target){
		return BeanComparator.getCompareResult(source, target, propertyTranslationMap);
	}
}

（4）   使用  

	@Test
	public void test1() {
		User u1 = new User();
		u1.setId(1);
		u1.setName("aa");
		u1.setPoint(new BigDecimal("111111111111.12"));

		User u2 = new User();
		u2.setId(1);
		u2.setName("aa2");
		u2.setPoint(new BigDecimal("111111111111.15"));
		CompareResult compareResult = UserLog.getCompareResult(u1, u2);
		if (compareResult.isChanged()) {
			System.out.println(compareResult.getChangeContent());
		}
	}
	
（5）输出结果

用户名:aa->aa2,积分:111111111111.12->111111111111.15,

（6）说明 instructions  

上面是推荐用法，使用辅助日志类能统一维护一个java bean的注释map，简化调用。
The recommended usage, above, is to use secondary logging classes to uniformly maintain an annotated map of a Java bean, simplifying invocation.

欢迎提建议 Suggestions are welcome！
