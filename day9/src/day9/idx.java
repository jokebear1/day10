package day9;

public class idx {
	public static void main(String[] args) {
		
		int[] score= {7,30,40,50,60,80};
		
		for(int i=0; i<6; i++) //최대값찾는for문
		{
			int max=score[i]; 
			int change=i; 
			
			for(int j=0; j<6; j++) //
			{
				if(max<score[j]) 
				{
				  max=score[j];
				  change=j;
				}
				
			}//값 교체
			int tepm=score[i];
			score[i]=score[change];
			score[change]= tepm;
			
		}
		for(int i=0; i<6; i++)
		{
		System.out.print(score[i]+ " "); //값 출력
		}
	}

}
