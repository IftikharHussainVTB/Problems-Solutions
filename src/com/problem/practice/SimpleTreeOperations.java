package com.problem.practice;

import java.util.Objects;

public class SimpleTreeOperations {
	
	

	    public <T extends Comparable<? super T>> SimpleTree<T> search(SimpleTree<T> tree, T item) {
	        if (Objects.equals(tree.item, item)) {
	            return tree;
	        }
	        if (tree.item.compareTo(item) < 0) {
	            return search(tree.left, item);
	        } else {
	            return search(tree.right, item);
	        }
	    }

	    public <T> T min(SimpleTree<T> tree) {
	        if (tree.left == null) {
	            return tree.item;
	        }
	        return min(tree.left);
	    }

	    public <T> T max(SimpleTree<T> tree) {
	        if (tree.right == null) {
	            return tree.item;
	        }
	        return max(tree.right);
	    }


	}



