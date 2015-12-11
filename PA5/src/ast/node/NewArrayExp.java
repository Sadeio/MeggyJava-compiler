/* This file was generated by SableCC (http://www.sablecc.org/). 
 * Then modified.
 */

package ast.node;

import ast.visitor.*;

@SuppressWarnings("nls")
public final class NewArrayExp extends IExp
{
    private IType _type_;
    private IExp _exp_;

    public NewArrayExp(int _line_, int _pos_, IType _type_, IExp _exp_)
    {
        super(_line_, _pos_);
        
        setType(_type_);
        setExp(_exp_);
    }

    @Override
    public int getNumExpChildren() { return 1; }
    
    @Override
    public Object clone()
    {
        return new NewArrayExp(
                this.getLine(),
                this.getPos(),
                cloneNode(this._type_), cloneNode(this._exp_));
    }

    @Override
    public void accept(Visitor v)
    {
        v.visitNewArrayExp(this);
    }

    public IType getType()
    {
        return this._type_;
    }

    public IExp getExp()
    {
        return this._exp_;
    }

    public void setExp(IExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    public void setType(IType node)
    {
        if(this._type_ != null)
        {
            this._type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._type_ = node;
    }

    @Override
    void removeChild(Node child)
    {
        // Remove child
        if(this._type_ == child)
        {
            this._type_ = null;
            return;
        }
        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(Node oldChild, Node newChild)
    {
        // Replace child
        if(this._type_ == oldChild)
        {
            setType((IType) newChild);
            return;
        }
        if(this._exp_ == oldChild)
        {
            setExp((IExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }

}
