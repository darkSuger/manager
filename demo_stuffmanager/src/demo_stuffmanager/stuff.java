package demo_stuffmanager;

import java.util.*;

public class stuff {
	private String name,sex;
	private int year,id;
	stuff()
	{
		name="defaut";
		sex="defaut";
		year=0;
		id=0;
	}
	public void set_stuff(int id)
	{
		this.id=id;
		Scanner in=new Scanner(System.in);
		System.out.print("please input name:");
		name=in.next();
		System.out.println(name+"`s ID is:"+id+"");
		System.out.print("please input sex:");
		sex=in.next();
	    System.out.print("please input year:");
		year=in.nextInt();
	}
	public void change_stuff()
	{
		Scanner in=new Scanner(System.in);
		System.out.print("please input name:");
		name=in.next();
		System.out.println(name+"`s ID is:"+id+"\n");
		System.out.print("please input sex:");
		sex=in.next();
	    System.out.print("please input year:");
		year=in.nextInt();
	}
	public void print()
	{
		System.out.println(name+"  "+id+"  "+sex+"  "+year);
	}
	public int get_id()
	{
		return id;
	}
	public String get_name()
	{
		return name;
	}
}
