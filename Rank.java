

public class Rank
{
	private int place = 1;
	private StudentScore sc;
	
	public Rank()
	{
		this.sc = new StudentScore();
	}
	
	public int getPlace() {
		return place;
	}
	public void setPlace(int place) {
		this.place = place;
	}
	public StudentScore getSc() {
		return sc;
	}
	public void setSc(StudentScore sc) {
		this.sc = sc;
	}
	
	public void add(){
		place++;
	}
}
