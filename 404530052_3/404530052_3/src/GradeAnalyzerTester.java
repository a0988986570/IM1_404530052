/*
 * [A]96
 * [TA's Advise]
 * 1. ���ǰ��D�ݭn�Q�`�N��! �ݤ@�U�A���{���X!
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {

	public static void main(String[] args) {

		GradeAnalyzer A = new GradeAnalyzer();

		String TempInput = "";

		while (true) {
			TempInput = JOptionPane.showInputDialog(null, "��J���Z");

			if (TempInput.equalsIgnoreCase("q")) {

				break;
			}

			try {
				A.addGrade(Double.parseDouble(TempInput));
			}

			catch (Exception e) {

				System.out.println("���~�A�ЦA����J");
			}
		}
		// �ʤ֧P�_�Ӽ�, -2
		A.analyzeGrades();
		System.out.println(A);
	}

}
