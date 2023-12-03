package com.arun;

import java.util.Scanner;

public class QuestionService 
{
	
	Questions questions[]=new Questions[5];
	
	String selection[]=new String[5];
	
	public QuestionService()
	{
		questions[0]=new Questions(1,"Size of int","2","6","4","8","4");
		questions[1]=new Questions(2,"Size of short","2","6","4","8","2");
		questions[2]=new Questions(3,"Size of long","2","6","4","8","8");
		questions[3]=new Questions(4,"Size of byte","2","6","4","1","1");
		questions[4]=new Questions(5,"Size of char","2","6","4","8","2");
	}
	
	public void displayQuestions() 
	{
		for(int i=0;i<questions.length;i++)
		{
			System.out.println(questions[i].toString());
		}
	
	}
	
	public void quiz() 
	{
		for(int i=0;i<questions.length;i++)
		{
			System.out.println(questions[i].toString());
			System.out.println("Enter the Answer to Proceed Next");
			Scanner sc=new Scanner(System.in);
			selection[i]=sc.nextLine();	
		}
	}
	
	public void printScore()
	{
		int count=0;
		for (int i=0;i<questions.length;i++)
		{
			if(questions[i].getAnswer().equals(selection[i]))
			{
				count++;
			}
		}
		
		System.out.println("Your Score"+count);
	}
	

}
 