package BaseballGame;


	import java.io.BufferedReader; 

	 import java.io.IOException; 

	 import java.io.InputStreamReader; 

	 import java.util.Random; 

	 public class Baseball2 

	 { 

	   private int count; 

	   private int a, b, c = 0; 

	   String[] str = 

	   { 

	     "1", "2", "3", "4", "5", "6", "7", "8", "9" 

	  }; 

	  public Baseball2() 

	  {        

	 } 

	 public void mixNumber() 

	 { 

   count = 0; 

	   for(int j = 0; j < 9; j++) 

	  { 

	    String temp; 

	     Random r = new Random(); 

	     int k = r.nextInt(9); 

	    temp = str[k]; 

	     str[k] = str[j]; 

	     str[j] = temp; 

	  } 

	  a = Integer.parseInt(str[0]); 

	  b = Integer.parseInt(str[1]); 

	  c = Integer.parseInt(str[2]); 

	 } 

	 public void showNumber() 

	 { 

	   System.out.println(a + " " + b + " " + c); 

	 } 

	 public int[] readFromKeyboard() 

	 { 

	   String input = null; 

	   String inputNumber[] = new String[3]; 

	   int Number[] = new int[]{-1, -1, -1}; 

	   try 

	   { 

	     System.out.print("���� �Է�(��:3 5 7) : "); 

	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

	     input = br.readLine(); 

	     inputNumber = input.split(" ");//3���� ���ڸ�(���ڿ�) ���� 

	     if(inputNumber.length < 3)//�Է��� �߸����� ��� 

	     { 

	       return Number; 

	    } 

	    //���ڿ��� ���ڷ� ���� 

	    for(int i=0;i < 3;i++) 

	    Number[i] = Integer.parseInt(inputNumber[i]); 

	 } 

	 catch(Exception ex) 

	 { 

	 } 

	 count++;//�õ� Ƚ�� 

	 return Number;//�Է��� ���ڸ� ���� 

	 } 

	 public boolean Jugement() 

	 { 

	   int Number[] = readFromKeyboard(); 

	   int strike = 0, ball = 0; 

	   //���� ��ġ�� ���� ��ȣ��� ��Ʈ����ũ ���� 

	   if(a == Number[0]) 

	   strike++; 

	   if(b == Number[1]) 

	   strike++; 

	   if(c == Number[2]) 

	   strike++; 

	   //��Ʈ����ũ ��ġ�� �ƴ� �ٸ� ��ġ�� ���� ��ȣ��� �� ���� 

	   if(a == Number[1] || a == Number[2]) 

	   ball++; 

	   if(b == Number[0] || b == Number[2]) 

  ball++; 

	   if(c == Number[0] || c == Number[1]) 

	  ball++; 

	   System.out.println(strike + " Strike   "+ ball + " Ball"); 

   System.out.println("==================================="); 

	   if(strike == 3) 

	   { 

	     System.out.println(count + "�� ���� ����"); 

	     return true; 

	  } 

	  else 

	  return false; 

	 } 

	 public static void main(String str[]) throws IOException 

	 { 

	   Baseball2 test = new Baseball2();//��ü ���� 

	   while(true) 

	   {            

	     System.out.println("********���� ����*******"); 

	     test.mixNumber();//��ȣ ���� 

	     while(true) 

	     { 

	       //test.showNumber();//ġƮ 

	       if(test.Jugement() == true)//�� ���߸� ���� Ż�� 

	       break; 

	    } 

	    System.out.println("��� �Ͻðڽ��ϱ�?(y/n)"); 

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

	    if(br.readLine().equals("n")) 

	    break; 

	 } 

	 } 

 } 



