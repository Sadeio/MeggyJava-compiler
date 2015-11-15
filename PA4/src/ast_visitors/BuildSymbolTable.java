package ast_visitors;

import ast.node.*;
import ast.visitor.*;
import ast.visitor.DepthFirstVisitor;
import java.util.*;
import java.io.PrintWriter;
import symtable.SymTable;
import symtable.Type;
import symtable.STE;
import exceptions.InternalException;
import symtable.Signature;

public class AVRgenVisitor extends DepthFirstVisitor
{
	private SymTable mCurrentST;
	public int offset;
	public AVRgenVisitor(PrintWriter out, SymTable globalST) 
	{
	      //this.out = out;
	      mCurrentST = globalST;
  	}
 public void inMethodDecl(MethodDecl node)
    {
        String method_name = node.getName();
	Formal formal;
	STE ste = mCurrentST.lookup(method_name);
	if(ste != null)
	{
		throw new InternalException("Method already present");
	}
	Iterator iterator = node.getFormals().iterator();
        LinkedList<Type> formal_list = new LinkedList<Type>();
        while (iterator.hasNext()) {
            formal = (Formal)iterator.next();
            linkedList.add(this.getType(formal.getType()));
        }
	Signature sig_obj = new Signature(node.getType(), formal_list);
	Scope scope = new Scope(null);
	MethodSTE meth_obj = new MethodSTE(sig_obj, scope, node.getName());
	ste.mName = node.getName();
	mCurrentST.insert(ste);
	mCurrentST.pushScope(node.getName());
	this.offset = 1;
    }
  public void outFormal(Formal node)
    {
	String formal_name = node.getName();
	STE ste = mCurrentST.lookup();
	if(ste != null)
	{
		throw new InternalException("Formal already present");
	}
	VarSTE var_obj = new VarSTE(node.getName(), node.getType(), this.offset);
	//Increment offset based on type: TO DO
	STE ste = new STE();
	ste.mName = node.getName();
	mCurrent.insert(ste);
    }
  public void OutMethodDecl(MethodDecl node)
    {
	//TO DO: Store number of bytes needed for parameters as size of the method
    }
  
}
