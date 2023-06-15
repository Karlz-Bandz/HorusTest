package composite.classes;

import composite.interfaces.Block;
import composite.interfaces.CompositeBlock;

import java.util.List;

public class ParentBlock implements CompositeBlock
{
    protected String color;

    protected String material;

    protected List<Block> blocks;

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

    @Override
    public List<Block> getBlocks()
    {
        return this.blocks;
    }
}
