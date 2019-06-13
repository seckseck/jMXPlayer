package test.Model;

import static org.junit.Assert.*;

import org.junit.Test;
import src.Model.*;

public class TreeTest {
	Comparable key= "rawtypes"; 
	Object data ="23";
	Tree main_tree = new Tree();
	HNode main_node = new HNode(key,data);
	
	@Test
	public void test() {
		main_tree.insert(main_node);
	}

}
