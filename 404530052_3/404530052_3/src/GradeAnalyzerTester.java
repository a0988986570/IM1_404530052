/*
 * [A]96
 * [TA's Advise]
 * 1. 有些問題需要被注意喔! 看一下你的程式碼!
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {

	public static void main(String[] args) {

		GradeAnalyzer A = new GradeAnalyzer();

		String TempInput = "";

		while (true) {
			TempInput = JOptionPane.showInputDialog(null, "輸入成績");

			if (TempInput.equalsIgnoreCase("q")) {

				break;
			}

			try {
				A.addGrade(Double.parseDouble(TempInput));
			}

			catch (Exception e) {

				System.out.println("錯誤，請再次輸入");
			}
		}
		// 缺少判斷個數, -2
		A.analyzeGrades();
		System.out.println(A);
	}

}
