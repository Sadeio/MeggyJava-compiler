package symtable;
import java.util.*;
import ast.node.*;

import exceptions.InternalException;
import symtable.Scope;

/** 
 * SymTable
 * ....
 * The symbol table also keeps a mapping of expression nodes to
 * types because that information is needed elsewhere especially
 * when looking up method call information.
 * 
 * @author mstrout
 * WB: Simplified to only expression types
 */
public class SymTable {
    private final HashMap<Node,Type> mExpType = new HashMap<Node,Type>();
    public final Stack<Scope> mStackScope = new Stack();
    public final Scope mGlobalScope = new Scope(null);

    public SymTable() {
	this.mStackScope.push(mGlobalScope);
    }
    
    /** Lookup a symbol in this symbol table.
     * Starts looking in innermost scope and then
     * look in enclosing scopes.
     * Returns null if the symbol is not found.
     */
    public STE lookup(String sym) {
        /* WRITE ME */
	Scope innermostScope = this.mStackScope.peek();
	return innermostScope.lookup(sym);
    }
 
    /** When inserting an STE will just insert
     * it into the scope at the top of the scope stack.
     */
    public void insert( STE ste) {
        Scope deepestScope = this.mStackScope.peek();
	deepestScope.insert(ste);
    }
    
    /** 
     * Lookup the given method scope and make it the innermost
     * scope.  That is, make it the top of the scope stack.
     */
    public void pushScope(String id) {
        /* WRITE ME */
	STE ste = this.lookup(id);
	boolean meth_instance = ste instanceof MethodSTE;
	boolean classSTE_instance = ste instanceof ClassSTE;
	if(!meth_instance || !classSTE_instance)
	{
		throw new Exception("Scope not found");
	}
	if(meth_instance)
	{
		MethodSTE meth_ste = (MethodSTE)ste;
		this.mStackScope.push(meth_ste.mScope);
	}
	if(classSTE_instance)
	{
		ClassSTE class_ste = (ClassSTE)ste;
		this.mStackScope.push(class_ste.mScope);
	}
	
    }
    
    public void popScope() {
        /* WRITE ME */
	this.mStackScope.pop();
    }
	
    public void setExpType(Node exp, Type t)
    {
    	this.mExpType.put(exp, t);
    }
    
    public Type getExpType(Node exp)
    {
    	return this.mExpType.get(exp);
    }
   
/*
 */

}
