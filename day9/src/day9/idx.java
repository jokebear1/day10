package day9;

public class idx {
	public static void main(String[] args) {
		
		int[] score= {7,30,40,50,60,80};
		
		for(int i=0; i<6; i++) //�ִ밪ã��for��
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
				
			}//�� ��ü
			int tepm=score[i];
			score[i]=score[change];
			score[change]= tepm;
			
		}
		for(int i=0; i<6; i++)
		{
		System.out.print(score[i]+ " "); //�� ���
		}
	}

}
