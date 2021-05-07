package com.jstevenperry.learn.java;
import java.lang.Math;
import java.util.*;
public class HelloWorld {

	public static ArrayList<ArrayList<Integer>> getDesc(ArrayList<Integer> input){
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
		int index = 0;
		while (index < input.size() - 1) {
			if (input.get(index) > input.get(index+1)) {
				tmp.add(input.get(index));
				index++;
			}
			else {
				if (tmp.size() != 0) {
					tmp.add(input.get(index));
					output.add(tmp);
					tmp = new ArrayList<Integer>();
					index++;
				}
				else {
					index++;
				}
			}
		}
		if (tmp.get(tmp.size() -1) > input.get(input.size() -1)) {
			tmp.add(input.get(input.size() -1));
		}
		output.add(tmp);
		return output;
	}
	
	public static ArrayList<ArrayList<Integer>> getAsc(ArrayList<Integer> input){
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> tmpOut = new ArrayList<ArrayList<Integer>>();
		int index = 0;
		while (index < input.size() - 1) {
			if (input.get(index) <= input.get(index + 1)) {
				tmp.add(input.get(index));
//				tmp.add(index + 1);
				index ++;
			}
			else {
				if (tmp != null) {
					tmp.add(input.get(index));
					tmpOut.add(tmp);
					tmp = new ArrayList<Integer>();
					index++;
				}
				else {
					index++;
				}
			}
		}
		ArrayList<Integer> lastEl = tmpOut.get(tmpOut.size() -1);
		if (lastEl.get(lastEl.size()-1)<= input.get(input.size()-1)){
			tmpOut.get(tmpOut.size()).add(input.get(input.size() -1));
		}
		for (int i = 0; i < tmpOut.size();i++) {
			if (tmpOut.get(i).size() != 1) {
				output.add(tmpOut.get(i));
			}
		}
		return output;
	}
	
	
	

	public static void main(String[] args) {
	}
}

