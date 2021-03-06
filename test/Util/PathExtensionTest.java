package test.Util;

import static org.junit.Assert.*;
import org.junit.Test;

import src.Util.PathExtension;

public class PathExtensionTest {

	/**
	 * Purpose: Path Join Test 
	 * Input: "/user/bin", "images/flowers/rose1.jpeg"
	 * Expected: "/user/bin/images/flowers/rose1.jpeg"
	 *
	 * return SUCCESS
	 * 
	 * "/user/bin" + "images/flowers/rose1.jpeg"
	 * "/user/bin/images/flowers/rose1.jpeg"
	 */
	@Test
	public void pathJoinTest() {
		assertEquals(PathExtension.join("/user/bin", "images/flowers/rose1.jpeg"),
				"/user/bin/images/flowers/rose1.jpeg");
	}
	
	/**
	 * Purpose: Path Join Test with weird base path 
	 * Input: "/user/bin:", "images/flowers/rose1.jpeg"
	 * Expected: "/user/bin/images/flowers/rose1.jpeg"
	 *
	 * return SUCCESS
	 * 
	 * "/user/bin:" + "images/flowers/rose1.jpeg"
	 * "/user/bin/images/flowers/rose1.jpeg"
	 */
	@Test
	public void pathJoinTestWithWeirdBasePath1() {
		assertEquals(PathExtension.join("/user/bin:", "images/flowers/rose1.jpeg"),
				"/user/bin/images/flowers/rose1.jpeg");
	}
	
	/**
	 * Purpose: Path Join Test with weird base path
	 * Input: "/user/bin\\", "images/flowers/rose1.jpeg"
	 * Expected: "/user/bin/images/flowers/rose1.jpeg"
	 *
	 * return SUCCESS
	 * 
	 * "/user/bin\\" + "images/flowers/rose1.jpeg"
	 * "/user/bin/images/flowers/rose1.jpeg"
	 */
	@Test
	public void pathJoinTestWithWeirdBasePath2() {
		assertEquals(PathExtension.join("/user/bin\\", "images/flowers/rose1.jpeg"),
				"/user/bin/images/flowers/rose1.jpeg");
	}
	
	/**
	 * Purpose: Path Join Test with weird base path
	 * Input: "/user/bin/", "images/flowers/rose1.jpeg"
	 * Expected: "/user/bin/images/flowers/rose1.jpeg"
	 *
	 * return SUCCESS
	 * 
	 * "/user/bin/" + "images/flowers/rose1.jpeg"
	 * "/user/bin/images/flowers/rose1.jpeg"
	 */
	@Test
	public void pathJoinTestWithWeirdBasePath3() {
		assertEquals(PathExtension.join("/user/bin/", "images/flowers/rose1.jpeg"),
				"/user/bin/images/flowers/rose1.jpeg");
	}
	
	/**
	 * Purpose: get parent path from path
	 * Input: "/user/bin/images/flowers/rose1.jpeg"
	 * Expected: ""/user/bin/images/flowers"
	 *
	 * return SUCCESS
	 * 
	 * "/user/bin/images/flowers" from "/user/bin/images/flowers/rose1.jpeg"
	 */
	@Test
	public void getparentPathTest() {
		assertEquals(PathExtension.getParent("/user/bin/images/flowers/rose1.jpeg"),
				"/user/bin/images/flowers");
	}
}
