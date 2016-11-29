package treesndgraphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import stacks.queue;

class node{
	int data;
	node left,right;
	public node(int data){
		this.data=data;
	}
}
public class tree {
	node root;
	ArrayList<Integer> list=new ArrayList<Integer>();
	public tree(){
		root=null;
	}
	public void insert(int d){
		node current=root;
		node pos = null;
		while(current!=null){
			 pos=current;
			if(d<current.data)
				current=current.left;
			else
				current=current.right;
		}
		if (root==null){
			root=new node(d);
		}
		else if (d<=pos.data){
			pos.left=new node(d);
		}
		else
			pos.right=new node (d);
	}
	public void preorder(node current){
		if(current==null)
			return;
		
			System.out.println(current.data);
			preorder(current.left);
			preorder(current.right);
	}
	public void inorder(node crrent){
		if (crrent==null)
				return;
		inorder(crrent.left);
		System.out.println(crrent.data);list.add(crrent.data);
		inorder(crrent.right);
	}
	public int height(node root){
		boolean flag=true;
		Queue<node> stack=new LinkedList<node>();
		stack.add(root);
		int height=-1;
		while(!stack.isEmpty()){
			node e=stack.poll();
			if(e.left!=null)
			stack.add(e.left);
			if(e.right!=null)
			stack.add(e.right);
			if(flag==true )
			{flag=false;if(e.left!=null)System.out.print(e.left.data);if(e.right!=null)System.out.print(e.right.data);}
			else
			{flag=true;if(e.right!=null)System.out.print(e.right.data);if(e.left!=null)System.out.print(e.left.data);}
			if(e.left!=null || e.right!=null)
			height=height+1;
		}
		return height;
	}
	public int height_rec(node root){
		node current=root;
		if (current==null)
			return 0;
		
		int lh=height_rec(root.left);
		int rh=height_rec(root.right);
		
		return (Math.max(lh, rh)+1);
		
	}
	public boolean balanced(node root){
		if (root==null)
			return true;
		int lh=height_rec(root.left);
		int rh=height_rec(root.right);
		if(Math.abs(lh-rh)<=1 && balanced(root.left)&& balanced(root.right))
			return true;
		return false;
			
		
	}
	public int add(node root){
		boolean flag=true;
		Queue<node> stack=new LinkedList<node>();
		stack.add(root);
		int height=-1;
		while(!stack.isEmpty()){
			
			node e=stack.poll();
			if(e.left!=null)
			stack.add(e.left);
			if(e.right!=null)
			stack.add(e.right);
			if(flag==true )
			{flag=false;if(e.left!=null)System.out.print(e.left.data);if(e.right!=null)System.out.print(e.right.data);}
			else
			{flag=true;if(e.right!=null)System.out.print(e.right.data);if(e.left!=null)System.out.print(e.left.data);}
			if(e.left!=null || e.right!=null)
			height=height+1;
		}
		return height;
	}
	public  node lowestcommon(node root,int x,int y){
		node current=root;
		while(current!=null){
			if(current.data>x && current.data>y)
				current=current.left;
			else if(current.data<x && current.data<y)
				current=current.right;
			else
				break;
		}
		return current;
		}
	public void inordersuccessor(node inor){
		
	}
	}
	
