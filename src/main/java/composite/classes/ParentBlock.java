package composite.classes;

import composite.interfaces.Block;

public class ParentBlock implements Block
{
    protected String color;

    protected String material;

    public ParentBlock(String color, String material)
    {
        this.color = color;
        this.material = material;
    }

    @Override
    public String getColor()
    {
        return this.color;
    }

    @Override
    public String getMaterial()
    {
        return this.material;
    }
}
