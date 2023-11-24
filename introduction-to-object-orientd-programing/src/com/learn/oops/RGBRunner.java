package com.learn.oops;

public class RGBRunner {

	public static void main(String[] args) {

		RGBColor color = new RGBColor(255, 0, 255);

		color.invert();
		System.out.println(color);
		System.out.println(color.getBlue());
		
//		SELECT DISTINCT city
//		FROM patients
//		WHERE UPPER(SUBSTRING(city, 1, 1)) IN ('A', 'E', 'I', 'O', 'U')
//		ORDER BY city ASC;
	}

}
