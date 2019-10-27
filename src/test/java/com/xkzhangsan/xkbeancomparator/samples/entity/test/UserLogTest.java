package com.xkzhangsan.xkbeancomparator.samples.entity.test;

import java.math.BigDecimal;

import org.junit.Test;

import com.xkzhangsan.xkbeancomparator.CompareResult;
import com.xkzhangsan.xkbeancomparator.samples.entity.User;
import com.xkzhangsan.xkbeancomparator.samples.entity.log.UserLog;

public class UserLogTest {

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
}
