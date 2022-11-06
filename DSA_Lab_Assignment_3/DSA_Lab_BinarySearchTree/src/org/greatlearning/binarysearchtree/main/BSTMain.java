package org.greatlearning.binarysearchtree.main;

import org.greatlearning.binarysearchtree.FindPair;
import org.greatlearning.binarysearchtree.FindPair.Node;

public class BSTMain {
	public static void main(String[] args) {
		Node root = null;
		FindPair findSumPairDemo = new FindPair();
		root = findSumPairDemo.insert(root, 40);
		root = findSumPairDemo.insert(root, 20);
		root = findSumPairDemo.insert(root, 60);
		root = findSumPairDemo.insert(root, 10);
		root = findSumPairDemo.insert(root, 30);
		root = findSumPairDemo.insert(root, 50);
		root = findSumPairDemo.insert(root, 70);
		int sum = 130;
		findSumPairDemo.findPairWithGivenSum(root, sum);
	}
}
