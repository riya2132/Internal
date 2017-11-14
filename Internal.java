import java.io.*;
public class Internal {
	public static void main(String args[])
	{
		FileInputStream fin1 = null;
		try {
			FileOutputStream fout= new FileOutputStream("file2.txt");
			fin1=new FileInputStream("C:\\Users\\deepa\\eclipse-workspace\\File_Handling\\src\\file1.txt");
			int k,count=0,word=0,flag=0,j=0;
			String str=new String();
			char arr[]=new char[20];
			while((k=fin1.read())!=-1)
			{
			if((char)k==' ' && flag==0)
			{
				continue;
			}
			if(flag==1 && (char)k==' ')
			{
				flag=0;
				count=0;
				str+=' ';
				continue;
			}
			if(flag==0 && (char)k!=' ')
			{
				count++;
				flag=1;
				char ch=(char)k;
				if(ch=='z')
				{
					str+='a';
					continue;
				}
				str+=((char) (ch+count));
				continue;
			}
			if(flag==1 && (char)k!=' ')
			{
				count++;
				char d=(char)k;
				if(d=='z')
				{
					str+=('a'+count-1);
					continue;
				}
				str+=((char) (d+count));
			}
			}
			
			System.out.println(str);
			fout.write(str.getBytes());
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
