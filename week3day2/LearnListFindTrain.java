package week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnListFindTrain {

	public static void main(String[] args) {
		
		List<String> trainFind = new ArrayList<String>();
		trainFind.add("Trivandram express");
		trainFind.add(0,"Howrah express");
		trainFind.add("Satapthy express");
		trainFind.add("Satapthy express");
		System.out.println(trainFind.size());
		trainFind.remove("Howrah");
		System.out.println(trainFind.contains("howrah"));
		System.out.println(trainFind);
		Collections.sort(trainFind);
		Collections.reverse(trainFind);
		System.out.println(trainFind);
		System.out.println(trainFind.get(1));
		int total = trainFind.size();
		System.out.println(trainFind.get(total-1));

	}

}