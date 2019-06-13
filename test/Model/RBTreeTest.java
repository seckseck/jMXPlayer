package test.Model;

import static org.junit.Assert.*;

import org.junit.Test;
import src.Model.*;


public class RBTreeTest {
	Comparable key= "rawtypes"; 
	Object data ="23";
	Object data2 ="12";
	Object data3 ="213";
	
	RBNode Main_node = new RBNode(key,data);
	RBNode Main_node2 = new RBNode(key,data2);
	RBNode Main_node3 = new RBNode(key,data3);

	RBTree Main_Tree = new RBTree();

	@Test
	public void test() {
		Main_Tree.insert(Main_node);
		Main_Tree.insert(Main_node2);
		Main_Tree.insert(Main_node3);		
	}

}
