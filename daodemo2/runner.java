package daodemo2;

public class runner {
	public static void main(String [] args) throws Exception
	{
		StudentDAO s=new StudentDAOimpl();
		Student temp=s.getStudent(115);
		System.out.println(temp.getName()+"  "+temp.getAddress());
	}
}
