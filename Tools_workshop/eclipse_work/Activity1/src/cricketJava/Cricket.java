package cricketJava;
import java.util.*;

public class Cricket {
	
	private String name;
	private String playerScore;
	private float avg;
	private String[] strScore;
	private float[] actScore;
	private int count;
	Cricket(String name,String playerScore)
	{
		this.name=name;
		this.playerScore=playerScore;
		this.avg=0;
		strScore=new String[3];
		actScore=new float[3];
		count=0;
	}
	public void findAvg()
	{
		int i=0,count1=0;
		StringTokenizer Sc=new StringTokenizer(playerScore,",");
		while(Sc.hasMoreTokens())
		{
			strScore[i]=Sc.nextToken();
			System.out.println(strScore[i]);
			if(strScore[i].contains("*"))
			{
				count++;
			System.out.println(count);
			StringTokenizer Sc1=new StringTokenizer(strScore[i],"*");
			actScore[i]=Float.parseFloat(Sc1.nextToken());
			}
			else
				actScore[i]=Float.parseFloat(strScore[i]);
			i++;
			//System.out.println();
			//count1++;
		}
		System.out.println(count1);
		System.out.println(actScore[0]);
		System.out.println(actScore[1]);
		System.out.println(actScore[2]);
		if (count==3)
		{System.out.println("Average not possible");
		}
		else
		avg=(actScore[0]+actScore[1]+actScore[2])/(3-count);
		System.out.println("the average is "+avg);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the name of player");
		String name=scan.next();
		System.out.println("enter the score of player");
		String score=scan.next();
		Cricket obj1=new Cricket(name,score);
		obj1.findAvg();
	}

}
 