package com.xkzhangsan.xkbeancomparator.samples.entity.log;

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
