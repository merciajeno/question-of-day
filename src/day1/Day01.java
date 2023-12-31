package day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day01 {
	List<String> inputList = new ArrayList<>();

	Map<String, String> monthWiseMaxDayMap = new HashMap<String, String>();

	public static void main(String[] args) {

		Day01 day01 = new Day01();
		day01.initData();
		day01.process();
	}

	// find Monthwise max day and place in to the map
	// output

	//@formatter:off
	/*
	 * 
	 * KEY -- Value 
	 * JAN -- 2023-01-21 
	 * FEB -- 2023-01-25 
	 * MAR -- 2023-03-29
	 * 
	 * 
	 */
	//@formatter:on
	private void process() {
		// write your code here
	}

	private void initData() {
		inputList.add("JAN=2023-01-01");
		inputList.add("JAN=2023-01-11");
		inputList.add("JAN=2023-01-21");

		inputList.add("FEB=2023-01-25");
		inputList.add("FEB=2023-01-01");

		inputList.add("FEB=2023-03-01");
		inputList.add("MAR=2023-03-29");
		inputList.add("FEB=2023-01-21");
	}

}
