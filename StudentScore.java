

public class StudentScore
{
	private String name;
	private int chinese;
	private int english;
	private int math;
	private int total;
	
	public StudentScore(String name, String ch, String eng, String math)
	{
		this.name = name;
		this.chinese = Integer.parseInt(ch);
		this.english = Integer.parseInt(eng);
		this.math = Integer.parseInt(math);
		this.total = this.chinese + this.english + this.math;
	}
	
	
	
	public StudentScore(){}
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getChinese() 
	{
		return chinese;
	}

	public int getEnglish() 
	{
		return english;
	}

	public int getMath() 
	{
		return math;
	}

	public int getTotal() 
	{
		return total;
	}
}
