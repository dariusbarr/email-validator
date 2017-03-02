
public class Email {
	String email;
	
	public Email(String email)
	{
		this.email=email;
	}
	
	public boolean atSign()
	{
		boolean result=false;
		for(int i=0;i<email.length();i++)
		{
			if(email.charAt(i)=='@')
			{
				result=true;
				
				break;
			}
			
		}
		
		if(result==false)
		System.out.println("@ sign not found");
		
		else System.out.println("@ sign found");
		return result;
	}
	
	public boolean period()
	{
		boolean result=false;
		for(int i=0;i<email.length();i++)
		{
			if(email.charAt(i)=='.')
			{
				result=true;
				
				break;
			}
			
		}
		
		if(result==false)
		System.out.println("'.' sign not found");
		
		else System.out.println("'.' sign found");
		return result;
	}
	
	

	}
