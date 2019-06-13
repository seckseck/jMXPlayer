package test.Model;

import static org.junit.Assert.*;
import org.junit.Test;

import java.awt.Rectangle;

import src.Model.*;

public class RTreeTest {
	RTree main_tree = new RTree(10);
	Rectangle rectangle = new Rectangle(8,1,2,4);
	Node n = new Node(10);
	@Test
	public void test() {
		main_tree.insertNewElement(rectangle);
		main_tree.insertNewElement(new Rectangle(3,1,2,4));
		main_tree.creaLista2(n);
		main_tree.creaLista2(n, 3, 4);
		main_tree.creaLista4(n, 4);
		main_tree.creaLista5(n, 3);
		main_tree.deleteElement(rectangle);
	}

}
