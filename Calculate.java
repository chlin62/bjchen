
public class Calculate
{
	private String[] nameArray = new String[5];
	private int[] chineseArray = new int[5];
	private int[] englishArray = new int[5];
	private int[] mathArray = new int[5];
	private int index = 0;
	private Rank[] ranks= new Rank[5];
	
	public double average(int[] score)
	{
		int sum = 0;
		int no = 0;
		for (int item : score) 
		{
			sum += item;
			no++;
		}
		System.out.println("sum : "+sum);
		return sum/no;
	}
	
	public void add(StudentScore sc)
	{
		nameArray[index] = sc.getName();
		chineseArray[index] = sc.getChinese();
		englishArray[index] = sc.getEnglish();
		mathArray[index] = sc.getMath();
		Rank rank = new Rank();
		rank.setSc(sc);
		this.ranks[index] = rank;
		index++;
	}

	public void rankChinese()
	{
		for(int i = 0; i < ranks.length ; i++)
		{
			for(int j = 0; j < ranks.length ; j++)
			{
				if(i != j)
				{
					if(ranks[i].getSc().getChinese() < ranks[j].getSc().getChinese())
					{
						ranks[i].add();
					} 
				}
			}
		}
		
		for (int i = 0; i < ranks.length; i++) 
		{	
			System.out.println("rank : "+ranks[i].getPlace() + "----" + ranks[i].getSc().getChinese() + "-----" + ranks[i].getSc().getName());
		}
		
//		 for (int i=0;i<a.length-1;i++)  //
//              for (int j=0;j<a.length-i-1;j++)  
//              {
//                   if (a[j+1]>a[j])
//                   {
//                       int temp = a[j+1];  //
//                       a[j+1]=a[j];
//                       a[j]= temp;
//                   }
//              }
//         }
		
		
		
		
//		for (int i = 0; i < ranks.length; i++) 
//		{
//			if(ranks[i].getPlace() == i + 1)
//			{
//				System.out.println("rank : "+ranks[i].getPlace() + "----" + ranks[i].getSc().getChinese() + "-----" + ranks[i].getSc().getName());
//			}
//		}
	}
	
	public int[] getChineseArray() 
	{
		return chineseArray;
	}

	public int[] getEnglishArray() 
	{
		return englishArray;
	}

	public int[] getMathArray() 
	{
		return mathArray;
	}
}
