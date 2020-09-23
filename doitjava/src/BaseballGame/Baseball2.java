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

	     System.out.print("숫자 입력(예:3 5 7) : "); 

	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

	     input = br.readLine(); 

	     inputNumber = input.split(" ");//3개의 숫자를(문자열) 추출 

	     if(inputNumber.length < 3)//입력을 잘못했을 경우 

	     { 

	       return Number; 

	    } 

	    //문자열을 숫자로 변경 

	    for(int i=0;i < 3;i++) 

	    Number[i] = Integer.parseInt(inputNumber[i]); 

	 } 

	 catch(Exception ex) 

	 { 

	 } 

	 count++;//시도 횟수 

	 return Number;//입력한 숫자를 리턴 

	 } 

	 public boolean Jugement() 

	 { 

	   int Number[] = readFromKeyboard(); 

	   int strike = 0, ball = 0; 

	   //같은 위치에 같은 번호라면 스트라이크 증가 

	   if(a == Number[0]) 

	   strike++; 

	   if(b == Number[1]) 

	   strike++; 

	   if(c == Number[2]) 

	   strike++; 

	   //스트라이크 위치가 아닌 다른 위치에 같은 번호라면 볼 증가 

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

	     System.out.println(count + "번 만에 성공"); 

	     return true; 

	  } 

	  else 

	  return false; 

	 } 

	 public static void main(String str[]) throws IOException 

	 { 

	   Baseball2 test = new Baseball2();//객체 생성 

	   while(true) 

	   {            

	     System.out.println("********게임 시작*******"); 

	     test.mixNumber();//번호 섞기 

	     while(true) 

	     { 

	       //test.showNumber();//치트 

	       if(test.Jugement() == true)//다 맞추면 루프 탈출 

	       break; 

	    } 

	    System.out.println("계속 하시겠습니까?(y/n)"); 

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

	    if(br.readLine().equals("n")) 

	    break; 

	 } 

	 } 

 } 



