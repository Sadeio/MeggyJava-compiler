/* This file was generated by SableCC (http://www.sablecc.org/). 
 * Then modified.
 */

package ast.node;

import ast.visitor.Visitor;

@SuppressWarnings("nls")
public final class ToneLiteral extends ILiteral
{
    public ToneLiteral(int _line_, int _pos_, String _lexeme_, int _value_)
    {
        super(_line_, _pos_,_lexeme_,_value_);
    }

    @Override
    public int getNumExpChildren() { return 0; }
    
    @Override
    public Object clone()
    {
        return new ToneLiteral(
                this.getLine(),
                this.getPos(),
                this.getLexeme(),
                this.getIntValue());
    }

    public void accept(Visitor v)
    {
        v.visitToneLiteral(this);
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
