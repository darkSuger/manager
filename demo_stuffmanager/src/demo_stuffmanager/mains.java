/*
 人员管理
 1增加人员
 2删除人员
 3修改人员（修改名字，年龄，和性别）
 4查找人员（可通过ID或名字查找，因名字有可能重复，其他功能需要精确输入ID）
 5浏览名单（查看所有人的信息）
 */
package demo_stuffmanager;

import java.util.*;

public class mains {
	public static void main(String args[])
	{
		int id=1000;
		List <stuff> list=new ArrayList<stuff>();
		Scanner in=new Scanner(System.in);
		int i=0;
		//in.close();  为什么关闭会影响到后续输入？
		while(true)
		{
			System.out.println("-------------------------------\nthis is function:\n1.add 2.search 3.check all. 4.delete 5.change 6.exit");
			i=in.nextInt();
			System.out.println("-------------------------------");
			switch(i) {
			case 1:{
				stuff k=new stuff();
				k.set_stuff(id);
				list.add(k);
				id++;
				break;
			}
			case 2:{
				System.out.println("1.use ID 2.use NAME");
				int kk=in.nextInt();
				int get_id=-1;
				if(kk==1)
				{
				System.out.println("please input id");
				int ids=in.nextInt();
				get_id=search(ids,list);
				if(get_id==-1)
				{
					System.out.println("error");				
					break;
				}
				list.get(get_id).print();
				}else {
					System.out.println("please input name");
					String ids=in.next();
					get_id=search(ids,list);
					if(get_id==-1)
					{
						System.out.println("error");				
					}
					break;
				}
			}
			case 3:{
				System.out.println("name    ID    sex    year");
				for(i=0;i<list.size();i++)
				{
					list.get(i).print();					
				}
				break;
			}
			case 4:{
				System.out.println("please input id");
				int ids=in.nextInt();
				int get_id=search(ids,list);
				if(get_id<0)
				{
					if(get_id==-1)
					{
						System.out.println("error");				
						break;
					}
					get_id=-(get_id+5);
				}
				list.get(get_id).print();
				System.out.println("are you sure?\n1 is yes");
				int ii=in.nextInt();
				if(ii==1)
					list.remove(get_id);
				break;
			}
			case 5:{
				System.out.println("please input id");
				int ids=in.nextInt();
				int get_id=search(ids,list);
				if(get_id<0)
				{
					if(get_id==-1)
					{
						System.out.println("error");				
						break;
					}
					get_id=-(get_id+5);
				}
				System.out.println("befor data:");
				list.get(get_id).print();
				System.out.println("after data:");
				list.get(get_id).change_stuff();
				break;
			}
			case 6:{
				in.close();
				System.exit(0);
			}
			}
		}	
	}
	static public int search(int id,List<stuff> list)
	{
		int n=list.size();
		int i;
		for(i=0;i<n;i++)
		{
			stuff k=(stuff)list.get(i);
			if(k.get_id()==id)
				return i;
		}
		return -1;
	}
	static public int search(String name,List<stuff> list)
	{
		int n=list.size();
		int i,j=0;
		for(i=0;i<n;i++)
		{
			stuff k=(stuff)list.get(i);
			if(k.get_name().equals(name))
			{
				k.print();
				j++;
			}
		}
		if(j!=0)
			return 1;
		return -1;
	}
}
