
import java.util.ArrayList;

class MyCount {
	String Rank;
	int grade;

	public MyCount(String string, int i) {

	}

	void Count(String _Rank, int _grade) {

		this.Rank = _Rank;

		this.grade = _grade;
	}

	public String toString() {
		return this.Rank + "=" + this.grade;
	}
}

public class GradeAnalyzer {

	double SD = 0, Avg = 0, GetNumb = 0, SDtemp = 0;
	ArrayList<Double> NumbScore = new ArrayList<Double>();

	MyCount[] GradeDis = new MyCount[11];

	boolean First = true;

	static boolean isValidGrade(double theGrade) {
		if (theGrade >= 0 && theGrade <= 100)
			return true;
		else
			return false;
	}

	void addGrade(double Input) {
		if (First) {
			GradeDis[0] = new MyCount("A+", 0);
			GradeDis[1] = new MyCount("A ", 0);
			GradeDis[2] = new MyCount("A-", 0);
			GradeDis[3] = new MyCount("B+", 0);
			GradeDis[4] = new MyCount("B ", 0);
			GradeDis[5] = new MyCount("B-", 0);
			GradeDis[6] = new MyCount("C+", 0);
			GradeDis[7] = new MyCount("C ", 0);
			GradeDis[8] = new MyCount("C-", 0);
			GradeDis[9] = new MyCount("D ", 0);
			GradeDis[10] = new MyCount("F ", 0);
			First = false;
		}

		if (!isValidGrade(Input)) {
			return;
		}
		NumbScore.add(Input);
		double Sum = Input;
		//InputTime 應該先被宣告及初始化, -2.
		InputTime++;

		if (Input > 60) {
			if (Input >= 98)
				GradeDis[0].grade++;

			else if (Input < 98 && Input >= 92)
				GradeDis[1].grade++;

			else if (Input < 92 && Input >= 90)
				GradeDis[2].grade++;

			else if (Input < 90 && Input >= 88)
				GradeDis[3].grade++;

			else if (Input < 88 && Input >= 82)

				GradeDis[4].grade++;
			else if (Input < 82 && Input >= 80)

				GradeDis[5].grade++;
			else if (Input < 80 && Input >= 78)
				GradeDis[6].grade++;
			else if (Input < 78 && Input > 72)

				GradeDis[7].grade++;
			else if (Input < 72 && Input > 70)

				GradeDis[8].grade++;
			else if (Input < 70 && Input >= 60)

				GradeDis[9].grade++;

		} else
			GradeDis[10].grade++;
	}

	void analyzeGrades(int Sum) {

		Avg = Sum / InputTime;
		for (int i = 0; i < NumbScore.size(); i++) {

			SD += Math.pow(NumbScore.get(i) - Avg, 2);
		}

		SDtemp = Math.round((Math.sqrt(SD / InputTime)));
	}

	public String toString() {

		String result = "";
		for (int i = 0; i < GradeDis.length; i++) {

			result += GradeDis[i] + "\n";
		}
		return "The grade disriburion is :\n\n" + result;
	}

	public void analyzeGrades() {
		// TODO Auto-generated method stub

	}
}
