package symtable;

import java.util.*;
import java.util.HashMap;
import symtable.STE;
import symtable.ClassSTE;
import symtable.ValueSTE;

public class Scope
{
	public HashMap<String, STE> mHashMap = new HashMap();
    	public Scope mEnclosing;
	
	 public Scope(Scope scope) 
	{
	        this.mEnclosing = scope;
        }
	public STE lookup(String ste_name) 
	{
		if (mHashMap.containsKey(ste_name)) 
		{
		    return mHashMap.get(ste_name);
		}
		return null;
        }
	public void insert(STE ste) 
	{
		String name = ste.mName;
		boolean ste_status = ste instanceof ValueSTE;	
		boolean contains_key = mHashMap.containsKey(name);	
		if (!ste_status && contains_key) 
		{
		    throw new Exception("Redefined symbol " + name);
		}
		mHashMap.put(name, ste);
		
    	}
}
