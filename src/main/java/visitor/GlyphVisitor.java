package visitor;
import glyph.*;
import glyph.Character;

public class GlyphVisitor {

    public void visit(Glyph glyph){ }
    public void visit(Character character){ }
    public void visit(Rectangle rectangle){ }
    public void visit(Row row){ }
    public void visit(Column column){ }
    public void visit(Embellishment embellishment){ }
}
