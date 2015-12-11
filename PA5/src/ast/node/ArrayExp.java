/* This file was generated by SableCC (http://www.sablecc.org/).  
 * Then modified.
 */
package ast.node;

import ast.visitor.*;

@SuppressWarnings("nls")
public final class ArrayExp extends IExp
{
    private IExp _exp_;
    private IExp _index_;

    public ArrayExp(int _line_, int _pos_, IExp _exp_, IExp _index_)
    {
        super(_line_, _pos_);
        
        setExp(_exp_);

        setIndex(_index_);

    }

    @Override
    public int getNumExpChildren() { return 2; }
    
    @Override
    public Object clone()
    {
        return new ArrayExp(
                this.getLine(),
                this.getPos(),
                cloneNode(this._exp_),
                cloneNode(this._index_));
    }

    public void accept(Visitor v)
    {
        v.visitArrayExp(this);
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

    public IExp getIndex()
    {
        return this._index_;
    }

    public void setIndex(IExp node)
    {
        if(this._index_ != null)
        {
            this._index_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._index_ = node;
    }

    @Override
    void removeChild(Node child)
    {
        // Remove child
        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._index_ == child)
        {
            this._index_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(Node oldChild, Node newChild)
    {
        // Replace child
        if(this._exp_ == oldChild)
        {
            setExp((IExp) newChild);
            return;
        }

        if(this._index_ == oldChild)
        {
            setIndex((IExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
