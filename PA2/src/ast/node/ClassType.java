/* This file was generated by SableCC (http://www.sablecc.org/). 
 * Then modified.
 */

package ast.node;

import ast.visitor.*;

@SuppressWarnings("nls")
public final class ClassType extends IType
{
    private String _name_;

    public ClassType(int _line_, int _pos_, String _name_)
    {
        super(_line_, _pos_);
        
        setName(_name_);

    }

    @Override
    public int getNumExpChildren() { return 0; }
    
    @Override
    public Object clone()
    {
        return new ClassType(
                this.getLine(),
                this.getPos(),
                this._name_);
    }

    public void accept(Visitor v)
    {
        v.visitClassType(this);
    }

    public String getName()
    {
        return this._name_;
    }

    public void setName(String name)
    {
        this._name_ = name;
    }

    @Override
    void removeChild(Node child)
    {
        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(Node oldChild, Node newChild)
    {
        throw new RuntimeException("Not a child.");
    }
}