import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Vector;
import java.util.LinkedList;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;


public class AList 
{
    Iterator it;
    ArrayList alist;
    Vector v;
    LinkedList link;
    LinkedHashSet linkedhash;
    TreeSet tset;
    Hashtable table;
    HashMap map;
    LinkedHashMap lmap;
    TreeMap tmap;
    Box b1,b2,b3;
    int i=10;
    
    
	public void CreateList()
	{
        
	  /*
		alist=new ArrayList();      //it is dynamically growable
        alist.add(new Integer(10));    
        alist.add(new Integer(20));
        alist.add(new Integer(30));
        alist.add(new Integer(40));
        alist.add(new Integer(50));
        alist.add(new Integer(50));
        alist.add(new String("java"));
        
        
        
	
       
		it=alist.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		*/
	 /*
		v=new Vector();
		v.add(new Integer(10));
        v.add(new Integer(20));
        v.add(new Integer(30));
        v.add(new Integer(40));
        v.add(new Integer(50));
        v.add(new Integer(10));
        v.add(new String("java"));              
    
       
		System.out.println("Vector Object");
		
		it=v.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
    */
		
	/*
		link=new LinkedList();
		link.add(new Integer(10));
		link.add(new Integer(20));
		link.add(new Integer(30));
		link.add(new Integer(40));
		link.add(new Integer(50));
		link.add(new Integer(10));
		link.add(new String("Rakesh"));
		link.add(new String("Kishore"));
		
		
	
		it=link.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	*/
	
		
		/* Set Interface implemented in LinkedHashset*/
		
		/*
		linkedhash=new LinkedHashSet();
		linkedhash.add(new Integer(10));       //equals() hashcode()
		linkedhash.add(new Integer(20));
		linkedhash.add(new Integer(30));
		linkedhash.add(new Integer(40));
		linkedhash.add(new Integer(40));
		linkedhash.add(new Integer(40));
		
		
		it=linkedhash.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		*/
		/* Sorted Set interface implemented in TreeSet*/
		
		/*
		tset=new TreeSet();
		tset.add(new Integer(20));
		tset.add(new Integer(40));
		tset.add(new Integer(10));
		tset.add(new Integer(30));
		tset.add(new Integer(10));
		tset.add(new Integer(40));
		tset.add(new Integer(10));
		
	
		
		it=tset.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		*/
		
		/*
		HashSet hs=new HashSet();
		hs.add(new Integer(10));
		hs.add(new Integer(20));
	    hs.add(new Integer(30));
	    hs.add(new Integer(10));
	    //hs.add(new String("JAVA"));
	    
	    it=hs.iterator();
	    
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
		*/
	
	/*
		table=new Hashtable();
		table.put("1006","Rakesh");
		table.put("1002","kishore");
		table.put("1008","mohan");
		table.put("1010","venkat");
		table.put("1010","satish");
	    table.put("1014","satish");
	 */
		//table.put(null,null);
	   
	   /*
	       Set s1=table.keySet();		
		   it=s1.iterator();
		   while(it.hasNext())
		   {
			   //System.out.println(it.next());
			   System.out.println(table.get(it.next()));
		   }
	    */
	  
		/* 
		   Collection c=table.values();
		   it=c.iterator();
		 
		   while(it.hasNext())
		   {
			   System.out.println(it.next());
		   }
		 
		*/
	  
		/*
	    map=new HashMap();
		map.put("1002","Rakesh");
		map.put("1004","kishore");
		map.put("1006","Naveen");
		map.put("1008","Srikanth");
		map.put("1010","Mohan");
		map.put("1010","Rakesh");
		map.put(null, null);
		*/
		 
		/*
		   Set s=map.keySet();	
		   
		   it=s.iterator();
		   
		   while(it.hasNext())
		   {
			   System.out.println(map.get(it.next()));
		   }
		
		*/
		   /*
		   Collection c=map.values();
		   it=c.iterator();
		  
		   while(it.hasNext())
		   {
			   //System.out.println("Values") ;
			   System.out.println(it.next());
		   }
		 */
		
		
		
		/*
		lmap=new LinkedHashMap();
		lmap.put("1002","Rakesh");
		lmap.put("1004","kishore");
		lmap.put("1006","mahesh");
		lmap.put("1008","david");
		lmap.put("1010","mohan");
		lmap.put("1010","lakshmi");
		lmap.put(null,"srikanth");		
		lmap.put(null,"dinesh");	
		
		
		 Set s=lmap.keySet();		
		 
		 it=s.iterator();
		 
		 
		 while(it.hasNext())
		 {
			   System.out.println(lmap.get(it.next()));
			  // System.out.println(it.next());
		 }
	 */
	
		
		/*
		tmap=new TreeMap();
		tmap.put("1004","Rakesh");
		tmap.put("1002","Mahesh");
		tmap.put("1008","Kishore");
		tmap.put("1006","Mohan");
		tmap.put("1010","Kishore");
		tmap.put("1002","Rajesh");
		//tmap.put(null, null);
	
		
		Set s=tmap.keySet();		
		it=s.iterator();
		 
		 
		 while(it.hasNext())
		 {
			   System.out.println(tmap.get(it.next()));
			  //System.out.println(it.next());
		 }
	*/
		
		
		
		
		alist=new ArrayList();
		b1=new Box(10,20,30);
		b2=new Box(20,20,20);
		b3=new Box(30,20,10);
		alist.add(b1);
		alist.add(b2);
		alist.add(b3);
		
		it=alist.iterator();
		
		while(it.hasNext())
		{
			Box b=(Box)it.next();
			System.out.println("Length:"+b.getLength());
			System.out.println("Breadth:"+b.getBreadth());
			System.out.println("Height:"+b.getHeight());
		}
		
		
	
		
		
	}
	public void ShowList()
	{
      	
		/*
           Set s=tmap.keySet();		
		   it=s.iterator();
		   while(it.hasNext())
		   {
			   System.out.println(tmap.get(it.next()));
			 
		   }
		  
		*/
		
		
      	
		/*
		System.out.println("Index based Display");
		
		for(int i=0;i<alist.size();i++)
		{
			System.out.println(alist.get(i));
		}
		
		*/
	
	
	 
		
	
	/*
		it=tset.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	
	*/
		
	/*
		   Set s=table.keySet();		
		   Iterator it1=s.iterator();
		*/
		
		/*
		   while(it1.hasNext())
		   {

			   //System.out.print(it1.next()+"   ");
			   String key=(String)it1.next();
			   //System.out.println("Key:"+key);
			   System.out.println("value:"+table.get(key));
		   }
	 */
		
	
		
		   
		
		
	
		/*
		   while(it.hasNext())
		   {
			   System.out.println(map.get(it.next()));
			//   System.out.println(it.next());
		   }
		
		*/
		
		
	

		
		
		
	
		
		
		
		
		
		
	}
	
	
	
    public static void main(String args[])
    {
    	AList l=new AList();
    	l.CreateList();
    	l.ShowList();
     }
}
