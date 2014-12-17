
public class ScoreCompare
{
	public static void main(String[] args)
	{
		StudentScore sc1 = new StudentScore("Alen","100","90","90");
		StudentScore sc2 = new StudentScore("Bailey","90","89","92");
		StudentScore sc3 = new StudentScore("Caster","99","98","70");
		StudentScore sc4 = new StudentScore("Diamond","40","60","91");
		StudentScore sc5 = new StudentScore("Frank","80","70","86");
		
		Calculate cal = new Calculate();
		
		cal.add(sc1);
		cal.add(sc2);
		cal.add(sc3);
		cal.add(sc4);
		cal.add(sc5);
		
		
		System.out.println("chinese avg: "+cal.average(cal.getChineseArray()));
		System.out.println("english avg: "+cal.average(cal.getEnglishArray()));
		System.out.println("math avg: "+cal.average(cal.getMathArray()));
		
		cal.rankChinese();
		cal.rankEnglish();
	}
}
